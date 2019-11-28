package com.testyantra.collectionframework.list;

import java.util.ArrayList;

public class TestA {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add(12);
		al.add(22.5);
		al.add("santhosh");
		al.add(true);
		al.add(null);
		al.add('A');
		Object o = al.get(2);
		
		for(int i = 0; i<6; i++) {
			Object ob = al.get(i);
			System.out.println(ob);
		}
	}
}
