package com.gnng.service;

import com.gnng.event.UserRegisterEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Service;

/**
 * @ClassName MessageService
 * @Description TODO
 * @Author gn
 * @Date 2019/12/27 16:46
 * @Version 1.0
 */

@Service
public class MessageService  implements ApplicationListener<UserRegisterEvent> {

    @Override
    public void onApplicationEvent(UserRegisterEvent event) {
        System.out.println("短信服务收到通知，给"+event.getSource()+"发短信......");
    }
}
