package com.testyantra.maps;

import java.util.HashMap;

public class TestB {

	public static void main(String[] args) {

		HashMap hm = new HashMap();
		hm.put("kuku",998014);
		hm.put("mala", 888979);
		hm.put("sheela", 787878);

		HashMap hm1 = new HashMap();
		hm1.put("deepu",878979);
		hm1.put("riya", 7878979);
		hm1.put("kriti", 978979);

		boolean hasKey = hm.containsKey("mala");
		System.out.println("has key"+hasKey);
		
		System.out.println("=============");
		
		boolean hasValue  =	hm.containsValue(978979);
		System.out.println("has value"+hasValue);
		
		hm.putAll(hm1);//no return type it doesnot return anything
		//to copy one hashmap value to another use putall()
		System.out.println("==============");
		
		System.out.println("after put all"+hm);
		
		System.out.println(hm.size());//to check the size of map
		System.out.println("=========");
		
		boolean isEmpty = hm.isEmpty();
		System.out.println("is empty"+isEmpty);//to check if the map is empty or not.
		
		hm.clear();
		System.out.println("after clear"+hm);
		
		
	}
}

