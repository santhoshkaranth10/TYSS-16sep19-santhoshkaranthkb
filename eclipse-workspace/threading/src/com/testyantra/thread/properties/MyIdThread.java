package com.testyantra.thread.properties;

public class MyIdThread extends Thread {

	public static void main(String[] args) {
		
		System.out.println("main started");
		
		System.out.println(Thread.currentThread().getId());
		
		MyIdThread mi = new MyIdThread();
		System.out.println("myd thread "+mi.getId());
		
		//we cannot set the id using setId();
		System.out.println("priority "+Thread.currentThread().getPriority());
		
		//Thread.currentThread().setPriority(16); illegalArgumentException 
		
		System.out.println("main ended");
		
	}
}
