package com.hotnews.ssm.dto;

/**
 * Created by AnonymousH on 2017/9/22.
 */
public class ResponsTemplate<T> {

    private T data ;

    private int code ;

    private String msg ;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
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

    @Override
    public String toString() {
        return "ResponsTemplate{" +
                "data=" + data +
                ", code=" + code +
                ", msg='" + msg + '\'' +
                '}';
    }
}
