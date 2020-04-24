package com.gnng;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName Application
 * @Description TODO
 * @Author gn
 * @Date 2019/6/25 15:13
 * @Version 1.0
 */

@SpringBootApplication
@MapperScan("com.gnng.sys.mapper")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }

}
