package com.gnng;

import com.gnng.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName EventDemoApp
 * @Description TODO
 * @Author gn
 * @Date 2019/12/27 16:15
 * @Version 1.0
 */

@SpringBootApplication
@RestController
public class EventDemoApp {

    public static void main(String[] args) {
        SpringApplication.run(EventDemoApp.class);
    }

    @Autowired
    private UserService userService;

    @RequestMapping("/regist")
    public String regist(){
        userService.regist("gnng");
        return "success";
    }


}
