package com.gnng.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author gn
 * @desc 配置自定义线程池
 * @className ThreadPoolConfig
 * @createTime 2020/3/19 16:03
 */

@Configuration
@EnableAsync
public class ThreadPoolConfig implements AsyncConfigurer {

    @Bean
    public Executor threadPool() {
        return new ThreadPoolExecutor(5, 5, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue<>(10));
    }

    @Autowired
    Executor threadPool;

    @Override
    public Executor getAsyncExecutor() {
        return threadPool;
    }
}
