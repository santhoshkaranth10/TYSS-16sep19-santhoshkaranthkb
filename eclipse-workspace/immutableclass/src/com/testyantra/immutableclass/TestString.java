package com.testyantra.immutableclass;

public class TestString {

	public static void main(String[] args) {
		
		MyString ms = new MyString(10,"santhosh");
		
		System.out.println(ms.getName());
		System.out.println(ms.getRollno());
		System.out.println(ms);
		
//		ms.changeContent()
		MyString ms1 = ms.changeContent(20, "sharath");
		System.out.println(ms.getName());
		System.out.println(ms.getRollno());
		
		System.out.println("************");
		System.out.println(ms1.getName());
		System.out.println(ms1.getRollno());
	}
}
