package com.gnng.aop.handle;

import com.gnng.aop.util.DescribeException;
import com.gnng.aop.util.ExceptionEnum;
import com.gnng.aop.util.ResponseResult;
import com.gnng.aop.util.ResponseUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName ExceptionHandle
 * @Description TODO
 * @Author gn
 * @Date 2019/8/1 17:21
 * @Version 1.0
 */

@ControllerAdvice
@Slf4j
public class ExceptionHandle {

    /**
     * 判断错误是否是已定义的已知错误，不是则由未知错误代替，同时记录在log中
     * @param e
     * @return
     */
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public ResponseResult exceptionGet(Exception e){
        if(e instanceof DescribeException){
            DescribeException MyException = (DescribeException) e;
            return ResponseUtil.error(MyException.getCode(),MyException.getMessage());
        }
        log.error("【系统异常】{}",e);
        return ResponseUtil.error(ExceptionEnum.UNKNOW_ERROR);
    }

}
