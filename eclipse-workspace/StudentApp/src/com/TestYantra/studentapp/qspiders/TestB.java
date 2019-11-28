package com.TestYantra.studentapp.qspiders;

import com.TestYantra.studentapp.jspiders.Remote;
//import static com.TestYantra.studentapp.jspiders.Remote.on;//only static method or variables can be imported in this way
//import static com.TestYantra.studentapp.jspiders.Remote.*;
public class TestB {

	public static void main(String[] ar) {
		Remote.on();
		System.out.println("num");
		Remote r = new Remote();
		System.out.println(r.sum);
	}
	
}
