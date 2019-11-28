package com.testyantra.sorting.list;

import java.util.Iterator;
import java.util.TreeSet;

public class TestI {

	public static void main(String[] args) {//list iterator can be used only for list
//		SortByName sb = new SortByName();
//      SortByPincode sp = new SortByPincode();
		SortByMICR sm = new SortByMICR();
		TreeSet<Bank> ts = new TreeSet<Bank>(sm);
		Bank b1 = new Bank("HDFC",560058,676789);
		Bank b2 = new Bank("Sbi",560078,87787);
		Bank b3 = new Bank("CITI",567778,657687);
		Bank b4 = new Bank("CANARA",567789,56757);
		Bank b5 = new Bank("CANARA",567789,56757);
		
		ts.add(b1);
		ts.add(b2);
		ts.add(b3);
		ts.add(b4);
		ts.add(b5);
		
		System.out.println("*********8using iterator******");
		Iterator<Bank> it = ts.iterator();
		while(it.hasNext()) {
			Bank b = it.next();
			System.out.println("name is"+b.name);
			System.out.println("pincode is"+b.pincode);
			System.out.println("Micr is+b.MICR");
			System.out.println("==========");
		}
	}
}
