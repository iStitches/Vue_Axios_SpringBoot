package com.xjx.router.dao;


import com.xjx.router.pojo.User;

import java.util.List;

public interface UserDao {
    public void addUser(User user);
    public void deleteUser(Integer id);
    public void updateUser(User user);
    public List<User> getAllUser();
}
