package com.testyantra.sorting.set;

import java.util.HashSet;
import java.util.Iterator;

public class TestB {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>(); 
			hs.add("vijay");
			hs.add("ajay");
			hs.add("sujay");
			hs.add("enjoy");
			
			System.out.println("*******using for each");
			 //System.out.println("**********using for each******");
			 for (Object o : hs) {
				System.out.println(o);
			}
			 
			 System.out.println("***using iterator***");
			 Iterator i = hs.iterator();
			 while(i.hasNext()) {
				 System.out.println(i.next());
		}
			
		
	}
}
