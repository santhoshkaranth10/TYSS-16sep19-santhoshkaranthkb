package com.testyantra.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestE {

	public static void main(String[] args) {
		TreeSet ts  = new TreeSet();
		ts.add(34);
		ts.add(40);
		ts.add(36);
		ts.add(34);
		//ts.add(null);
		//ts.add(null);//null pointer exeption
		//ts.add("babitha");//class cast exception
		//only generic values are allowed same type of values should be added
		
		
		System.out.println("*******using for each");
		 //System.out.println("**********using for each******");
		 for (Object s : ts) {
			System.out.println(s);
		}
		 
		 System.out.println("***using iterator***");
		 Iterator it = ts.iterator();
		 while(it.hasNext()) {
			 Object p = it.next();
			 System.out.println(p);
	}
	}
}
