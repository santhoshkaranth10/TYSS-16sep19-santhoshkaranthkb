package com.testyantra.java8features;

import java.util.function.Function;

public class TestC {

	public static void main(String[] args) {
		
		Function<Integer,Integer> f = i-> i * i;
		int result = f.apply(5);;
		System.out.println("result is "+result);
		
		int value = f.apply(10);
		System.out.println("result is "+value);
	}
	}
     
