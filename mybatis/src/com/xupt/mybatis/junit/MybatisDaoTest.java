package com.xupt.mybatis.junit;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.xupt.mybatis.dao.UserDao;
import com.xupt.mybatis.dao.UserDaoImpl;
import com.xupt.mybatis.pojo.User;

public class MybatisDaoTest {
	
	private SqlSessionFactory sqlSessionFactory;
	
	@Before
	public void before() throws Exception{
		//加载核心配置文件
		String resource="sqlMapConfig.xml";
		InputStream in=Resources.getResourceAsStream(resource);
		//创建SqlSessionFactory
		sqlSessionFactory=(SqlSessionFactory) new SqlSessionFactoryBuilder().build(in);
	}
	
	@Test
	public void testDao() throws Exception{
		UserDao userDao=new UserDaoImpl(sqlSessionFactory);
		User user = userDao.selectUserById(10);
		System.out.println(user);
	}

}
