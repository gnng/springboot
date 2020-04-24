package com.gnng.service;

import com.gnng.event.UserRegisterEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Service;

/**
 * @ClassName EmailService
 * @Description TODO
 * @Author gn
 * @Date 2019/12/27 16:14
 * @Version 1.0
 */

@Service
public class ZEmailService implements ApplicationListener<UserRegisterEvent> {


    @Override
    public void onApplicationEvent(UserRegisterEvent event) {
        System.out.println("邮件服务收到通知，给"+event.getSource()+"发送邮件......");
    }
}
