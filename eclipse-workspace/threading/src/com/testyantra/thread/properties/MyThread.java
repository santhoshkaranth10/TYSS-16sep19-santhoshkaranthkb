package com.testyantra.thread.properties;

public class MyThread extends Thread {

	public static void main(String[] args) {

		System.out.println("main started");
		String name = 	Thread.currentThread().getName();//it returns the name of the current executing thread.
		System.out.println("current thread "+name);
		
		MyThread t1 = new MyThread();
		String mname = t1.getName();
		System.out.println("mname is "+mname);
		Thread.currentThread().setName("kavya");//to change the name of the thread
		t1.setName("goku");
		System.out.println("MyThread name "+t1.getName());
		System.out.println(10/0);

		System.out.println("main ended");
	}
}
