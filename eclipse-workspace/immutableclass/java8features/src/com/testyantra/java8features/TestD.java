package com.testyantra.java8features;

import java.util.function.Function;

public class TestD {

	public static void main(String[] args) {
		
		Function<Integer, Student> f = id-> {
			Student s = new Student(2,"ajay",56.78);
			s.id = id;
			return s;
		};
		
		Student s1 = f.apply(27);
		System.out.println("id is "+s1.id);
		System.out.println("name is "+s1.name);
		System.out.println("percentage is "+s1.per);
	}
}
