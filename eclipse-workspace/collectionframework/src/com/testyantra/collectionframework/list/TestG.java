package com.testyantra.collectionframework.list;

import java.util.ArrayList;

public class TestG {

	public static void main(String[] args) {
		ArrayList<Student> al= new ArrayList<Student>();
		Student s1 = new Student(101,"santhosh",45.55);
		Student s2 = new Student(102,"sharath",50.00);
		Student s3 = new Student(102,"shahrukh",50.00);
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		for(int i=0; i<al.size();i++) {
			
			Student s = al.get(i);
			System.out.println("id is"+s.id);
			System.out.println("name is"+s.name);
			System.out.println("percentage is"+s.per);
		}	
			System.out.println("=========using foreach=======");
			
			for (Student s : al) {
				System.out.println(s);
			}
		}
	}

