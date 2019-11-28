package com.testyantra.objectclass;

public class Student {

	int id;
	String name;
	double per;
	
	public Student(int id, String name, double per) {
		super();
		this.id = id;
		this.name = name;
		this.per = per;
	}
	
	@Override
	public int hashCode() {
	return id;
	}
	
	@Override
	public String toString() {
		return " name is " + name +" id is "+ id +" percentage is "+ per;
	}
	
	void printDetails() {
		System.out.println("name");
		System.out.println(id);
		System.out.println(per);
	}
	
}
