package com.testyantra.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;

public class TestC {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList(); 
		al.add(23);
		al.add(93.7);
		al.add(true);
		al.add("good evening");
		
		Iterator it = al.iterator();
		Object o1 = it.next();
		System.out.println("obj1"+o1);
		
		Object o2 = it.next();
		System.out.println("obj2"+o2);

		Object o3 = it.next();
		System.out.println("obj3"+o3);
		
		Object o4 = it.next();
		System.out.println("obj4"+o4);
		
		boolean b = it.hasNext();
		System.out.println("HasNext"+b);
		
//		Object o5 = it.next();3
//		System.out.println("obj5"+o5);
//      NoSuchElementException
		
		for (int i = 0; i < al.size(); i++) {
			Object o = al.get(i);
			System.out.println(o);
		}
		
		ArrayList all = new ArrayList();
		all.add(12);
		all.add(233.44);
		all.add("momos");
		all.add(false);
		
		System.out.println("======using iterator=====");
		Iterator it2 = all.iterator();
		while(it2.hasNext()) {
			Object o = it2.next();
			System.out.println(o);
		}
	}
}
