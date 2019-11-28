package com.testyantra.beanobject.bean;

import java.util.Scanner;

public class TestB {
	
	public static void main(String[] args) {
		System.out.println("scanner class");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter age");
		int age = sc.nextInt();
		System.out.println("age is"+age);
		System.out.println("enter the name");
		String name = sc.nextLine();
		System.out.println("name is"+name);
		System.out.println("are u male?");
		boolean b = sc.nextBoolean();
		System.out.println(b);
	}

}
