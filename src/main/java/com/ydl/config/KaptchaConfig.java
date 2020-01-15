package com.ydl.config;

import com.google.code.kaptcha.impl.DefaultKaptcha;
import com.google.code.kaptcha.util.Config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Properties;

/**
 * @author sjm
 * @date 2018-10-26
 * 生成验证码的配置
 */
@Configuration
public class KaptchaConfig {
    @Bean
    public DefaultKaptcha producer(){
        Properties properties = new Properties();
        // 图片边框
        properties.setProperty("kaptcha.border", "yes");
        // 边框颜色
        properties.setProperty("kaptcha.border.color", "105,179,90");
        // 字体颜色
        properties.setProperty("kaptcha.textproducer.font.color", "black");
        // 图片宽
        properties.setProperty("kaptcha.image.width", "110");
        // 图片高
        properties.setProperty("kaptcha.image.height", "40");
        // 字体大小
        properties.setProperty("kaptcha.textproducer.font.size", "30");
        //图片样式
        properties.setProperty("kaptcha.obscurificator.impl","com.google.code.kaptcha.impl.ShadowGimpy");
        //设置文字间隔
        properties.setProperty("kaptcha.textproducer.char.space","5");
        // session key
        properties.setProperty("kaptcha.session.key", "code");
        // 验证码长度
        properties.setProperty("kaptcha.textproducer.char.length", "4");
        //设置干扰线
        properties.put("kaptcha.noise.impl","com.google.code.kaptcha.impl.NoNoise");
//        //干扰线颜色
//        properties.setProperty("kaptcha.noise.color","210,180,140");
        //设置字体
        properties.setProperty("kaptcha.textproducer.font.names", "宋体");
        //设置背景颜色渐变,开始颜色
        properties.setProperty("kaptcha.background.clear.from","255,192,203");
        //设置背景颜色渐变,结束颜色
        properties.setProperty("kaptcha.background.clear.to","255,192,203");
        Config config = new Config(properties);
        DefaultKaptcha defaultKaptcha = new DefaultKaptcha();
        defaultKaptcha.setConfig(config);
        return defaultKaptcha;
    }
}

