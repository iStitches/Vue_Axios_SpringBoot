package com.case1.demo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class User implements Serializable {
    private Integer id;
    private String name;
    private Integer age;
    private Double salary;
    private String phone;

    public User(String name, int age, double salary, String phone) {
        this.name=name;
        this.age=age;
        this.salary=salary;
        this.phone=phone;
    }
}
