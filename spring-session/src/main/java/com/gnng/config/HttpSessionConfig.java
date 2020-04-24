package com.gnng.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.session.data.redis.config.ConfigureRedisAction;
import org.springframework.session.data.redis.config.annotation.web.http.RedisHttpSessionConfiguration;

/**
 * @ClassName HttpSessionConfig
 * @Description TODO
 * @Author gn
 * @Date 2020/1/7 14:32
 * @Version 1.0
 */

@Configuration
//@EnableRedisHttpSession(maxInactiveIntervalInSeconds=20)
public class HttpSessionConfig extends RedisHttpSessionConfiguration {

    //session超时时间，单位为秒
    @Value("${spring.redis.session.timeout}")
    private int sessionTimeout;

    @Override
    public void init() {
        super.init();
        // 设置超时时间,在注解上添加不是很灵活
        super.setMaxInactiveIntervalInSeconds(sessionTimeout);
    }

    /**
     * 防止启动时keyspace notifications（过期通知事件）报错
     * @return
     */
    @Bean
    ConfigureRedisAction configureRedisAction() {
        return ConfigureRedisAction.NO_OP;
    }
}
