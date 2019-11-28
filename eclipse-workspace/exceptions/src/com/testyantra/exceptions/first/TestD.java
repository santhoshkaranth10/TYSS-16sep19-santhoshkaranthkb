package com.testyantra.exceptions.first;

public class TestD {

	public static void main(String[] args) {
		
		System.out.println( "main started");
		
		int a[] = {10,20,30};
		int b = 10;
		try {
			System.out.println(a[4]);
			//System.out.println(b/2);
			System.out.println(b/0);
		}
		catch(ArithmeticException ae) {
			System.out.println("number divided by zero");
		}
		catch(ArrayIndexOutOfBoundsException a1) {
			System.out.println("index is not present");
		}
		System.out.println("main ended");
	}
}
