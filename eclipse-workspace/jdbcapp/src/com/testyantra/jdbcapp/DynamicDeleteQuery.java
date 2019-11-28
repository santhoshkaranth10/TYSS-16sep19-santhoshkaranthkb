package com.testyantra.jdbcapp;

import java.sql.*;

//import com.mysql.jdbc.Driver;

public class DynamicDeleteQuery {

	public static void main(String[] args) {

		Connection conn =null;
		PreparedStatement pstmt = null;

		try {
//			Driver driver = new Driver();
//			DriverManager.registerDriver(driver);
			//instead of loading the driver externally we can just load the class name
			Class.forName("com.mysql.jdbc.Driver");

			String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			conn = DriverManager.getConnection(url);

			String sql = "delete from employee_info where id= ?";
			pstmt = conn.prepareStatement(sql);

			String empId = args[0];
			int id = Integer.parseInt(empId);


			pstmt.setInt(1,id);


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

