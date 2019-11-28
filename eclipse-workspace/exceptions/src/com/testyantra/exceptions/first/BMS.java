package com.testyantra.exceptions.first;

public class BMS {

	public static void main(String[] args) {
		System.out.println("BMS started");

		PVR p = new PVR();
		try {//here we are handling the exception which is thrown by writing "throw ae" from PVR so we are using try and catch block
			p.book();
			System.out.println("booking confirmed");
		}catch(ArithmeticException ae) {
			System.out.println("booking failed");
		}
		System.out.println("BMS ended");
	}
}
