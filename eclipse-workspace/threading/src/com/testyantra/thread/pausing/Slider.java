package com.testyantra.thread.pausing;

public class Slider {

	public static void main(String[] args) {

		System.out.println("main started");

		for(int i=5;i<10;i++) {
			System.out.println(" sliding ");

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}

		}
		System.out.println("main ended");
	}
}
