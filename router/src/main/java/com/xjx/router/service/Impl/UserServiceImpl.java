package com.xjx.router.service.Impl;

import com.xjx.router.dao.UserDao;
import com.xjx.router.pojo.User;
import com.xjx.router.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao dao;

    @Override
    public void addUser(User user) {

    }

    @Override
    public void deleteUser(Integer id) {

    }

    @Override
    public void updateUser(User user) {

    }

    @Override
    public List<User> getAllUser() {
        return dao.getAllUser();
    }
}
