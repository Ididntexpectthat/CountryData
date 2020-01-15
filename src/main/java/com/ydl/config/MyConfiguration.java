package com.ydl.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Auther: ydl
 * @Date: 2019-11-00 21:25
 * @Description: 添加对跨域访问的支持
 */
@Configuration
public class MyConfiguration implements WebMvcConfigurer  {

// @Bean
// public WebMvcConfigurer corsConfigurer(){
//  // 重写父类提供的跨域请求处理的接口
//  return new WebMvcConfigurer() {
//   @Override
//   public void addCorsMappings(CorsRegistry registry) {
//    // 添加映射路径
//    registry.addMapping("/**")
//            // 允许哪些域名来跨域来请求当前资源,可以使用通配符 *
//            .allowedOrigins("*")
//            // 允许客户端请求携带的请求头
//            .allowedHeaders("*")
//            // 允许客户端访问的响应头
//            .exposedHeaders("Origin, X-Requested-With,Content-Type,Accept,Authorization,Content-Type, Connection, User-Agent, Cookie,ctoken,captcha,username,pagenum,pageCount,message")
//            // 允许客户端跨域请求的请求方式
//            .allowedMethods("*")
//            // 允许客户端请求提交cookie
//            .allowCredentials(true)
//            // 预检测缓存时间
//            .maxAge(3600);
//    // test
//   }
//
//  };
//
// }
 /**
  * 资源映射路径
  */
  @Override
  public void addResourceHandlers(ResourceHandlerRegistry registry) {
   registry.addResourceHandler("/upload/**").addResourceLocations("file:D:/code/upload/");
//   super.addResourceHandler(registry);
  }

}
