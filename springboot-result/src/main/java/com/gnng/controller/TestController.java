package com.gnng.controller;

import com.gnng.aonotation.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gn
 * @version 1.0
 * @desc TODO
 * @className springboot-TsetController
 * @createTime 2020/4/23 18:23
 */

@Slf4j
@RestController
@Result
public class TestController {

    @GetMapping("/test")
    public String test(){
        log.info("test response result");
        return "hello";
    }
}
