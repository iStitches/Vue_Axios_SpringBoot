package com.xjx.router.controller;

import com.xjx.router.pojo.User;
import com.xjx.router.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService service;

    @CrossOrigin
    @GetMapping("/getAll")
    public List<User> getAllUser(){
        return service.getAllUser();
    }

    @CrossOrigin
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
}
