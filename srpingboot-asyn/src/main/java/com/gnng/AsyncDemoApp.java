package com.gnng;

import com.gnng.service.InvokeRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gn
 * @desc TODO
 * @className asyn
 * @createTime 2020/3/19 15:45
 */

@SpringBootApplication
@RestController
public class AsyncDemoApp {

    public static void main(String[] args) {
        SpringApplication.run(AsyncDemoApp.class,args);
    }

    @Autowired
    InvokeRequest invokeRequest;

    @RequestMapping("/asyncRequest")
    public void asyncRequest() throws InterruptedException {
        System.out.println("开始执行....");
        invokeRequest.test1();
        invokeRequest.test2();
        invokeRequest.test3();
        System.out.println("执行完成....");
    }
}
