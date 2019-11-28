package com.testyantra.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class TestG {

	public static void main(String[] args) {

		Employee e1 = new Employee(2,"divya",10000);
		Employee e2 = new Employee(3,"kavya",20000);
		Employee e3 = new Employee(4,"ambika",30000);
		Employee e4 = new Employee(5,"dinesh",40000);
		Employee e5 = new Employee(6,"rajesh",50000);//ctrl+shift+downarrow
		Employee e6 = new Employee(7,"satish",60000);
		Employee e7 = new Employee(1,"keerthi",70000);//ctrl+shift+l-> to see all the shortcuts
		Employee e8 = new Employee(8,"pranay",65000);
		Employee e9 = new Employee(9,"sharath",66000);


		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(e1);
		al.add(e2);
		al.add(e3);

		ArrayList<Employee> al1 = new ArrayList<>();
		al1.add(e4);
		al1.add(e5);
		al1.add(e6);

		ArrayList<Employee> al2 = new ArrayList<Employee>();
		al2.add(e7);
		al2.add(e8);
		al2.add(e9);

		HashMap<String,ArrayList<Employee>>  hm = new HashMap<>();
		hm.put("manager1", al);
		hm.put("manager2", al1);
		hm.put("manager3",al2);

		ArrayList<Employee> manager1 = hm.get("manager1");

		Iterator<Employee> it = manager1.iterator();
		while(it.hasNext()) {
			Employee e = it.next();
			System.out.println(" id  is"+e.id);
			System.out.println("name is"+e.name);
			System.out.println("percentage is"+e.sal);
		}

		ArrayList<Employee> manager2 = hm.get("manager2");

		Iterator<Employee> it1 = manager2.iterator();
		while(it.hasNext()) {
			Employee e = it.next();
			System.out.println(" id  is"+e.id);
			System.out.println("name is"+e.name);
			System.out.println("percentage is"+e.sal);



		}
		ArrayList<Employee> manager3 = hm.get("manager3");

		Iterator<Employee> it3 = manager3.iterator();
		while(it.hasNext()) {
			Employee e = it.next();
			System.out.println(" id  is"+e.id);
			System.out.println("name is"+e.name);
			System.out.println("percentage is"+e.sal);
		}
	}
}
