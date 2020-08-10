package com.case1.demo;

import com.case1.demo.dao.UserDao;
import com.case1.demo.pojo.User;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
class DemoApplicationTests {
	@Autowired
	UserDao dao;

	@Test
	void contextLoads() {
		List<User> list = dao.findByNameAndPhone("xiao", "");
		System.out.println(list);
	}
}
