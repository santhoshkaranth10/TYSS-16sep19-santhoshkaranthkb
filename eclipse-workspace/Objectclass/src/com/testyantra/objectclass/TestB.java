package com.testyantra.objectclass;

public class TestB {

	public static void main(String[] args) {
		
		Pen p = new Pen();
		int pHashcode = p.hashCode();
		System.out.println("hashcode of p is "+pHashcode);
	   
		Pen q = new Pen();
		int qHashcode = q.hashCode();
		System.out.println("hashcode of q is "+qHashcode);
	
	
	}
}
