package com.testyantra.sorting.list;

public class Student implements Comparable<Student> {

	int id;
	String name;
	double per;
	
	public Student(int id, String name, double per) {
		super();
		this.id = id;
		this.name = name;
		this.per = per;
	}
		
//		@Override
//		public int compareTo(Student s) {
//			if(this.id > s.id) {  //this will sort the id in ascending order
//				return 1;
//				
//			}else if(this.id<s.id) {
//				return -1;
//			}else {
//				return 0;
//			}
//	}
	
//	@Override
//	public int compareTo(Student s) {
//		if(this.per > s.per) { 
//			return 1;
//			
//		}else if(this.per < s.per) {
//			return -1;
//		}else {
//			return 0;
//		}
//	}
	
//	@Override
//	public int compareTo(Student s) {
//		String p =this.name;
//		String q = s.name;
//		return p.compareTo(q); 
//}
	//@Override
//	public int compareToIgnoreCase(Student s) {
//		String p = this.name;
//		String q = s.name;
//		return p.compareToIgnoreCase(q);
//}
	
	@Override
	public int compareTo(Student s) {
		//int i = this.id;
		//int j = s.id;//this should not be done because int is just a primitive type but Integer is wrapper class
		Integer i =this.id;
		Integer j =s.id;
		return i.compareTo(j);
	}
}

	


