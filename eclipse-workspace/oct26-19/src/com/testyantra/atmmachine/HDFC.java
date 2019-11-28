package com.testyantra.atmmachine;

public class HDFC implements ATM {
	public void validateCard()
	{
		System.out.println("HDFC CARD");
	}
	
	public void getInfo()//by default public should be written because when we override abstract method by default it will be public
	{
		System.out.println("hdfc get info");
	}

}
