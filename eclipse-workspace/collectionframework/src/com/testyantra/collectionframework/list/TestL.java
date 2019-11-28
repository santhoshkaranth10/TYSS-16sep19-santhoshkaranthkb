package com.testyantra.collectionframework.list;

import java.util.Collections;
import java.util.LinkedList;

public class TestL {
	public static void main(String[] args) {
		
	

	LinkedList<Integer> li = new LinkedList<Integer>();
	li.add(12);
	li.add(13);
	li.add(34);
	li.add(3);
	li.add(10);
	
	System.out.println("before sort method"+li);
	Collections.sort(li);
	System.out.println("after sort method");//for sorting there should be only generic parameters
	
	Collections.reverse(li);
	System.out.println(li);
	
	}
}
