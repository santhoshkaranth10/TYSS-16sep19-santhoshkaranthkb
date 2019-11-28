package com.testyantra.arrays;

public class TestB {

	public static void main(String[] args) {
		int[] nums = {10,20,30,40};
		String[] str = {"java","computer","c","c++"};
				//System.out.println(nums[10]);//ArrayIndexOutOfBoundException
				receive(nums);
		int[] values = getArray();
		for (int val : values) {
			System.out.println(val);
		}
	}

	static void receive(int[] numbers) {
		for(int num : numbers) {
			System.out.println(num);
		}
	}
		static void response(String[] str) {
			for (String s : str) {
				System.out.println(s);
			}
			}
		
	

	static int[] getArray() {
		int[] values = {20,30,40,50};
		return values;
	}
	static string[] getString{
		
	}

	static void pass(String str) {

	}