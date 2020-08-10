package com.case1.demo.dao;

import com.case1.demo.pojo.User;

import java.util.List;

public interface UserDao {
    //查询所有
    public List<User> getAll();

    //根据姓名或电话号码模糊查询
    public List<User> findByNameAndPhone(String username,String phoneCode);

    //保存用户信息
    public void saveUser(User user);

    //删除用户信息
    public void deleteUser(Integer id);

    //查询某一个用户的信息
    public User findOneUser(Integer id);

    //更新用户信息
    public void updateUser(User user);
}
