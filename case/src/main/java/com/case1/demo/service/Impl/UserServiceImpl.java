package com.case1.demo.service.Impl;

import com.case1.demo.dao.UserDao;
import com.case1.demo.pojo.User;
import com.case1.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional  //控制事务
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao dao;

    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)   //只读型事务
    @Override
    public List<User> getAll() {
        return dao.getAll();
    }

    @Override
    public List<User> findByNameAndPhone(String username, String phoneCode) {
        return dao.findByNameAndPhone(username,phoneCode);
    }

    @Override
    public void saveUser(User user) {
        dao.saveUser(user);
    }

    @Override
    public void deleteUser(Integer id) {
        dao.deleteUser(id);
    }

    @Override
    public User findOneUser(Integer id) {
        return dao.findOneUser(id);
    }

    @Override
    public void updateUser(User user) {
        dao.updateUser(user);
    }
}
