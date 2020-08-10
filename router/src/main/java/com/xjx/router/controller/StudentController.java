package com.xjx.router.controller;

import com.xjx.router.pojo.Student;
import com.xjx.router.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("student")
public class StudentController {
    @Autowired
    StudentService service;

    @CrossOrigin
    @ResponseBody
    @GetMapping("/getAllStudent")
    public List<Student> findAllStudent(){
        return service.getAllStudent();
    }
}
