package com.gnng.service;

import com.gnng.event.UserRegisterEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Service;

/**
 * @ClassName UserService
 * @Description TODO
 * @Author gn
 * @Date 2019/12/27 16:08
 * @Version 1.0
 */

@Service
public class UserService implements ApplicationEventPublisherAware {

    private ApplicationEventPublisher applicationEventPublisher;

    public void regist(String userName){
        System.out.println("用户"+userName+"已注册！");
        applicationEventPublisher.publishEvent(new UserRegisterEvent(userName));
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }
}
