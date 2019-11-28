package com.testyantra.exceptions.second;

public class TestA {

	public static void main(String[] args) {
		System.out.println("main started");

		try {

			Thread.sleep(3000);
			System.out.println("inside try");

		} catch (InterruptedException e) {

			System.out.println("exception caught");
			e.printStackTrace();
		}

		System.out.println("main ended");
	}
}
