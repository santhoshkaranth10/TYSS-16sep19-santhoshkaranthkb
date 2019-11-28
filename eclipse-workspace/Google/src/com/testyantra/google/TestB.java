package com.testyantra.google;

public class TestB {

	public static void main(String[] args) {
		Browser b = new Browser();
		
//		Gmail g = new Gmail();
//		g.login();
//		only gmail object can be accessed
		
		Google g1 = new Gmail();
		b.open(g1);
//		up_casting is done here once we have up-casted we can access either g-mail methods or google drive method
		
		Google g2 = new GoogleDrive();
		b.open(g2);
	}
	
	
}
