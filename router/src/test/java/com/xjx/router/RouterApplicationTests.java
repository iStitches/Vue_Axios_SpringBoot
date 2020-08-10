package com.xjx.router;

import com.xjx.router.dao.StudentDao;
import com.xjx.router.dao.UserDao;
import com.xjx.router.pojo.Student;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
class RouterApplicationTests {
	@Autowired
	UserDao dao;
	@Autowired
	StudentDao studentDao;

	@Test
	void contextLoads() {
		List<Student> allStudent = studentDao.getAllStudent();
		System.out.println(allStudent);
	}

}
