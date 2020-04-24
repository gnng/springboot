package com.gnng.aop.util;

/**
 * @ClassName ResponseUtil
 * @Description 返回的工具类
 * @Author gn
 * @Date 2019/8/1 17:15
 * @Version 1.0
 */
public class ResponseUtil {

    /**
     * 返回成功，传入返回体具体出參
     * @param object
     * @return
     */
    public static ResponseResult success(Object object){
        ResponseResult result = new ResponseResult();
        result.setCode(0);
        result.setMsg("success");
        result.setContent(object);
        return result;
    }

    /**
     * 提供给部分不需要出參的接口
     * @return
     */
    public static ResponseResult success(){
        return success(null);
}

    /**
     * 自定义错误信息
     * @param code
     * @param msg
     * @return
     */
    public static ResponseResult error(Integer code,String msg){
        ResponseResult result = new ResponseResult();
        result.setCode(code);
        result.setMsg(msg);
        result.setContent(null);
        return result;
    }

    /**
     * 返回异常信息，在已知的范围内
     * @param exceptionEnum
     * @return
     */
    public static ResponseResult error(ExceptionEnum exceptionEnum){
        ResponseResult result = new ResponseResult();
        result.setCode(exceptionEnum.getCode());
        result.setMsg(exceptionEnum.getMsg());
        result.setContent(null);
        return result;
    }

}
