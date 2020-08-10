package com.xjx.router.service.Impl;

import com.xjx.router.dao.StudentDao;
import com.xjx.router.pojo.Student;
import com.xjx.router.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentDao dao;

    @Override
    public List<Student> getAllStudent() {
        return dao.getAllStudent();
    }
}
