package com.xupt.mybatis.junit;

import static org.junit.Assert.*;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.xupt.mybatis.mapper.OrderMapper;
import com.xupt.mybatis.mapper.UserMapper;
import com.xupt.mybatis.pojo.Orders;
import com.xupt.mybatis.pojo.QueryVo;
import com.xupt.mybatis.pojo.User;

public class MybatisMapperTest {

	
	@Test
	public void testMapper() throws Exception {
		//���غ��������ļ�
		String resource = "sqlMapConfig.xml";
		InputStream in = Resources.getResourceAsStream(resource);
		//����SqlSessionFactory
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
		//����SqlSession
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
		//SqlSEssion��������һ��ʵ����  �����ӿڣ�
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		
		
		User user = userMapper.findUserById(10);
		System.out.println(user);
	}
	
	/*@Test
	public void testMapperQueryVo() throws Exception {
		//���غ��������ļ�
		String resource = "sqlMapConfig.xml";
		InputStream in = Resources.getResourceAsStream(resource);
		//����SqlSessionFactory
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
		//����SqlSession
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
		//SqlSEssion��������һ��ʵ����  �����ӿڣ�
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		QueryVo vo =new QueryVo();
		User user =new User();
		user.setUsername("��");
		vo.setUser(user);
		
		
		List<User> us = userMapper.findUserByQueryVo(vo);
		for (User u : us) {
			System.out.println(u);			
		}
	}*/
	
	@Test
	public void testMapperCountUser() throws Exception {
		//���غ��������ļ�
		String resource = "sqlMapConfig.xml";
		InputStream in = Resources.getResourceAsStream(resource);
		//����SqlSessionFactory
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
		//����SqlSession
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
		//SqlSEssion��������һ��ʵ����  �����ӿڣ�
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		
		
		Integer i = userMapper.countUser();
		System.out.println(i);
	}
	/*
	//��ѯ��������������
	@Test
	public void testSelectOrders() throws Exception {
		//���غ��������ļ�
		String resource = "sqlMapConfig.xml";
		InputStream in = Resources.getResourceAsStream(resource);
		//����SqlSessionFactory
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
		//����SqlSession
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
		//SqlSEssion��������һ��ʵ����  �����ӿڣ�
		OrderMapper mapper = sqlSession.getMapper(OrderMapper.class);
		
		 List<Orders> ordersList = mapper.selectOrdersList();
		for (Orders orders : ordersList) {
			System.out.println(orders);
		}
	}*/
	
	
}
