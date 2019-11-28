package com.testyantra.jdbcapp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertWithCSVFile {

	public static void main(String[] args) {

		String  url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
		String sql = "insert into employee_info values(?,?,?,?)";
		try(FileReader in = new FileReader("csv.txt");
				BufferedReader reader = new BufferedReader(in);
				Connection conn = DriverManager.getConnection(url);
				PreparedStatement pstmt = conn.prepareStatement(sql)){

			while(reader.ready()) {
				String  line = reader.readLine();
				String[] datas = line.split(","); 

				int id = Integer.parseInt(datas[0]);
				String name = datas[1];
				int sal = Integer.parseInt(datas[2]);
				String gender = datas[3];

				pstmt.setInt(1, id);
				pstmt.setString(2, name);
				pstmt.setInt(3, sal);
				pstmt.setString(4, gender);

				pstmt.addBatch();//it will take all the data at once and hit the database only once
				//even if we have an exception in the output,the data will be executed in the database
				//the above 2 points are the advantages of addBatch();  
			}
			int[] counts = pstmt.executeBatch();//return type is integer array
			System.out.println(counts.length + "rows updated ");				

			//				int count = pstmt.executeUpdate();
			//				System.out.println(count+" row(s) updated ");


		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
