package com.xupt.mybatis.junit;

import java.io.InputStream;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.xupt.mybatis.pojo.User;



public class MybatisFirstTest {
	
	//通过ID查询用户
	@Test
	public void testMybatis() throws Exception{
		//加载核心配置文件
		String resource="sqlMapConfig.xml";
		InputStream in=Resources.getResourceAsStream(resource);
		//创建SqlSessionFactory
		SqlSessionFactory sqlSessionFactory=(SqlSessionFactory) new SqlSessionFactoryBuilder().build(in);
		//创建SqlSession
		SqlSession sqlSession=sqlSessionFactory.openSession();
		System.out.print("djwid");
		//执行sql语句
		User user = sqlSession.selectOne("test.findUserById",1);
		
		System.out.println(user);
		
		sqlSession.close();
		
	}

	
	//通过姓名模糊查询
	@Test
	public void testfindUserByUsername() throws Exception{
		//加载核心配置文件
		String resource="sqlMapConfig.xml";
		InputStream in=Resources.getResourceAsStream(resource);
		//创建SqlSessionFactory
		SqlSessionFactory sqlSessionFactory=(SqlSessionFactory) new SqlSessionFactoryBuilder().build(in);
		//创建SqlSession
		SqlSession sqlSession=sqlSessionFactory.openSession();
		System.out.print("djwid");
		//执行sql语句
		List<User> user = sqlSession.selectList("test.findUserByUsername","五");
		
		System.out.println(user);
		
		sqlSession.close();
		
	}
	
	//添加用户
	@Test
	public void testInsertUser() throws Exception{
		//加载核心配置文件
		String resource="sqlMapConfig.xml";
		InputStream in=Resources.getResourceAsStream(resource);
		//创建SqlSessionFactory
		SqlSessionFactory sqlSessionFactory=(SqlSessionFactory) new SqlSessionFactoryBuilder().build(in);
		//创建SqlSession
		SqlSession sqlSession=sqlSessionFactory.openSession();
		System.out.print("djwid");
		
		//执行sql语句
		User user =new User();
		user.setUsername("大锤");
		user.setBirthday(new Date());
		user.setAddress("西安市");
		user.setSex("男");
		int i = sqlSession.insert("test.insertUser", user);
		sqlSession.commit();
		
		System.out.println(user.getId());
	}
	
	//更新用户
		@Test
		public void testUpdateUser() throws Exception{
			//加载核心配置文件
			String resource="sqlMapConfig.xml";
			InputStream in=Resources.getResourceAsStream(resource);
			//创建SqlSessionFactory
			SqlSessionFactory sqlSessionFactory=(SqlSessionFactory) new SqlSessionFactoryBuilder().build(in);
			//创建SqlSession
			SqlSession sqlSession=sqlSessionFactory.openSession();
			System.out.print("djwid");
			
			//执行sql语句
			User user =new User();
			user.setId(28);
			user.setUsername("猎鸟");
			user.setBirthday(new Date());
			user.setAddress("长沙市");
			user.setSex("女");
			int i = sqlSession.update("test.updateUserById", user);
			sqlSession.commit();
			
			System.out.println(user.getId());
		}
		
		//删除用户
		@Test
		public void deleteUser() throws Exception{
			//加载核心配置文件
			String resource="sqlMapConfig.xml";
			InputStream in=Resources.getResourceAsStream(resource);
			//创建SqlSessionFactory
			SqlSessionFactory sqlSessionFactory=(SqlSessionFactory) new SqlSessionFactoryBuilder().build(in);
			//创建SqlSession
			SqlSession sqlSession=sqlSessionFactory.openSession();
			System.out.print("djwid");
			
			//执行sql语句
			
			int i = sqlSession.update("test.deleteUserById", 28);
			sqlSession.commit();
		}
		
		
}
