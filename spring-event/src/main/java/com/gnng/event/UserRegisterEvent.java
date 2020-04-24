package com.gnng.event;

import org.springframework.context.ApplicationEvent;

/**
 * @ClassName UserRegisterEvent
 * @Description TODO
 * @Author gn
 * @Date 2019/12/27 16:07
 * @Version 1.0
 */

/**
 * 监听事件调用顺序通过类名区分优先级
 */
public class UserRegisterEvent extends ApplicationEvent {

    /**
     * Create a new ApplicationEvent.
     *
     * @param userName the object on which the event initially occurred (never {@code null})
     */
    public UserRegisterEvent(String userName) {
        super(userName);
    }
}
