package com.testyantra.objectclass;

public class TestA {

	public static void main(String[] ar) {
	
		Pendrive p = new Pendrive();
		USBport.connect(p);
		
		Mouse m = new Mouse();
		USBport.connect(m);
		
	}
}
