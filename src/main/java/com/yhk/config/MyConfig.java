package com.yhk.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * @program: springboot01
 * @author: YHK
 * @create: 2021-10-31 21:18
 **/
@Configuration
@ComponentScan("com.yhk")
@EnableWebMvc
public class MyConfig {

    @Bean
    public InternalResourceViewResolver viewResolver(){
        //配置视图解析器
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        //设置前缀
        viewResolver.setPrefix("/WEB-INF/views/");
        //设置后缀
        viewResolver.setSuffix(".jsp");
        return viewResolver;
    }
}
