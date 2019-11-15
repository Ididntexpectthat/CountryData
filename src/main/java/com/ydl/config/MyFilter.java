//package com.ydl.config;
//
//import org.apache.tomcat.util.http.parser.Authorization;
//import org.springframework.http.HttpHeaders;
//import org.springframework.stereotype.Component;
//
//import javax.servlet.*;
//import javax.servlet.annotation.WebFilter;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
//@Component
//@WebFilter(urlPatterns = "/*",filterName = "allFilter")
//public class MyFilter implements Filter {
//    @Override
//    public void init(FilterConfig filterConfig) throws ServletException {
//        System.out.println("----------------------->过滤器被创建");
//    }
//
//    @Override
//    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
//        System.out.println("进入到过滤器");
//        HttpServletRequest request = (HttpServletRequest) servletRequest;
//        HttpServletResponse response = (HttpServletResponse) servletResponse;
//        response.setHeader("Access-Control-Allow-Origin", "*");
//        response.setHeader("Access-Control-Allow-Methods", "*");
//        response.setHeader("Access-Control-Allow-Credentials","true");
//        response.setHeader("Access-Control-Max-Age", "3600");
//        response.setHeader("Access-Control-Allow-Headers", "*");
//        response.addHeader(HttpHeaders.ACCESS_CONTROL_EXPOSE_HEADERS,"Origin, X-Requested-With,Content-Type,Accept,Authorization,Content-Type,Content-Length, Connection, User-Agent, Cookie,ctoken,captcha,username,pagenum,pageCount,message");
//    }
//
//    @Override
//    public void destroy() {
//        System.out.println("----------------------->过滤器被销毁");
//
//    }
//}
