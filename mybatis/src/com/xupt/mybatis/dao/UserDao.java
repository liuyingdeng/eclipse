package com.xupt.mybatis.dao;

import com.xupt.mybatis.pojo.User;

public interface UserDao {

	public User selectUserById(Integer id);
}
