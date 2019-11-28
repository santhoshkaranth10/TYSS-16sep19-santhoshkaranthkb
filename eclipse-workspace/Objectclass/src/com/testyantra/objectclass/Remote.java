package com.testyantra.objectclass;

public class Remote {

	void add() {
		System.out.println("add() method");
	}
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		Remote r = new Remote();
		Class c = r.getClass();//c is a variable which is of type class
		Object o = c.newInstance();//2nd way of creating an object and the variable is stored in 'o' of type object.
		Remote q = (Remote)o;//down-casting object to remote 
		q.add();
		
	}
}
