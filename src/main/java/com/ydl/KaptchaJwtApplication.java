package com.ydl;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@MapperScan("com.ydl.mapper")
@ServletComponentScan(basePackages = "com.ydl.config.MyFilter")
public class KaptchaJwtApplication {

    public static void main(String[] args) {
        SpringApplication.run(KaptchaJwtApplication.class, args);
    }

}
