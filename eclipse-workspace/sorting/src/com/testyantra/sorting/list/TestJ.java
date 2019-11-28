package com.testyantra.sorting.list;

import java.util.Iterator;
import java.util.TreeSet;

public class TestJ {
public static void main(String[] args) {
	SortedByName sb = new SortedByName();
	TreeSet<Customer> ts = new TreeSet<Customer>(sb);
	Customer c1 = new Customer("santhosh",1,500000);
	Customer c2 = new Customer("sharath",2,550000);
	Customer c3 = new Customer("kavya",3,600000);
	
	ts.add(c1);
	ts.add(c2);
	ts.add(c3);
	
	System.out.println("*********8using iterator******");
	Iterator<Customer> it = ts.iterator();
	while(it.hasNext()) {
		Customer c = it.next();
		System.out.println("name is"+c.name);
		System.out.println("id is"+c.id);
		System.out.println("salary is"+c.sal);
		System.out.println("==========");
}
}
}
