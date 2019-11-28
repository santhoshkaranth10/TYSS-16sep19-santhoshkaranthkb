package com.testyantra.java8features;

import java.util.function.Predicate;

public class TestB {

	public static void main(String[] args) {
		
		Predicate<Student> p = s1-> {
			if(s1.per>=35) {
				return true;
			}else {
				return false;
			}
		};
				
		Student s1 = new Student(1,"santhosh",45.6);
		boolean b = p.test(s1);
		System.out.println("result is "+b);
	
		
	}
}
