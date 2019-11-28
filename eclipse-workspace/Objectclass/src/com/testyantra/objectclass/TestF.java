package com.testyantra.objectclass;

public class TestF {

	public static void main(String[] args) {
		Cow c= new Cow(1,"ganga",10000);
		Cow c1 = new Cow(2,"yamuna",20000);
		Cow c2 = new Cow(1,"ganga",10000);
		Cow c3 = c2;
	
	System.out.println(c.equals(c1));
	System.out.println(c.equals(c2));
	System.out.println(c2.equals(c2));

	
	}
}
