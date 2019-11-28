package com.testyantra.objectclass;

public class TestE {

	public static void main(String[] args) {
		
		Car c = new Car(20000,"swift","grey");
		int cHashcode = c.hashCode();
		System.out.println("hashcode of"+cHashcode);
		System.out.println(c);
		
		Car c1 = new Car(30000,"benz","white");
		int c1Hashcode = c1.hashCode();
		System.out.println("hashcode of"+c1Hashcode);
		System.out.println(c1);	
		
		Car c2 = new Car(40000,"bmw","black");
		int c2Hashcode = c2.hashCode();
		System.out.println("hashcode of"+c2Hashcode);
		System.out.println(c2);	
	}
}
