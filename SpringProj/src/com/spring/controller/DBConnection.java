package com.spring.controller;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

static Connection connection=null;

private DBConnection() {
// TODO Auto-generated constructor stub
}

public static Connection getDBConnection(){

 if(connection==null) {
 try {
 Class.forName("com.mysql.cj.jdbc.Driver");
 connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/dbsample?verifyServerCertificate=false&useSSL=true", "root", "root");
 }catch(Exception e) {
 e.printStackTrace();
 }
 }
return connection;
}
} 
