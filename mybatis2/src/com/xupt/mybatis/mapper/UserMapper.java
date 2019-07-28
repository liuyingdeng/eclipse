package com.xupt.mybatis.mapper;

import java.util.List;

import com.xupt.mybatis.pojo.QueryVo;
import com.xupt.mybatis.pojo.User;

public interface UserMapper {
	
	/*
	 *    遵循四个原则
	 *  1、接口 方法名  == User.xml 中 id 名
	 *  2、返回值类型  与  Mapper.xml文件中返回值类型要一致
	 *  3、方法的入参类型 与Mapper.xml中入参的类型要一致
	 *  4、命名空间 绑定此接口
	 */
	public User findUserById(Integer id);
	public List<User> findUserByQueryVo(QueryVo vo);
	
	
	//查询数据条数
	public Integer countUser();

}
