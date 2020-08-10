package com.case1.demo.pojo;

import java.util.Map;

public class Msg {
    private Integer code;
    private String message;
    private Map<String,Object> data;

    public static Msg success(){    //成功返回
        Msg msg = new Msg();
        msg.setCode(200);
        msg.setMessage("数据处理成功");
        return msg;
    }

    public static Msg error(){    //成功返回
        Msg msg = new Msg();
        msg.setCode(500);
        msg.setMessage("数据处理异常");
        return msg;
    }

    public Msg addData(String name,Object value){
        this.getData().put(name,value);
        return this;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Map<String, Object> getData() {
        return data;
    }

    public void setData(Map<String, Object> data) {
        this.data = data;
    }

}
