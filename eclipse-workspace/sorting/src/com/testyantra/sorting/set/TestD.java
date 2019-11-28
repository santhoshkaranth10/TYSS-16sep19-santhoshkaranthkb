package com.testyantra.sorting.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestD {

	public static void main(String[] args) {
		LinkedHashSet<Double> ls = new LinkedHashSet <Double>();
		ls.add(34.8);
		ls.add(1.5);
		ls.add(34.8);
		ls.add(67.5);
		ls.add(null);
		ls.add(null);
		
		System.out.println("*******using for each");
		 //System.out.println("**********using for each******");
		 //for (Object o : ls) 
		for (Double o : ls){
			System.out.println(o);
		}
		 
		 System.out.println("***using iterator***");
		 Iterator<Double> i = ls.iterator();
		 while(i.hasNext()) {
			 System.out.println(i.next());
	}
	}
}
