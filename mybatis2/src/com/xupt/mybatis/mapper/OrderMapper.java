package com.xupt.mybatis.mapper;

import java.util.List;

import com.xupt.mybatis.pojo.Orders;

public interface OrderMapper {
	
	//查询订单的所有数据
	public List<Orders> selectOrdersList();

}
