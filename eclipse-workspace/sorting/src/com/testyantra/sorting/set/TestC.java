package com.testyantra.sorting.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestC {

	public static void main(String[] args) {
		LinkedHashSet ls = new LinkedHashSet();
		ls.add(34);
		ls.add("kavya");
		ls.add(89.9);
		ls.add(34);
		ls.add("mamtha");
		ls.add(null);
		ls.add(null);
		
		System.out.println("*******using for each");
		 //System.out.println("**********using for each******");
		 for (Object s : ls) {
			System.out.println(s);
		}
		 
		 System.out.println("***using iterator***");
		 Iterator it = ls.iterator();
		 while(it.hasNext()) {
			 Object p = it.next();
			 System.out.println(p);
	}
		
	}
}//insertion order is preserved but hashset doesn't preserve insertion order
//duplicate null is not allowed 
