package com.testyantra.empapp;

import java.util.List;
import java.util.Scanner;

import com.testyantra.empapp.dao.EmployeeDAO;
import com.testyantra.empapp.dao.EmployeeDAOImpl;
import com.testyantra.empapp.dto.EmployeeBean;
import com.testyantra.empapp.util.EmployeeManager;

public class App {

	public static void main(String[] args) {
		System.out.println("press 1 to get all employee data");
		System.out.println("press 2 to insert data");
		System.out.println("press 3 to update data");
		System.out.println("press 4 to delete data");
		System.out.println("press 5 to search single employee data");
		
		Scanner scn = new Scanner(System.in);
		int ch = scn.nextInt();
		
		switch(ch) {
		case 1: EmployeeDAO dao = EmployeeManager.getEmployeeDAO();
		     List<EmployeeBean> result = dao.getAllEmployeeData();
		      
		     for (EmployeeBean bean : result) {
				System.out.println("name is "+bean.getName());//retrieving can be any order and even setting the values can be in any order 
				System.out.println("id is "+bean.getId());
				System.out.println("salary is "+bean.getSal());
				System.out.println("gender is "+bean.getGender());
			}
		      break;
		      
		case 2: 
			break;
		case 3:
			break;
		case 4:
			break;
			case 5:EmployeeDAO impl5 = EmployeeManager.getEmployeeDAO();
			int id = scn.nextInt();
			EmployeeBean bean = impl5.searchEmployeeData(id);
			if(bean!=null) {
				System.out.println("name is "+bean.getName());//retrieving can be any order and even setting the values can be in any order 
				System.out.println("id is "+bean.getId());
				System.out.println("salary is "+bean.getSal());
				System.out.println("gender is "+bean.getGender());//here the data is being transferred from employeedao file to app in the form of bean object 
				//so we call it as data transfer object(dto)

			}else {
				System.out.println("no data found");
			}
			break;
		}
	}
}
		
				
	
	

