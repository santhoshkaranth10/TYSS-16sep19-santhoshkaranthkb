package com.testyantra.thread.pausing;

public class TestJoin {

	public static void main(String[] args) {
		
		System.out.println("main started");
		
		MyJoinThread t = new MyJoinThread();
		t.start();
		
		try {
			
			t.join(10000);
			
			//checked exception can be handled using 2 ways using throws keyword or add try catch block
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		for(int i=0;i<10;i++) {
			System.out.println("main thread");
		}
		
		System.out.println("main ended");
	}
}
