package com.testyantra.beanobject.bean;

import com.testyantra.beanobject.employee.Employee;

public class Database {

	void receive(Student s) {
		System.out.println("id is"+s.getId());
		System.out.println("name is"+s.getName());
		System.out.println("rollno is"+s.getRollno());
		System.out.println( "********************");
	}
	
	void save(Employee e) {
		System.out.println("id is"+e.getId());
		System.out.println("name is"+e.getName());
		System.out.println("salary is"+e.getSalary());
		System.out.println("deptno is"+e.getDeptno());
		System.out.println("designation is"+e.getDesignation());;
		System.out.println( "********************");
		
		
	}
	
}
