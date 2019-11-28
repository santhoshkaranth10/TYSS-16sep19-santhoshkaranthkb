package com.testyantra.sorting.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestE {

	public static void main(String[] args) {
		ArrayList<Marker> al = new ArrayList<Marker>();
		al.add(new Marker(50,"blue"));
		al.add(new Marker(70,"red"));
		al.add(new Marker(80,"green"));
		al.add(new Marker(40,"black"));
		
		System.out.println("before sorting");
		display(al);
		
		SortByPrice sb = new SortByPrice();
		SortByColor sc = new SortByColor();
		Collections.sort(al, sb);//here we are passing the comparator object as 2nd argument i.e "sb"
		Collections.sort(al,sc);//here we are passing the comparator object as 2nd argument i.e "sc"
		System.out.println("after sorting");
		display(al);
	}
	static void display(ArrayList<Marker> a) {
		Iterator<Marker> it = a.iterator();
		while(it.hasNext()) {
			Marker m  = it.next();
			System.out.println("price is"+m.price);
			System.out.println("color is"+m.color);
			System.out.println("**************");
		}
	}
}
