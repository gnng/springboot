package com.gnng.util;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author gn
 * @version 1.0
 * @desc TODO
 * @className springboot-ResponseT
 * @createTime 2020/4/23 18:25
 */

public class ResponseResult<T> implements Serializable {

    private static final long serialVersionUID = 85142650236632103L;

    public static final int SUCCESS_CODE = 200;
    public static final int FAIL_CODE = 500;

    public static final ResponseResult<String> SUCCESS = new ResponseResult<String>(null);
    public static final ResponseResult<String> FAIL = new ResponseResult<String>(FAIL_CODE, null);


    private int code;
    private String msg;
    private T content;
    private String url;

    public ResponseResult() {
    }

    public ResponseResult(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public ResponseResult(String url, T content) {
        this.code = SUCCESS_CODE;
        this.content = content;
        this.url = url;
    }

    public ResponseResult(T content) {
        this.code = SUCCESS_CODE;
        this.msg = "成功！";
        this.content = content;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "ResponseT [code=" + code + ", msg=" + msg + ", content=" + content + "]";
    }


    public static int[] intersection(int[] nums1, int[] nums2) {
        int length = nums1.length > nums2.length ? nums2.length : nums1.length;
        int[] array = new int[length];
        int count = 0;
        boolean flag = false;
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    for (int i1 : array) {
                        if (i1 == nums1[i]) {
                            flag = true;
                            break;
                        }
                    }
                    if (flag) {
                        flag = false;
                        continue;
                    }
                    array[count] = nums1[i];
                    count++;
                }
            }
        }
        int[] ints = Arrays.copyOf(array, count);
        System.out.println(Arrays.toString(ints));
        List<Integer> list = new ArrayList<>();
        for (int i : array) {
            if (!list.contains(i)) {
                list.add(i);
            }
        }
        int[] array1 = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array1[i] = list.get(i);
        }
        return array1;
    }

}
