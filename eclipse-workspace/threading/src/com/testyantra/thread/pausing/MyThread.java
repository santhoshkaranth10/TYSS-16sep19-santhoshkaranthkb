package com.testyantra.thread.pausing;

public class MyThread extends Thread {


	@Override
	public void run() {


		for(int i = 0;i<10;i++) {

			System.out.println("child thread");
			Thread.yield();//this child will wait untill the execution of main thread,it is present in thread class
			//yield is static method present in thread class
		}
	}
}
