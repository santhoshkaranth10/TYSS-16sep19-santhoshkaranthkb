package com.testyantra.maps;

import java.util.Hashtable;

public class TestH {

	public static void main(String[] args) {
		
		Hashtable<Integer,String> ht = new Hashtable<Integer, String>();
		ht.put(400, "ajay");
		ht.put(500, "vijay");
		ht.put(350, "sonu");
		ht.put(99, "monu");
		ht.put(101, "sriram");
//		ht.put(null, "john"); not even one null value is allowed-> nullPointerException
//		ht.put(108, null); even this is not allowed
		
		System.out.println("data"+ht);
	}
}
