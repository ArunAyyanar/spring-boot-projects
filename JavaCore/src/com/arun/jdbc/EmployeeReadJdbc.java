package com.arun.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeReadJdbc {

	public static void main(String[] args) {

		try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","arun2689");
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery("select * from employee_info");
				){
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			while(rs.next())
			{
				System.out.println(rs.getString("name"));
				
			}
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
