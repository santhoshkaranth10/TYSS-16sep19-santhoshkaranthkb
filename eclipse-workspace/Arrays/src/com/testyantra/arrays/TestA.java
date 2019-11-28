package com.testyantra.arrays;

public class TestA {

	public static void main(String[] args) {
		int[] nums = new int[5];
		nums[0] = 10;
		nums[1] = 20;
		nums[2] = 30;
		nums[3] = 40;
		nums[4] = 50;
		
		for(int i=0; i<nums.length;i++) {
			System.out.println(nums[i]);
		}
		
		for(int i : nums) {
			System.out.println(i);
		}
		System.out.println("***********");
		char[] ch = {'a','b','c','d','e'};
		for(int i=0;i<ch.length;i++) {
			System.out.println(ch[i]);
		}
		System.out.println("***********");
		for(int c : ch) {
			System.out.println(c);
		}
		System.out.println("********");
		boolean[] b = {true,false,true,false};
		System.out.println("*********");
		byte[] by = {20,30,40,50,60};
		for (int i = 0; i < by.length; i++) {
			System.out.println( by[i]);
		}
		System.out.println( "*************");
		for (byte c : by) {
			System.out.println(c);
		}
		
		double[] d = {1.1,2.2,3.3};
		for (int i = 0; i < d.length; i++) {
			System.out.println( d[i]);
		}
		System.out.println("***********");
		for (double e : d) {
			System.out.println(e);
		}
		System.out.println("***********");
		String[] names = {"santhosh","sharath","supreeth"};
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		System.out.println("********");
		for (String name : names) {
			System.out.println(name);
		}
	}
}
