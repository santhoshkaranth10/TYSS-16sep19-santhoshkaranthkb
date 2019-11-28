package com.testyantra.exceptions.first;

public class TestB {

	public static void main(String[] args) {
		System.out.println("main started");
		int a = 10;
		//int b =0;
		int b;
		try {
			 b = 10/0;
			 System.out.println(b);
			 System.out.println("hello");
			 System.out.println("happy deepavali");
			
		}
		catch(ArithmeticException ae) {
			System.out.println("number is divided by zero");
		}
		//System.out.println(b);
		System.out.println("main ended");
	}
}
