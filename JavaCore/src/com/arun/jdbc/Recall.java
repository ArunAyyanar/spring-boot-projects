package com.arun.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Recall {

	public static void main(String[] args) {
		
		try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentDB","root","arun2689");) {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			
			System.out.println(con);
			
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		
		
		
		

	}

}
