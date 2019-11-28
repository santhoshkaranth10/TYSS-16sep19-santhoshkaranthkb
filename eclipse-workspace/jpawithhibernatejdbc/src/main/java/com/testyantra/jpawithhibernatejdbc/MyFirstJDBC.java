package com.testyantra.jpawithhibernatejdbc;

import java.sql.*;

import com.mysql.jdbc.Driver;

public class MyFirstJDBC {

	public static void main(String[] args) {

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			//step:1) load the driver
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			
			//step:2)get the connection
			String url = "jdbc:mysql://localhost:3306/ust_ty_db";
			conn = DriverManager.getConnection(url,"root","root");//getConnection method is example of method-overloading,all collections are example of method overloaoding
			//every class inherits from object class example for inheritance.
			
			//step:3)Issue SQL query
			stmt = conn.createStatement();
			String sql = "select * from employee_info";
			rs = stmt.executeQuery(sql);
			
			//step:4)read the result
			while(rs.next()) {//public abstract boolean next() is the method signature of this next();
				int id = rs.getInt("id");//or int id = rs.getInt(1);
				String name = rs.getString("name");
				int sal = rs.getInt("sal");
				String gender = rs.getString("gender");

				System.out.println("Id: "+id);
				System.out.println("Name: "+name);
				System.out.println("Salary: "+sal);
				System.out.println("Gender: "+gender);
				System.out.println("**************");

			}	

		}catch (SQLException e) {
			e.printStackTrace();	
		}finally {
			//step5)close all JDBC objects
			try {
				if(conn!=null) {
					conn.close();
				}
				if(stmt!=null) {
					stmt.close();
				}if(rs!=null) {
					rs.close();
				}
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}//end of main

}//end of MyFirstJDBC

