package com.testyantra.java8features;

import java.util.ArrayList;

public class TestS {

	public static void main(String[] args) {
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student(5,"vikram",56.7));
		al.add(new Student(3,"ajay",37.8));
		al.add(new Student(2,"suresh",35.7));
		al.add(new Student(6,"ramesh",56.7));
		al.add(new Student(1,"vishwas",56.7));
		
		Helper h = new Helper();
//		h.displayAllStudents(al);
		h.displayPassedStudents(al);
		
	}
	
}
