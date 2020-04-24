package com.gnng.dubbo.service;

import com.alibaba.dubbo.config.annotation.Service;

@Service(version = "1.0.0",timeout = 10000,interfaceClass = UserService.class)
public class UserServiceImpl implements UserService {
    @Override
    public String sayHello(String msg) {
        System.out.println("服务端");
        return "hello "+msg;
    }
}
