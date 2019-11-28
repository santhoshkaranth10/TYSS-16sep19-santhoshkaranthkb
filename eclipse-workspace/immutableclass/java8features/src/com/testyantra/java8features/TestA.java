package com.testyantra.java8features;

import java.util.function.Predicate;

public class TestA {

	public static void main(String[] args) {
		
		Predicate<Integer> p = i -> {
			if(i%2 ==0 ) {
				return true;
			}else {
				return false;
			}
		
	};
	boolean b = p.test(12);//test() is used to pass the value  for "predicate" interface
	System.out.println("result is "+b);
}
}
