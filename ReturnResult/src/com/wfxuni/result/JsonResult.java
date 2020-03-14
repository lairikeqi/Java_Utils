package com.wfxuni.result;

public class JsonResult<T> {

    private String code;
    private String message;
    private T data;

    public JsonResult() {
        this.setCode(ResultCode.SUCCESS);
        this.setMessage("成功! ");
    }

    public JsonResult(ResultCode code) {
        this.setCode(code);
        this.setMessage(code.getMsg());
    }

    public JsonResult(ResultCode code, String message, T data) {
        this.setCode(code);
        this.setMessage(message);
        this.setData(data);
    }

    public String getCode() {
        return code;
    }

    public void setCode(ResultCode code) {
        this.code = code.getVal();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "JsonResult{" +
                "code='" + code + '\'' +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
