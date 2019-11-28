package com.testyantra.thread.pausing;

public class Counter {
	int v;

	synchronized public void increment() {
		v++;
	}
	synchronized public void decrement(){
		v--;
	}
	synchronized public void showvalue() {
		System.out.println("v valie is "+v);
	}

}
