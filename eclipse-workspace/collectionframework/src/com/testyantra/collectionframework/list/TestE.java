package com.testyantra.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestE {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("santhosh");
		al.add("savitha");
		al.add("sumalatha");
		al.add("hemalatha");
		
		String s1 = al.get(0);
		System.out.println(s1.toUpperCase());
		Iterator<String> li = al.iterator();
		while(li.hasNext()) {
			String s = li.next();
			System.out.println(s);
			
		}
		System.out.println("using listiterator");
	    ListIterator<String> i = al.listIterator();
	    while(i.hasNext()) {
	    	String si = i.next();
	    	System.out.println(si);
	    }
	    
	    System.out.println("using foreach loop");
	    for(String s:al) {
	    	System.out.println(s);
	    }
	}
}
