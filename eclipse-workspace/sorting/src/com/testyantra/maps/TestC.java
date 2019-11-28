package com.testyantra.maps;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Set;

public class TestC {

	public static void main(String[] args) {

		LinkedHashMap<String,Integer> lh = new LinkedHashMap<String,Integer>();
		lh.put("bangalore",560068);
		lh.put("haryana", 134203);
		lh.put("patna", 880000);
		
		System.out.println(lh);
		
		Set<String> s = lh.keySet();
		for (String key : s) {//for each and iterator method can also be used
			
			System.out.println("key"+key);
			
		}
		System.out.println("======");
		
		Collection<Integer> c = lh.values();
		for (Integer value : c) {
          
			System.out.println("value"+value);
		}
		
		
		
	}
}
