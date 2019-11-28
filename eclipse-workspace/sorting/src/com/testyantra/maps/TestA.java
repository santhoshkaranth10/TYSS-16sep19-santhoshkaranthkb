package com.testyantra.maps;

import java.util.HashMap;

public class TestA {

	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put("kuku",998014);
		hm.put("mala", 888979);
		hm.put("sheela", 787878);
		hm.put(null, 123456);
		hm.put(null,123459);

		System.out.println("data"+hm);
		hm.put("mala", 989899);
		System.out.println("after modify"+hm);

		hm.put("dimple", 989899);
		System.out.println("after dimple"+hm);

		System.out.println("after null"+hm);
		System.out.println("============");
		System.out.println("after adding duplicate null");
		System.out.println(hm);
		System.out.println("===========");

		Object phoneno = hm.get("sheela");
		System.out.println("value"+phoneno);

		System.out.println("==============");

		Object o =hm.get("she");
		System.out.println("value"+o);

		System.out.println("================");

		Object o1 = hm.remove("sheela");
		System.out.println("value"+o1);

		System.out.println("after remove---->"+hm);
	}
}
