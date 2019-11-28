package com.testyantra.singleton;

public class TestA {

	public static void main(String[] args) {
		
		MySingleton ms = MySingleton.getDbConnection();
		ms.s = "hello";
		System.out.println("Hashcode of ms"+ms.hashCode());
		
		MySingleton mx = MySingleton.getDbConnection();
		mx.s = "hi";
		System.out.println("Hashcode of mx"+mx.hashCode());
		
		System.out.println(ms.s);
		System.out.println(mx.s);
	}
}
