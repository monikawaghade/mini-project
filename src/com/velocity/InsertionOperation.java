package com.velocity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertionOperation {
	public static void main(String[] args) throws SQLException {
		Connection con=null;
		Statement stmt=null;
		try {
		String insert_Query="insert into user(firstname,lastname,username,password,email,city,mobilenumber)"+
	"values('monika','waghade','mona','m@123','mona@gmail.com','pune',7218683503)";
		
		Class.forName("com.mysql.jdbc.Driver");
		 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/monikadb", "root", "mona@12345");
		 stmt=con.createStatement();
		stmt.execute(insert_Query);
		System.out.println("complete record");
		
		
	}catch(Exception e) {
		e.printStackTrace();
	
}finally {
		con.close();
		stmt.close();
	}
}
}