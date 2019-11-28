package com.testyantra.sorting.set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TestI {


public static void main(String[] args) {
	
	Comparator<Employee> comp = (e1,e2)->{
       
		if(e1.id > e2.id) {
			return 1;
		}else if(e1.id < e2.id) {
			return -1;
		}else {
			return 0;
		}
	};
	
	TreeSet<Employee> ts = new TreeSet<Employee>(comp);
	
	Employee e1 = new Employee(1,"santhosh",5.6);
	Employee e2 = new Employee(2,"sharath",6.1);  //tree set is always used for sortng so ifwe are not giving any sorting order it will
	//give class-cast exception
	Employee e3 = new Employee(3,"supreeth",6.0);
	Employee e4 = new Employee(4,"shrinivas",6.2);
	
	ts.add(e1);
	ts.add(e2);
	ts.add(e3);
	ts.add(e4);
	
	System.out.println("*using iterator**");
	Iterator<Employee> it = ts.iterator();
	while(it.hasNext()){
		Employee e = it.next();
		System.out.println("name is"+e.name);
		System.out.println("id is"+e.id);
		System.out.println("height is"+e.height);
	}
}
}

