package com.testyantra.sorting.list;

import java.util.Stack;

public class TestD {
	public static void main(String[] args) {



		Stack<Integer> st = new Stack<>();//we need not pass anything  inside angular brackets it still works
		st.add(10);
		st.push(23);
		st.push(45);
		
		System.out.println("using get() method");
		for(int i=0; i<st.size();i++) {
			System.out.println(st.get(i));
		}
		
		int j=st.size();
		System.out.println("using pop() method");
		for(int i=0;i<st.size();i++) {
			System.out.println(st.pop());
		}
	}
}
