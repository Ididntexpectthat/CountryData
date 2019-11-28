package com.ydl.interceptor;


import com.alibaba.fastjson.JSONObject;
import com.ydl.annotation.PassToken;
import com.ydl.config.JsonXMLUtils;
import com.ydl.entity.Token;
import com.ydl.entity.User;
import com.ydl.service.TokenService;
import com.ydl.service.UserService;
import com.ydl.utils.HttpHelper;
import com.ydl.utils.RequestWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.method.HandlerMethod;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@Component
@WebFilter(urlPatterns = "/*", filterName = "HttpServletRequestReplacedFilter")
public class HttpServletRequestReplacedFilter implements Filter {
    @Autowired
    UserService userService;
    @Autowired
    StringRedisTemplate redisTemplate;
    @Autowired
    TokenService tokenService;
    private static final String[] excludePathPatterns = {"/Captcha/getCaptcha", "/User/login","/User/register","/Department/getAllDepartment", "/Pic/upload","/User/exitLogin","/Files/upload", "/upload/"};

    @Override
    public void destroy() {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response,
                         FilterChain chain) throws IOException, ServletException {
//        System.out.println("我进来了");
//        System.out.println(HttpHelper.getBodyString((HttpServletRequest) request));
//                设置允许跨域访问
        HttpServletResponse res = (HttpServletResponse) response;
        res.setHeader("Access-Control-Allow-Origin", "*");
        res.setHeader("Access-Control-Allow-Methods", "*");
        res.setHeader("Access-Control-Max-Age", "3600");
        // 允许客户端访问的响应头
        res.addHeader(HttpHeaders.ACCESS_CONTROL_EXPOSE_HEADERS, "Origin, X-Requested-With,Content-Type,Accept,Authorization,Content-Type, Connection, User-Agent, Cookie,ctoken,captcha,username,pagenum,pageCount,message");
        // 允许客户端请求携带的请求头
        res.setHeader("Access-Control-Allow-Headers", "Origin, X-Requested-With,Content-Type,Accept,Authorization,Content-Type, Connection, User-Agent, Cookie,ctoken,captcha,username,pagenum");
        String url = ((HttpServletRequest) request).getServletPath();
        System.out.println("url:" + url);
        ServletRequest requestWrapper = null;
        Map<String, String> mapError = new HashMap<>();
        // 如果不是映射到方法直接通过
        for (String page : excludePathPatterns) {
            System.out.println("page:" + page);
            if (url.equals(page)) {
//                System.out.println("允许通过");
                //放行，相当于第一种方法中LoginInterceptor返回值为true
                chain.doFilter(request, response);
            }
            //头像获取通过
            if(url.length()>=8){
                if (page.equals(excludePathPatterns[excludePathPatterns.length - 1]) && page.equals(url.substring(0, 8))) {
                    chain.doFilter(request, response);
                }
            }
            if (page.equals(excludePathPatterns[excludePathPatterns.length - 1]) && !url.equals(page)) {
                if (request instanceof HttpServletRequest) {
                    System.out.println("我在这里");
                    requestWrapper = new RequestWrapper((HttpServletRequest) request);
                    String s = HttpHelper.getBodyString((HttpServletRequest) requestWrapper);
                    try {
                        Map<String, Object> map = JsonXMLUtils.json2map(s);
                        Token token1 = JsonXMLUtils.map2obj((Map<String, Object>) map.get("token"), Token.class);
                        System.out.println("token" + token1.getToken());
                        String token = token1.getToken();
                        String username = token1.getUsername();
                        if (StringUtils.isEmpty(token)) {
                            mapError.put("message", "token不能为空，请输入token进行验证！");
//                            throw new RuntimeException("token不能为空，请输入token进行验证！");
                            response.setCharacterEncoding("utf-8");
                            response.getWriter().print(JSONObject.toJSON(mapError));
                            response.getWriter().close();

                        }
                        if (StringUtils.isEmpty(username)) {
                            mapError.put("message", "username不能为空，请输入username进行验证");
//                            throw new RuntimeException("username，请输入username进行验证！");
                            response.setCharacterEncoding("utf-8");
                            response.getWriter().print(JSONObject.toJSON(mapError));
                            response.getWriter().close();
                        }
                        // 执行认证
//                        System.out.println("token" + token);

                        long time = redisTemplate.getExpire(username);
                        String redistoken = redisTemplate.opsForValue().get(username);
//                        System.out.println("剩余时间/s:" + time);
//                        System.out.println("redistoken:" + redistoken);
//                        System.out.println(StringUtils.isEmpty(redistoken) || !redistoken.equals(token));
                        if (StringUtils.isEmpty(redistoken) || !redistoken.equals(token)) {
                            mapError.put("message", "登录失效");
//                            throw new RuntimeException("登录失效");
                            response.setCharacterEncoding("utf-8");
                            response.getWriter().print(JSONObject.toJSON(mapError));
                        }
                        if (!StringUtils.isEmpty(redistoken) && redistoken.equals(token)) {
//                        String Newtoken = UUID.randomUUID().toString().replaceAll("-", "");
                            tokenService.redisSaveToken(username, redistoken, 60);
//                            System.out.println("校验成功");
                            chain.doFilter(requestWrapper, response);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    @Override
    public void init(FilterConfig arg0) throws ServletException {

    }
}
