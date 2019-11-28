package com.testyantra.maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class TestD {

	public static void main(String[] args) {
		
		LinkedHashMap<String,Integer> lh = new LinkedHashMap<String,Integer>();//properties is same as linked hashset
		lh.put("bangalore",560068);
		lh.put("haryana", 134203);
		lh.put("patna", 880000);
		
		for(Map.Entry<String, Integer> m : lh.entrySet()) {//if we want to loop through both keys and values use "map.entry" 
			
			String key = m.getKey();
			Integer value = m.getValue();
			System.out.println("key is "+key+"----"+"value is "+value);
			System.out.println("===========");
		}
		
	}
}
