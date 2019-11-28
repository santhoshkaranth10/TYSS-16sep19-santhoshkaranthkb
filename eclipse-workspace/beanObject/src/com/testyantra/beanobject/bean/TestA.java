package com.testyantra.beanobject.bean;

import com.testyantra.beanobject.employee.Employee;

public class TestA {
	public static void main(String[] args) {
		Student s = new Student();
		s.setId(12);
		s.setName("santhosh");
		s.setRollno(123);
		
		Database db = new Database();
		db.receive(s);
	
	
	   Employee e = new Employee();
	   e.setId(111);
	   e.setName("sharath");
	   e.setSalary(1200);
	   e.setDeptno(123);
	   e.setDesignation("developer");
	   
	   Database db1 =new Database();
	   db1.save(e);
	   

}
}
