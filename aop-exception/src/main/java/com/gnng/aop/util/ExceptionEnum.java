package com.gnng.aop.util;

/**
 * @ClassName ExceptionEnum
 * @Description 返回数据
 * @Author gn
 * @Date 2019/8/1 17:13
 * @Version 1.0
 */
public enum ExceptionEnum {

    /**
     * 未知错误
     */
    UNKNOW_ERROR(-1, "未知错误"),
    /**
     * 用户不存在
     */
    USER_NOT_FIND(-101, "用户不存在"),
    ;

    private Integer code;

    private String msg;

    ExceptionEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

}
