package com.gnng.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @author gn
 * @desc TODO
 * @className InvokeRequest
 * @createTime 2020/3/19 15:50
 */

@Service
public class InvokeRequest {

    @Async("threadPool")
    public void test1() throws InterruptedException {
        TimeUnit.SECONDS.sleep( 10 );
        System.out.println("执行测试1......."+Thread.currentThread().getName());
    }

    @Async("threadPool")
    public void test2() throws InterruptedException {
        TimeUnit.SECONDS.sleep( 20 );
        System.out.println("执行测试2......."+Thread.currentThread().getName());
    }

    @Async
    public void test3() throws InterruptedException {
        TimeUnit.SECONDS.sleep( 10 );
        System.out.println("执行测试3......."+Thread.currentThread().getName());
    }


}
