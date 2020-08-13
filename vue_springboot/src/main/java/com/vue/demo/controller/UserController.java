package com.vue.demo.controller;

import com.vue.demo.dao.UserDao;
import com.vue.demo.entity.User;
import com.vue.demo.utils.Msg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserDao dao;

    /**
     * 查找所有用户信息
     * @param page
     * @param rows
     * @return
     */
    @CrossOrigin
    @GetMapping("/findAll")
    @ResponseBody
    public Map<String,Object> findAll(Integer page, Integer rows){
        HashMap<String,Object> map = new HashMap<>();
        List<User> allUsers = dao.findAllUsers();
        map.put("total",12);
        map.put("totalPage",2);
        map.put("results",allUsers);
        return map;
    }

    /**
     *  新增一个用户
     * @param user
     * @return
     */
    @CrossOrigin
    @PostMapping("/addUser")
    public Map<String,Object> addUser(@RequestBody User user){
        Map<String, Object> map = new HashMap<>();
        try {
            dao.insertUser(user);
            map.put("msg",Msg.success());
        } catch (Exception e) {
            e.printStackTrace();
            map.put("msg",Msg.failure());
        }
        return map;
    }

    /**
     *  删除一个用户
     * @param id
     * @return
     */
    @CrossOrigin
    @GetMapping("/delUser")
    public Map<String,Object> delUser(Integer id){
        Map<String,Object> map=new HashMap<>();
        try {
            dao.deleteUser(id);
            map.put("msg",Msg.success());
        } catch (Exception e) {
            e.printStackTrace();
            map.put("msg",Msg.failure());
        }
        return map;
    }

    /**
     * 根据用户ID查找某个用户
     * @param id
     * @return
     */
    @CrossOrigin
    @GetMapping("/findOne")
    public User findById(Integer id){
        User byId = dao.findById(id);
        return byId;
    }

    /**
     * 更新某个用户信息
     * @param user
     * @return
     */
    @CrossOrigin
    @PostMapping("/updateUser")
    public Map<String,Object> updateUser(@RequestBody  User user){
        Map<String,Object> map=new HashMap<>();
        try {
            dao.updateUser(user);
            map.put("msg",Msg.success());
        } catch (Exception e) {
            e.printStackTrace();
            map.put("msg",Msg.failure());
        }
        return map;
    }
}
