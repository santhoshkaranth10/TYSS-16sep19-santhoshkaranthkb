package com.testyantra.didemo;

import com.testyantra.didemo.dao.I;
import com.testyantra.didemo.util.Manager;

public class MainClass {

	public static void main(String[] args) {
		
		Manager manager = new Manager();
		//injecting dependency
		I i = manager.getI();
		
		i.m1();
		i.m2();
		i.m3();
	}
}
