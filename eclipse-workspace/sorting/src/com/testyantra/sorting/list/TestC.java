package com.testyantra.sorting.list;

import java.util.LinkedList;

public class TestC {
public static void main(String[] args) {
	
	LinkedList<Integer> li = new LinkedList<Integer>();
	 li.add(12);
	 li.add(13);
	 li.add(33);
	 li.add(44);
	 
	 Integer peekElement = li.peek();
	 System.out.println("peek elements"+peekElement);
	 Integer peekFirstElement = li.peekFirst();
	 System.out.println("peek first elements"+peekFirstElement);
	 Integer peekLastElement = li.peekLast();
	 System.out.println("peek oast element"+peekLastElement);
	 
	 System.out.println("************");
	 
	 Integer pollElement = li.poll();
	 System.out.println("poll element "+pollElement);
	 Integer pollFirstElement = li.pollFirst();
	 System.out.println("poll first element"+pollFirstElement);
	 
}
}
