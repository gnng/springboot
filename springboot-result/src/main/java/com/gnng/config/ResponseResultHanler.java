package com.gnng.config;

import com.gnng.aonotation.Result;
import com.gnng.constant.ResponseConstant;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

import javax.servlet.http.HttpServletRequest;

/**
 * @author gn
 * @version 1.0
 * @desc TODO
 * @className springboot-ResponseResultHanler
 * @createTime 2020/4/23 19:07
 */

@Slf4j
@ControllerAdvice
public class ResponseResultHanler implements ResponseBodyAdvice<Object> {

    @Override
    public boolean supports(MethodParameter returnType, Class converterType) {
        ServletRequestAttributes sre = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = sre.getRequest();
        // 判断请求是否包含 响应标记
        Result result = (Result) request.getAttribute(ResponseConstant.RESPONSE_RESULT_ANM);
        return result == null ? false : true;
    }

    @Override
    public Object beforeBodyWrite(Object body, MethodParameter returnType, MediaType selectedContentType, Class<? extends HttpMessageConverter<?>> selectedConverterType, ServerHttpRequest request, ServerHttpResponse response) {
        log.info("正在处理返回体...{}", body);
        // 有问题  com.gnng.util.ResponseResult cannot be cast to java.lang.String
//        ResponseResult responseResult = new ResponseResult(body);
//        return responseResult;
        return body;
    }
}
