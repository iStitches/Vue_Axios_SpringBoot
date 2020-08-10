package com.case1.demo.service;

import com.case1.demo.pojo.User;

import java.util.List;

public interface UserService {
    public List<User> getAll();
    public List<User> findByNameAndPhone(String username,String phoneCode);
    public void saveUser(User user);
    public void deleteUser(Integer id);
    public User findOneUser(Integer id);
    public void updateUser(User user);
}
