package com.testyantra.sorting.list;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class TestB {
public static void main(String[] args) {
	 LinkedList<Laptop> l1 = new LinkedList<Laptop>();
	 Laptop lp1 = new Laptop(25000, 5,"hp");
	 Laptop lp2 = new Laptop(30000, 6,"dell");
	 Laptop lp3 = new Laptop(40000,7,"lenovo");
	 Laptop lp4 = new Laptop(50000,4,"asus");
	 
	 l1.add(lp1);
	 l1.add(lp2);
	 l1.add(lp3);
	 l1.add(lp4);
	 l1.add(new Laptop(50000,8,"acer"));
	 
	 displayLaptopDetails(l1);
	 Collections.sort(l1);
}

static void displayLaptopDetails(LinkedList<Laptop> l1) {
	Iterator<Laptop> it = l1.iterator();
	while(it.hasNext()) {
		Laptop lp = it.next();
		System.out.println("brand is "+lp.brand);
		System.out.println("price is"+lp.price);
		System.out.println("ram is "+lp.ram);
		
		
		
	}
}
}
