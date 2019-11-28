package com.testyantra.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class TestF {

	public static void main(String[] args) {

		Student s1 = new Student(2,"divya",67.89);
		Student s2 = new Student(3,"kavya",66.05);
		Student s3 = new Student(4,"ambika",67.85);
		Student s4 = new Student(5,"dinesh",67.95);
		Student s5 = new Student(6,"rajesh",65.85);//ctrl+shift+downarrow
		Student s6 = new Student(7,"satish",90.65);
		Student s7 = new Student(1,"keerthi",55.85);//ctrl+shift+l-> to see all the shortcuts
		Student s8 = new Student(8,"pranay",45.85);
		Student s9 = new Student(9,"sharath",89.85);


		ArrayList<Student> al = new ArrayList<Student>();
		al.add(s1);
		al.add(s2);
		al.add(s3);

		ArrayList<Student> al1 = new ArrayList<>();
		al1.add(s4);
		al1.add(s5);
		al1.add(s6);

		ArrayList<Student> al2 = new ArrayList<Student>();
		al2.add(s7);
		al2.add(s8);
		al2.add(s9);

		HashMap<String,ArrayList<Student>>  hm = new HashMap<>();
		hm.put("first", al);
		hm.put("second", al1);
		hm.put("third",al2);
		
		ArrayList<Student> first = hm.get("second");
		
		Iterator<Student> it = first.iterator();
		while(it.hasNext()) {
			Student s = it.next();
			System.out.println(" id  is"+s.id);
			System.out.println("name is"+s.name);
			System.out.println("percentage is"+s.per);
		}



	}
}
