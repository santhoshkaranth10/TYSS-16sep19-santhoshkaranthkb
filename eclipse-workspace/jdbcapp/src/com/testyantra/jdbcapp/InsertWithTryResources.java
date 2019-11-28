package com.testyantra.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Properties;

public class InsertWithTryResources {

	public static void main(String[] args) {
		try(FileReader reader = new FileReader("db.properties")) {//closeable interface extends auto-closeable internally
			Properties prop = new Properties();
			prop.load(reader);
			
			Class.forName(prop.getProperty("driver-class-name"));
			String url = prop.getProperty("url");
			String sql = prop.getProperty("insert-query");
			
			try(Connection conn = DriverManager.getConnection(url,prop); 
				Statement stmt = conn.createStatement();//we have put semicolon to continue with "resultset" as it is also an object which is to be closed 
				PreparedStatement pstmt  = pstmt.executeUpdate(sql)) {
				
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}

