package com.testyantra.jdbcapp;

import java.io.FileReader;
import java.sql.*;
import java.util.Properties;

//import com.mysql.jdbc.Driver;

public class DynamicUpdateQuery {

	public static void main(String[] args) {

		Connection conn =null;
		PreparedStatement pstmt = null;
		FileReader reader = null;

		try {
			
			reader = new FileReader("db.properties");
			Properties prop = new Properties();
			prop.load(reader);
//			Driver driver = new Driver();
//			DriverManager.registerDriver(driver);
			Class.forName(prop.getProperty("driver-class-name"));//it is not mandatory to write this line also,but it is the best way to write

			String url = prop.getProperty("url");
			conn = DriverManager.getConnection(url,prop);
			

			String sql = "update employee_info set name=?,sal=?,gender=? where id= ?";
			pstmt = conn.prepareStatement(sql);

			String empId = args[0];
			int id = Integer.parseInt(empId);

			String name = args[1];

			String empSal = args[2];
			int sal = Integer.parseInt(empSal);

			String gender = args[3];

			pstmt.setInt(4,id);
			pstmt.setString(1, name);
			pstmt.setInt(2, sal);
			pstmt.setString(3, gender);

			int count = pstmt.executeUpdate();


			System.out.println(count + " row updated ");
		} catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(conn!=null) {
					conn.close();
				}
				if(pstmt!=null) {
					pstmt.close();
				}
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}


