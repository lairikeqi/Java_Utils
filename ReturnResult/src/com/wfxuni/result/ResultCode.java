package com.wfxuni.result;

public enum ResultCode {

    // ...
    SUCCESS("200", "成功"),

    FAIL("205", "操作失败"),

    SUCCESS_IS_HAVE("208", "数据已存在"),

    NOT_DATA("911", "没有结果"),

    NOT_LOGIN("600", "没有登录"),

    EXCEPTION("401", "发生异常"),

    SYS_ERROR("402", "系统错误"),

    PARAMS_ERROR("403", "参数错误"),

    NOT_SUPPORTED("410", "不支持或已经废弃"),

    INVALID_AUTHCODE("444", "无效的AuthCode"),

    TOO_FREQUENT("445", "太频繁的调用"),

    UNKNOWN_ERROR("499", "未知错误"),

    NOT_METHOD("4004", "未设置方法");

    private String val;
    private String msg;

    private ResultCode(String value, String msg) {
        this.val = value;
        this.msg = msg;
    }

    public String getVal() {
        return val;
    }

    public String getMsg() {
        return msg;
    }

}