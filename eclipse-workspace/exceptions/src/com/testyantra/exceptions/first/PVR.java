package com.testyantra.exceptions.first;

public class PVR {

	void book() {
		System.out.println("booking started");
	try {
		System.out.println(10/0);
		System.out.println("booking confirmed");
	
	}catch(ArithmeticException ae) {
		System.out.println("booking failed");
        throw ae;
	}
	
	
}
}
