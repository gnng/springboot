package com.gnng.aop.util;

import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName Result
 * @Description TODO
 * @Author gn
 * @Date 2019/8/1 17:01
 * @Version 1.0
 */

@Data
public class ResponseResult<T> implements Serializable {

    private static final long serialVersionUID = 2353045691877624739L;
    /**
     *编码
     */
    private Integer code;

    /**
     * 信息
     */
    private String msg;

    /**
     * 返回数据
     */
    private T content;
}
