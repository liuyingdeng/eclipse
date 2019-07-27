package com.xupt;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class JdbcDemo {
	public static void main(String[] args) {
		Connection connection=null;
		PreparedStatement preparedStatement=null;
		ResultSet resultSet =null;
		try {
			//加载数据库驱动
			Class.forName("com.mysql.jdbc.Driver");
			//通过驱动管理类获取数据库连接
			connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/mybatis?characterEncoding=utf-8", "root", "root");
			
			String sql = "select * from user where username = ?";
			//获取预处理的statement
			preparedStatement =(PreparedStatement) connection.prepareStatement(sql);
			preparedStatement.setString(1, "王五");
			//向数据库发出sql执行查询，查询出结果集
			resultSet = preparedStatement.executeQuery();
			//遍历查询结果集
			while(resultSet.next()) {
				System.out.println(resultSet.getString("id")+"\t"+resultSet.getString("username"));
			}
		}catch(Exception e) {
	    	 e.printStackTrace();
	    }finally{
	    	//释放资源
	    	if(resultSet !=null) {
	    		try {
					resultSet.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
	    	}
	    	if(preparedStatement !=null) {
	    		try {
					preparedStatement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
	    	}
	    	if(connection !=null) {
	    		try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
	    	}
	    }
	}

}
