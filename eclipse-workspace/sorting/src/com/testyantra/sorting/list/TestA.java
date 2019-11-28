package com.testyantra.sorting.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestA {

	public static void main(String[] args) {

		ArrayList<Student> al = new ArrayList<Student>();

		Student s1 = new Student(1,"dimple",35.5);
		Student s2 = new Student(2,"Santhosh",90.0);
		Student s3 = new Student(3,"sharath",95.5);
		Student s4 = new Student(4,"ramya",70.0);

		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		System.out.println("before sorting-->");
		displayStudentDetails(al);
		Collections.sort(al);
		System.out.println("after sorting--->");
		displayStudentDetails(al);

	}
	static void displayStudentDetails(ArrayList<Student> al) {
		Iterator<Student> it = al.iterator();
		while(it.hasNext() ) {
			Student s = it.next();
			System.out.println("id is "+s.id);
			System.out.println("name is"+s.name);
			System.out.println("percentage is"+s.per);
		}

	}

}
