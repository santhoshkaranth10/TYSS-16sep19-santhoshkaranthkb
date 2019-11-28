package com.testyantra.exceptions.customizedunchekedexception;

public class TestAge {

	public static void main(String[] args) {
		System.out.println("main started");
		
		Validator v = new Validator();
		try {
//		v.verify(12);
		v.verify(20);
		}catch(InvalidAgeException ie) {
			System.out.println("below age to watch this");
		}
		v.verify(13);
		System.out.println("main ended");
	}
}
