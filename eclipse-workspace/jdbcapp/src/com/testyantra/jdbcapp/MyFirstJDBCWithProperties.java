package com.testyantra.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

//import com.mysql.jdbc.Driver;

public class MyFirstJDBCWithProperties {
	
	public static void main(String[] args) {

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		FileReader reader = null;
		try {

			reader = new FileReader("db.properties");
			Properties prop = new Properties();
			prop.load(reader);
			//step:1) load the driver
//			Driver driver = new Driver();
//			DriverManager.registerDriver(driver);
              Class.forName(prop.getProperty("driver-class-name"));
			//step:2)get the connection
			String url = prop.getProperty("url");
			conn = DriverManager.getConnection(url,prop);//getConnection method is example of method-overloading,all collections are example of method overloaoding
			//every class inherits from object class example for inheritance.

			//step:3)Issue SQL query
			stmt = conn.createStatement();
			String sql = prop.getProperty("select-query");
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

		}catch (Exception e) {
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
				if(reader!=null) {
					reader.close();
				}
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}//end of main

}//end of MyFirstJDBC



