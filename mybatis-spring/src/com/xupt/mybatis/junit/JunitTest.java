package com.xupt.mybatis.junit;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xupt.mybatis.mapper.UserMapper;
import com.xupt.mybatis.pojo.User;

public class JunitTest {
	
	@Test
	public void testMapper() throws Exception {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserMapper mapper = ac.getBean(UserMapper.class);
//		UserMapper mapper = (UserMapper) ac.getBean("userMapper");
		User user = mapper.findUserById(10);
		System.out.println(user);
		
	}

}
