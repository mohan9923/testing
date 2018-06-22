package com.spring.controller;

import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class SpringDAO  {
	
	public  List UserList() throws Exception{
		List<SpringUser>  userList= new ArrayList<>();
		try {
			

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/dbsample?verifyServerCertificate=false&useSSL=true", "root", "root");

			PreparedStatement ps = conn.prepareStatement("select*from user_details");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) { 

				SpringUser user= new SpringUser();
				int Id= rs.getInt(1);
				user.setId(String.valueOf(Id));
				String fullname=rs.getString(2);
				user.setFullname(fullname);
				String Username=(rs.getString(3));
				user.setUsername(Username);
				String Email=(rs.getString(4));
				user.setEmail(Email);
				
				userList.add(user);
			}

		}

		catch (Exception e) {
			e.printStackTrace();

		}

		return userList;
	}

	public int select(String parameter, String parameter2) {
		// TODO Auto-generated method stub
		return 0;
	}
}
