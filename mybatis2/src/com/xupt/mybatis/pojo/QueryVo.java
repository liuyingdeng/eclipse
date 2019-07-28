package com.xupt.mybatis.pojo;

import java.io.Serializable;

import com.xupt.mybatis.pojo.User;

public class QueryVo implements Serializable{
	
	private static  final long serialVersionUID = 1L;
	
	public User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
	

}
