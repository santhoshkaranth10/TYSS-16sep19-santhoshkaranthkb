package com.testyantra.exceptions.first;

public class PAYTM {

	void book() {
		System.out.println("paytm started");
		
		IRCTC i = new IRCTC();
		i.confirm();
		
		System.out.println("paytm ended");
	}
}
