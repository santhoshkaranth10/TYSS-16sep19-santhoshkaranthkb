package com.testyantra.thread.pausing;

public class MyJoinThread extends Thread {

	@Override
	public void run() {
		for(int i=1;i<10;i++) {
			System.out.println("child thread");
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
