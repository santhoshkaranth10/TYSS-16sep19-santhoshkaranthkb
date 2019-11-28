
package com.testyantra.collectionframework.list;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class TestH {

	public static void main(String[] args) {

		Vector li = new Vector();
		li.add(35);
		li.add(40);
		li.add("more");
		li.add(null);

		System.out.println("====using for loop===");
		for (int i = 0; i <li.size(); i++) {
			System.out.println(li.get(i));

		}

		System.out.println("===using iterator===");
		Iterator it = li.iterator();
		while(it.hasNext()) {
			Object o = it.next();
			System.out.println(o);
		}

		System.out.println("=====using list iterator===");
		ListIterator it1 = li.listIterator();
		while(it1.hasNext()) {
			Object o = it1.next();
			System.out.println(o);
		}

		System.out.println("===using list iterator backward===");
		ListIterator it2 = li.listIterator();
		while(it2.hasPrevious()) {
			Object o1 = it2.previous();
			System.out.println(o1);
		}
	}



}

