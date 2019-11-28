package com.testyantra.thread.pausing;

public class TestA {
	public static void main(String[] args) {
		
	

	Object obj1 = new Object();
	Object obj2 = new Object();
	
	Runnable r1 = () -> {
		synchronized (obj1) {
			System.out.println("T1 started");
			System.out.println("t1 has locked obj1");
			
			try {
				obj1.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			synchronized (obj2) {
				System.out.println("T1 has locked obj2");
				
			}
		}
		System.out.println("T1 finished");
	};
		Runnable r2 = () -> {
			synchronized (obj2) {
				System.out.println("T2 started");   
				System.out.println("t2 has locked obj2");
				
				
				
				
				synchronized (obj1) {
					System.out.println("T2 has locked obj1");
					//obj1.notify();//it will notify only one thread which is waiting for that object based on priority
					obj1.notifyAll();//will notify all the threads which are waiting for the objects
				}
			}
			System.out.println("T2 finished");
		};
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();
	

}
}
