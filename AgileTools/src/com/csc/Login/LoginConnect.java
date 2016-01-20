package com.csc.Login;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginConnect implements Serializable {
	public boolean validate(String name, String pass){
    boolean status=false;
	Connection conn=null;
    PreparedStatement pst=null;
    ResultSet rs=null;	
    String JDBC_DRIVER= "com.mysql.jdbc.Driver";
    String DR_URL = "jdbc:mysql://localhost:3306/agiletool";
    String USERNAME = "root";
    String PASSWORD = "rootpassword";
    String query="select * from login where username=? and userpswd=?";
	try {
		Class.forName(JDBC_DRIVER);
		conn = DriverManager.getConnection(DR_URL, USERNAME, PASSWORD);	
		pst=conn.prepareStatement(query);
		pst.setString(1,name);
		pst.setString(2, pass);
		
		rs=pst.executeQuery();
		status =rs.next();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	finally{
		if(conn!=null){
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(pst!=null){
			try {
				pst.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(rs!=null){
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
   return status;
	}
}
