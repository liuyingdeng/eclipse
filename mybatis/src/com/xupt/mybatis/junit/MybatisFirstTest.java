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
	
	//ͨ��ID��ѯ�û�
	@Test
	public void testMybatis() throws Exception{
		//���غ��������ļ�
		String resource="sqlMapConfig.xml";
		InputStream in=Resources.getResourceAsStream(resource);
		//����SqlSessionFactory
		SqlSessionFactory sqlSessionFactory=(SqlSessionFactory) new SqlSessionFactoryBuilder().build(in);
		//����SqlSession
		SqlSession sqlSession=sqlSessionFactory.openSession();
		System.out.print("djwid");
		//ִ��sql���
		User user = sqlSession.selectOne("test.findUserById",1);
		
		System.out.println(user);
		
		sqlSession.close();
		
	}

	
	//ͨ������ģ����ѯ
	@Test
	public void testfindUserByUsername() throws Exception{
		//���غ��������ļ�
		String resource="sqlMapConfig.xml";
		InputStream in=Resources.getResourceAsStream(resource);
		//����SqlSessionFactory
		SqlSessionFactory sqlSessionFactory=(SqlSessionFactory) new SqlSessionFactoryBuilder().build(in);
		//����SqlSession
		SqlSession sqlSession=sqlSessionFactory.openSession();
		System.out.print("djwid");
		//ִ��sql���
		List<User> user = sqlSession.selectList("test.findUserByUsername","��");
		
		System.out.println(user);
		
		sqlSession.close();
		
	}
	
	//����û�
	@Test
	public void testInsertUser() throws Exception{
		//���غ��������ļ�
		String resource="sqlMapConfig.xml";
		InputStream in=Resources.getResourceAsStream(resource);
		//����SqlSessionFactory
		SqlSessionFactory sqlSessionFactory=(SqlSessionFactory) new SqlSessionFactoryBuilder().build(in);
		//����SqlSession
		SqlSession sqlSession=sqlSessionFactory.openSession();
		System.out.print("djwid");
		
		//ִ��sql���
		User user =new User();
		user.setUsername("��");
		user.setBirthday(new Date());
		user.setAddress("������");
		user.setSex("��");
		int i = sqlSession.insert("test.insertUser", user);
		sqlSession.commit();
		
		System.out.println(user.getId());
	}
	
	//�����û�
		@Test
		public void testUpdateUser() throws Exception{
			//���غ��������ļ�
			String resource="sqlMapConfig.xml";
			InputStream in=Resources.getResourceAsStream(resource);
			//����SqlSessionFactory
			SqlSessionFactory sqlSessionFactory=(SqlSessionFactory) new SqlSessionFactoryBuilder().build(in);
			//����SqlSession
			SqlSession sqlSession=sqlSessionFactory.openSession();
			System.out.print("djwid");
			
			//ִ��sql���
			User user =new User();
			user.setId(28);
			user.setUsername("����");
			user.setBirthday(new Date());
			user.setAddress("��ɳ��");
			user.setSex("Ů");
			int i = sqlSession.update("test.updateUserById", user);
			sqlSession.commit();
			
			System.out.println(user.getId());
		}
		
		//ɾ���û�
		@Test
		public void deleteUser() throws Exception{
			//���غ��������ļ�
			String resource="sqlMapConfig.xml";
			InputStream in=Resources.getResourceAsStream(resource);
			//����SqlSessionFactory
			SqlSessionFactory sqlSessionFactory=(SqlSessionFactory) new SqlSessionFactoryBuilder().build(in);
			//����SqlSession
			SqlSession sqlSession=sqlSessionFactory.openSession();
			System.out.print("djwid");
			
			//ִ��sql���
			
			int i = sqlSession.update("test.deleteUserById", 28);
			sqlSession.commit();
		}
		
		
}
