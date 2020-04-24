package com.gnng.aop.controller;

import com.gnng.aop.bean.UserInfo;
import com.gnng.aop.handle.ExceptionHandle;
import com.gnng.aop.util.ExceptionEnum;
import com.gnng.aop.util.ResponseResult;
import com.gnng.aop.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName ResultController
 * @Description TODO
 * @Author gn
 * @Date 2019/8/1 19:13
 * @Version 1.0
 */
@RestController
@RequestMapping("/result")
public class ResultController {
    @Autowired
    private ExceptionHandle exceptionHandle;

    /**
     * 返回体测试
     *
     * @param name
     * @param pwd
     * @return
     */
    @RequestMapping(value = "/getResult")
    public ResponseResult getResult(@RequestParam("name") String name, @RequestParam("pwd") String pwd) {
        ResponseResult result = ResponseUtil.success();
        try {
            if ("gnng".equals(name)) {
                result = ResponseUtil.success(new UserInfo());
            } else if ("nnnn".equals(name)) {
                result = ResponseUtil.error(ExceptionEnum.USER_NOT_FIND);
            } else {
                int i = 1 / 0;
            }
        } catch (Exception e) {
            result = exceptionHandle.exceptionGet(e);
        }
        return result;
    }
}
