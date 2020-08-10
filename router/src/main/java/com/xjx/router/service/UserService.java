package com.xjx.router.service;


import com.xjx.router.pojo.User;

import java.util.List;

public interface UserService {
    public void addUser(User user);
    public void deleteUser(Integer id);
    public void updateUser(User user);
    public List<User> getAllUser();
}
