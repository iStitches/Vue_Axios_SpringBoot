package com.vue.demo.dao;


import com.vue.demo.entity.User;

import java.util.List;

public interface UserDao {
    public void insertUser(User user);
    public void deleteUser(Integer id);
    public void updateUser(User user);
    public List<User> findAllUsers();
    public User findById(Integer id);
}
