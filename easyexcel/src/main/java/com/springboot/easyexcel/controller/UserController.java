package com.springboot.easyexcel.controller;

import com.springboot.easyexcel.bean.User;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

    public List<User> getAllUser(){
        List<User> userList = new ArrayList<>();
        for (int i=0;i<1000;i++){
            User user = User.builder().name("张三"+ i).password("1234").age(i).build();
            userList.add(user);
        }
        return userList;
    }
}
