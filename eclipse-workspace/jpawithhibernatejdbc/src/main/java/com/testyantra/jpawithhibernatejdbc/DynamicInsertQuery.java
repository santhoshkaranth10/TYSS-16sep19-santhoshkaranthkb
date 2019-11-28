package com.testyantra.jpawithhibernatejdbc;

import java.io.FileReader;
import java.sql.*;
import java.util.Properties;

//import com.mysql.jdbc.Driver;

public class DynamicInsertQuery {

	public static void main(String[] args) {

		Connection conn = null;
		PreparedStatement pstmt = null;
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

			
			pstmt = conn.prepareStatement(prop.getProperty("insert-query"));

			String empid = args[0];
			int id = Integer.parseInt(empid);
			pstmt.setInt(1, id);

			String name = args[1];
			pstmt.setString(2, name);

			String empsal = args[2];
			int sal = Integer.parseInt(empsal);
			pstmt.setInt(3,sal);

			String gender = args[3];
			pstmt.setString(4, gender);

			int count = pstmt.executeUpdate();


			//step 4) read the result
			System.out.println(count + " Rows inserted");
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(conn!= null) {
					conn.close();
				}
				if(pstmt!=null) {
					pstmt.close();
				}
				if(reader!=null) {
					reader.close();
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
