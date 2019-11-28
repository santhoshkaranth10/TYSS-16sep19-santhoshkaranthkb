package com.testyantra.threading;

public class TestRunnable {

	public static void main(String[] args) {
		System.out.println("main started");
		MyRunnable mr = new MyRunnable();
		//mr.start(); start is undefined in MyRunnable   
		Thread t = new Thread(mr);
		t.start();
		
		System.out.println("main ended");
		
	}
}
