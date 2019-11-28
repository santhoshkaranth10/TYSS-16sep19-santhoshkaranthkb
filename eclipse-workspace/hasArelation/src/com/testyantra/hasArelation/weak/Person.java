package com.testyantra.hasArelation.weak;

public class Person {

	String name;
	Marker m = new Marker();
	void sleep() {
		System.out.println("person sleep() method");
	}
	
	void eat() {
		System.out.println( "person eat() method");
	}
}
