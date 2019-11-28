package com.testyantra.stringclass;

public class TestA {

	public static void main(String[] args) {
		String s1 = "santhosh";
		String s2 = "sharath";
		
		String s3 = new String("santhosh");
		String s4 = new String("santhosh");
		String s5 = "santhosh";
		
		System.out.println(s1.equals(s2));
		System.out.println(s3.equals(s4));
		System.out.println(s1.equals(s5));
	    
	    String s6 = s1.toLowerCase();
	    System.out.println(s6);
	    String s7 = s1.toUpperCase();
	    System.out.println(s7);
	    char c = s1.charAt(0);
	    System.out.println(c);
	    
	    boolean b = s1.equalsIgnoreCase("SANTHosh");
	    System.out.println(b);
	    System.out.println("*******************");
	    
	    StringBuffer sb1 = new StringBuffer("kavya");
	    sb1.append("xyz");
	    System.out.println(sb1);
	}
}
