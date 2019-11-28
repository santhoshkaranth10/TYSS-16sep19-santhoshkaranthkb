package com.testyantra.collectionframework.list;

import java.util.ArrayList;
import java.util.ListIterator;

public class TestD {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(45.6);
		al.add("yash");
		al.add(true);
		
		ListIterator li = al.listIterator();
			System.out.println("-------------->forward");
		while(li.hasNext()==true) {
			Object o = li.next();
			System.out.println(o);
		}
			System.out.println("<-------backward");
			while(li.hasPrevious()==true) {
				Object o1 = li.previous();
				System.out.println(o1);
			}
		}
	}

