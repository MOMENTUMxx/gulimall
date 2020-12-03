package com.atguigu.common.exception;

/**
 * @author wlj Email:wanglujiexx@gmail.com
 * @version 1.0
 * @description .
 * @date 2020/11/27 下午8:06
 */
public enum BizCodeEnum {

    UNKNOWN_EXCEPTION(10000, "系统未知异常"),
    VALID_EXCEPTION(10001, "参数格式校验失败");

    private int code;
    private String msg;

    BizCodeEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
