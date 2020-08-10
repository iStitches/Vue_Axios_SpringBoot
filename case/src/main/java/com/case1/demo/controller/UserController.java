package com.case1.demo.controller;

import com.case1.demo.pojo.Msg;
import com.case1.demo.pojo.User;
import com.case1.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("user")
public class UserController {
     @Autowired
    UserService service;

     //查询所有
     @CrossOrigin
     @GetMapping("/findAll")
     public List<User> getAll(){
         List<User> all = service.getAll();
         return all;
     }

     //保存或者更新用户信息
    @CrossOrigin
    @PostMapping("/saveUser")
    public Msg saveUser(@RequestBody User user){
        try {
            if(user.getId()==null) {   //id为空时保存用户
               service.saveUser(user);
            }
            else{
               service.updateUser(user);
            }
            return Msg.success();
        } catch (Exception e){
            e.printStackTrace();
            return Msg.error();
        }
    }

    //删除用户信息
    @CrossOrigin
    @GetMapping("/deleteUser")
    public Msg deleteUser(Integer id){
        try {
            service.deleteUser(id);
            return Msg.success();
        } catch (Exception e) {
            e.printStackTrace();
            return Msg.error();
        }
    }

    //修改用户信息时进行用户查询
    @CrossOrigin
    @GetMapping("/findOneUser")
    public User findOneUser(Integer id){
        try {
            User oneUser = service.findOneUser(id);
            return oneUser;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    //根据用户名或者电话号码进行模糊查询
    @CrossOrigin
    @PostMapping("/vagueSearch")
    public List<User> vagueSearch(@RequestBody Map<String,String> map){
        try {
            List<User> byNameAndPhone = service.findByNameAndPhone(map.get("username"), map.get("telephone"));
            return byNameAndPhone;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
