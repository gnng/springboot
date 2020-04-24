package com.gnng;

import com.gnng.config.ResponseInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author gn
 * @version 1.0
 * @desc TODO
 * @className springboot-AppApplication
 * @createTime 2020/4/23 18:16
 */

@SpringBootApplication
public class AppApplication implements WebMvcConfigurer {

    public static void main(String[] args) {
        SpringApplication.run(AppApplication.class, args);
    }

    @Autowired
    ResponseInterceptor responseInterceptor;

    @Override
    public void addInterceptors(final InterceptorRegistry registry) {
        // 配置拦截器
        registry.addInterceptor(responseInterceptor).addPathPatterns("/**");
    }
}
