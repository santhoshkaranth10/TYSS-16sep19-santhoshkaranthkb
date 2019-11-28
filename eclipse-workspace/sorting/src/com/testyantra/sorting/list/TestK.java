package com.testyantra.sorting.list;

import java.util.Iterator;
import java.util.PriorityQueue;

public class TestK {

	public static void main(String[] args) {
		PriorityQueue pq = new PriorityQueue();
		pq.add(12);
		pq.add(24);
		pq.add(35);
		pq.add(35);
		pq.offer(1);
		
		System.out.println("***before poll"+pq);
		System.out.println("*****8using iterator***");
		Iterator it = pq.iterator();
		while(it.hasNext()) {
			System.out.println(pq.poll());
		}
		System.out.println("after poll"+pq);
	}
}
