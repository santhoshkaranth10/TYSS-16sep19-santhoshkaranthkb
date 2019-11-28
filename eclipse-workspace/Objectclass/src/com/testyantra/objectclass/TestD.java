package com.testyantra.objectclass;

public class TestD {

	public static void main(String[] args) {
		Student s = new Student(10,"santhosh",70);
		int sHashcode = s.hashCode();
		System.out.println("hashcode is" +sHashcode);
		System.out.println(s);
	}
}
