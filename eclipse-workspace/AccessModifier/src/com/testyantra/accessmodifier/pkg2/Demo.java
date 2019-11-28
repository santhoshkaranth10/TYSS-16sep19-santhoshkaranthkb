package com.testyantra.accessmodifier.pkg2;

public class Demo {

	private int a=10;
	long b=700;
	protected double c=76.89;
	public String name="santhosh";
			
	private void add() {
		System.out.println("demo add() mthod");
	}
	
	void sub() {
		System.out.println("demo sub() method");
	}
	
   protected void mul() {
	   System.out.println("demo mul() method");
	   
   }
   
   public void div() {
	   System.out.println("demo div() method");
   }
}
