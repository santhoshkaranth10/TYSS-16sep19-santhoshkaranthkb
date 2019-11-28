package com.testyantra.typecasting.reference;

public class TestB {

	public static void main(String[] args) {
		Pen p = new Pen();
		p.write();
		Pen p1 = new Marker();//up_casting
		System.out.println(p.cost);
		p1.write();
		//System.out.println(p.size);//not possible
        //p.color() not possible
		Marker m =(Marker) p; //down_casting
		System.out.println(m.size);
		m.color();
		m.write();
	}
}
