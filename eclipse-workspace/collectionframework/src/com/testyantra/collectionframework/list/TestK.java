package com.testyantra.collectionframework.list;

import java.util.ArrayList;
import java.util.List;

public class TestK {

	public static void main(String[] args) {
		
		ArrayList<Double> al = new ArrayList<Double>();//all the toString methods of wrapper classes are overridden ad we will get the value itself
		
		al.add(34.5);
		al.add(23.5);
		al.add(87.6);
		al.add(null);
		al.add(null);
		al.add(34.5);
		
		System.out.println(al);
		al.add(2,54.6);
		System.out.println("after add in 2nd index"+al);
		al.remove(0);//if there are 3 duplicate elements it removes the first matched element only 
		System.out.println("after removing 0th index"+al);
		al.remove(null);
		System.out.println("after removing null"+al);
		Double val = al.get(4);
		System.out.println("object at 4th index"+val);
		al.set(2, 77.6);
		System.out.println("after replacing 2nd index"+al);
		al.clear();
		System.out.println("after clear method"+al);
		al.add(87.6);
		System.out.println(al);
		al.contains(87.6);
		System.out.println(al);
		
		List<Double> all = new ArrayList<Double>();
		all.add(12.3);
		all.add(23.4);
		all.add(34.5);
		
		al.addAll(all);//here we can pass the complete collection as a reference 
		System.out.println("after add all"+all);
		
		boolean contain = al.containsAll(all);
		System.out.println("contains all of all"+contain);
		System.out.println("before remove"+all);
		boolean res = all.removeAll(all);
		System.out.println("removed all of all"+res);
		System.out.println("after remove"+all);
				
	}
}
