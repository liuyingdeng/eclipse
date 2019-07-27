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
			//�������ݿ�����
			Class.forName("com.mysql.jdbc.Driver");
			//ͨ�������������ȡ���ݿ�����
			connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/mybatis?characterEncoding=utf-8", "root", "root");
			
			String sql = "select * from user where username = ?";
			//��ȡԤ�����statement
			preparedStatement =(PreparedStatement) connection.prepareStatement(sql);
			preparedStatement.setString(1, "����");
			//�����ݿⷢ��sqlִ�в�ѯ����ѯ�������
			resultSet = preparedStatement.executeQuery();
			//������ѯ�����
			while(resultSet.next()) {
				System.out.println(resultSet.getString("id")+"\t"+resultSet.getString("username"));
			}
		}catch(Exception e) {
	    	 e.printStackTrace();
	    }finally{
	    	//�ͷ���Դ
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
