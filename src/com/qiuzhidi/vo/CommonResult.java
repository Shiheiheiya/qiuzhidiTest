package com.qiuzhidi.vo;
//返回数据的Json格式
public class CommonResult<T> {

    private int code;//状态码
    private String message;//状态信息
    private T data;//传回的数据

    public CommonResult() {
    }

    public CommonResult(String message) {
        this.code = 200;
        this.message = message;
    }

    public CommonResult(String message, T data) {
        this.code = 200;
        this.message = message;
        this.data = data;
    }

    public CommonResult(int code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
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
}
