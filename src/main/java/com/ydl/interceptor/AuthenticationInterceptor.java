package com.ydl.interceptor;

import com.alibaba.fastjson.JSONObject;
import com.ydl.annotation.PassToken;
import com.ydl.annotation.UserLoginToken;
import com.ydl.service.TokenService;
import com.ydl.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.util.StringUtils;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;


/**
 * @author jinbin
 * @date 2018-07-08 20:41
 */
public class AuthenticationInterceptor implements HandlerInterceptor {
    @Autowired
    UserService userService;
    @Autowired
    StringRedisTemplate redisTemplate;
    @Autowired
    TokenService tokenService;

    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object object) throws Exception {
//        httpServletResponse.setHeader("Access-Control-Allow-Origin", "*");
//        httpServletResponse.addHeader("Access-Control-Allow-Headers", "message");
//        httpServletResponse.addHeader("Access-Control-Allow-Headers", "Origin, X-Requested-With,Content-Type,Accept,captcha,pagenum,pageCount,message,ctoken,*");
        //设置允许跨域访问
//        httpServletResponse.setHeader("Access-Control-Allow-Origin", "*");
//        httpServletResponse.setHeader("Access-Control-Allow-Methods", "*");
//        httpServletResponse.setHeader("Access-Control-Max-Age", "3600");
//        httpServletResponse.setHeader("Access-Control-Allow-Headers", "Origin, X-Requested-With,Content-Type,Accept,Authorization,Content-Type, Connection, User-Agent, Cookie,ctoken,captcha,username,pagenum,pageCount,message");
//        response.setHeader("Access-Control-Allow-Headers", "Origin, X-Requested-With, Authorization,"
//                + " Content-Type, Accept, Connection, User-Agent, Cookie");
        String token = httpServletRequest.getHeader("token");// 从 http 请求头中取出 token
        String username = httpServletRequest.getHeader("username");
        JSONObject jsonObject = new JSONObject();
        System.out.println(username);
        // 如果不是映射到方法直接通过

        if (!(object instanceof HandlerMethod)) {
            return true;
        }
        HandlerMethod handlerMethod = (HandlerMethod) object;
        Method method = handlerMethod.getMethod();
        //检查是否有passtoken注释，有则跳过认证
        if (method.isAnnotationPresent(PassToken.class)) {
            PassToken passToken = method.getAnnotation(PassToken.class);
            if (passToken.required()) {
                System.out.println("我进来了");
                return true;
            }
        }
        //检查有没有需要用户权限的注解
        if (method.isAnnotationPresent(UserLoginToken.class)) {
            UserLoginToken userLoginToken = method.getAnnotation(UserLoginToken.class);
            if (userLoginToken.required()) {
                if (StringUtils.isEmpty(token)) {
//                    jsonObject.put("message","token不能为空，请输入token进行验证！");
//                    return false;
                    throw new RuntimeException("token不能为空，请输入token进行验证！");
                }
                if (StringUtils.isEmpty(username)) {
//                    return  false;
                    throw new RuntimeException("username，请输入username进行验证！");
                }
                // 执行认证
                System.out.println("token" + token);

                long time = redisTemplate.getExpire(username);
                System.out.println("剩余时间/s:"+time);
                String redistoken = redisTemplate.opsForValue().get(username);
                System.out.println("redistoken:" + redistoken);
                System.out.println(StringUtils.isEmpty(redistoken) || !redistoken.equals(token));
                if (StringUtils.isEmpty(redistoken) || !redistoken.equals(token)) {
//                    System.out.println("登录失效，请重新登录！");
                    throw new RuntimeException("登录失效");
                }
                try {
                    if (!StringUtils.isEmpty(redistoken) && redistoken.equals(token)) {
//                        String Newtoken = UUID.randomUUID().toString().replaceAll("-", "");
                        tokenService.redisSaveToken(username, redistoken, 60);
                        System.out.println("校验成功");
                        return true;
                    }
                } catch (Exception e) {
//                    return false;
                    throw new RuntimeException("未知错误,请与作者联系！");
                }
            }
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
