package com.xupt.mybatis.junit;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xupt.mybatis.mapper.UserMapper;
import com.xupt.mybatis.pojo.UserExample;


public class JunitTest {
	
	@Test
	public void testMapper() throws Exception {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		UserMapper userMappper = ac.getBean(UserMapper.class);
		UserExample example=new UserExample();
		example.createCriteria().andSexEqualTo("1");
		
		int countByExample = userMappper.countByExample(example);
		System.out.println(countByExample);
	}

}
