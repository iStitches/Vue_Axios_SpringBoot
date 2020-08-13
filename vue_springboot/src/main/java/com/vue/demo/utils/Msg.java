package com.vue.demo.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class Msg {
    private Integer code;
    private String message;
    private Map<String,Object> data;

    public static Msg success(){
        Msg msg = new Msg();
        msg.setCode(200);
        msg.setMessage("响应成功");
        return msg;
    }

    public static Msg failure(){
        Msg msg=new Msg();
        msg.setCode(400);
        msg.setMessage("响应失败");
        return msg;
    }

    public Msg addData(String key,Object value){
        this.getData().put(key,value);
        return this;
    }

}
