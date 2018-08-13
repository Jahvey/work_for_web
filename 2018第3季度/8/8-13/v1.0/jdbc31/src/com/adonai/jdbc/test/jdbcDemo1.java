package com.adonai.jdbc.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class jdbcDemo1 {
	
	
	public static void main(String[] args) {
		
		Connection connection=null;
		PreparedStatement preparedStatement=null;
		
		ResultSet resultSet=null;
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql:///mybatis1?characterEncoding=utf-8";
			String user="root";
			String password="root";
			connection=DriverManager.getConnection(url, user, password);
			String sql="select * from user where username= ?";
			
			preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1, "王五");
			resultSet=preparedStatement.executeQuery();
			while (resultSet.next()) {
				System.out.println(resultSet.getString("id")+" : "+
			resultSet.getString("username"));
				
			}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			// 释放资源
			if (resultSet != null) {
				try {
					resultSet.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (preparedStatement != null) {
				try {
					preparedStatement.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		
		
		
	}

}
