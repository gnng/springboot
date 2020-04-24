package com.gnng.config;

import com.gnng.aonotation.Result;
import com.gnng.constant.ResponseConstant;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;

/**
 * @author gn
 * @version 1.0
 * @desc TODO
 * @className springboot-ResponseInterceptor
 * @createTime 2020/4/23 18:20
 */

@Component
public class ResponseInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(final HttpServletRequest request, final HttpServletResponse response, final Object handler) throws Exception {
        // 请求方法
        if (handler instanceof HandlerMethod) {
            HandlerMethod handlerMethod = (HandlerMethod) handler;
            Class<?> clazz = handlerMethod.getBeanType();
            Method method = handlerMethod.getMethod();
            // 判断是否在类对象上面添加指定注解
            if(clazz.isAnnotationPresent(Result.class)){
                // 设置此注解的返回体 需要包装 往下传递，在ResponseBodyAdvice进行判断处理
                request.setAttribute(ResponseConstant.RESPONSE_RESULT_ANM,clazz.getAnnotation(Result.class));
            }else if (method.isAnnotationPresent(Result.class)){
                // 判断方法上是否有此注解
                request.setAttribute(ResponseConstant.RESPONSE_RESULT_ANM,method.getAnnotation(Result.class));
            }
        }
        return true;
    }
}
