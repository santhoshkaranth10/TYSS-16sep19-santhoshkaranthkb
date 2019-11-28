package com.testyantra.jdbcapp;

import java.io.FileReader;
import java.sql.*;
import java.util.Properties;

//import com.mysql.jdbc.Driver;

public class DynamicSelectQuery {

	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
//		String sql = "select * from employee_info where id =?";
//		String url ="jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
		ResultSet rs = null;
		FileReader reader = null;
		try {
			
			reader = new FileReader("db.properties");
			Properties prop = new Properties();
			prop.load(reader);
//			Driver driver = new Driver();
//			DriverManager.registerDriver(driver);
			Class.forName(prop.getProperty("driver-class-name"));
		
			
			String url = prop.getProperty("url");
			conn = DriverManager.getConnection(url,prop);
			
			pstmt = conn.prepareStatement(prop.getProperty("select-query1"));
			
			String empid = args[0];
			int id = Integer.parseInt(empid);
			pstmt.setInt(1,id);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				int emp_id = rs.getInt("id");
				int sal = rs.getInt("sal");
				String name = rs.getString("name");
				String gender = rs.getString("gender");
				
				System.out.println("emp_id "+id);
				System.out.println("name "+name);
				System.out.println("salary "+sal);
				System.out.println("gender "+gender);
				
				
			}
			
		}catch (Exception e ) {
			e.printStackTrace();
		}finally {
			try {
				if(conn!=null) {
					conn.close();
				}
				if(pstmt!=null) {
					pstmt.close();
				}
				if(rs!=null) {
					rs.close();
				}
				if(reader!=null) {
					reader.close();
				}
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	
	}
}
