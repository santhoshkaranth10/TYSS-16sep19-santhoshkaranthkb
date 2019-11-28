package com.testyantra.java8features;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Helper {

		void displayAllStudents(ArrayList<Student> al) {

			Iterator<Student> it = al.iterator();

			while(it.hasNext()) {
				Student s = it.next();
				System.out.println("id is"+s.id);
				System.out.println("name  is "+s.name);
				System.out.println("percentage is"+s.per);
			}
		}

		void displayFailedStudents(ArrayList<Student> al) {
			List<Student> l =al.stream().filter(i-> i.per < 40).collect(Collectors.toList());
		

		Iterator<Student> it1 = al.iterator();
		while(it1.hasNext()) {
			Student s1 = it1.next();
			System.out.println("id is"+s1.id);
			System.out.println("name  is "+s1.name);
			System.out.println("percentage is"+s1.per);
		}
		};

	void displayPassedStudents(ArrayList<Student> al) {
		List<Student> l1 =al.stream().filter(i->i.per > 40).collect(Collectors.toList());

		Iterator<Student> it2 = al.iterator();
		while(it2.hasNext()) {
			Student s2 = it2.next();
			System.out.println("id is"+s2.id);
			System.out.println("name  is "+s2.name);
			System.out.println("percentage is"+s2.per);
		}
	}
	void TopperOfClass(ArrayList<Student> al) {
		Comparator<Student> comp = (m1 , m2) -> {
			if(m1.per > m2.per) {
				return 1;
			}else if(m1.per < m2.per) {
				return -1;
			}else {
				return 0;
			}
		};
		Student i =al.stream().max(comp).get();
		System.out.println("topper is"+i.name);



	}
}










