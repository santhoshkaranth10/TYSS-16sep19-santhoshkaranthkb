package com.testyantra.maps;

import java.util.Map;
import java.util.TreeMap;

public class TestE {

	public static void main(String[] args) {
		
		TreeMap<String,Integer> tm = new TreeMap<String,Integer>();//same like treeset behaviour 
		tm.put("patna",560068);
		tm.put("haryana", 134203);
		tm.put("bangalore", 880000);
		//tm.put(null,787899);//null pointer exception
		//if we add other than generic we will get class-cast exception
		
		for(Map.Entry<String,Integer> m : tm.entrySet()) {
			String key = m.getKey();
			Integer value = m.getValue();
			System.out.println("key is"+key);
			System.out.println("value is "+value);
			System.out.println("==========");
			//based on key we will get the sorting output
		}
	}
}
