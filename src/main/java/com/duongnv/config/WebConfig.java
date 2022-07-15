package com.duongnv.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.duongnv")
public class WebConfig extends WebMvcConfigurerAdapter {

//    @Bean
//    public ViewResolver viewResolver() {
//        InternalResourceViewResolver
//                resolver = new InternalResourceViewResolver();
//        resolver.setSuffix(".jsp");
//        resolver.setPrefix(("/WEB-INF/views/"));
//        return resolver;
//    }
}
