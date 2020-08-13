package com.vue.demo;

import com.vue.demo.dao.UserDao;
import com.vue.demo.entity.User;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
class DemoApplicationTests {

    @Autowired
    UserDao dao;

    @Test
    void contextLoads() {
        User byId = dao.findById(1);
        System.out.println(byId);
    }

}
