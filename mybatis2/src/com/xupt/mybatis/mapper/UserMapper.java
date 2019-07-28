package com.xupt.mybatis.mapper;

import java.util.List;

import com.xupt.mybatis.pojo.QueryVo;
import com.xupt.mybatis.pojo.User;

public interface UserMapper {
	
	/*
	 *    ��ѭ�ĸ�ԭ��
	 *  1���ӿ� ������  == User.xml �� id ��
	 *  2������ֵ����  ��  Mapper.xml�ļ��з���ֵ����Ҫһ��
	 *  3��������������� ��Mapper.xml����ε�����Ҫһ��
	 *  4�������ռ� �󶨴˽ӿ�
	 */
	public User findUserById(Integer id);
	public List<User> findUserByQueryVo(QueryVo vo);
	
	
	//��ѯ��������
	public Integer countUser();

}
