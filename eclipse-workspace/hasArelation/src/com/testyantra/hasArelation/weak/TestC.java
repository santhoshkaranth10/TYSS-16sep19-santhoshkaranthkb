package com.testyantra.hasArelation.weak;

public class TestC {

	public static void main(String[] args) {
		Person p = new Person();
		System.out.println(p.name);
		p.sleep();
		p.eat();
		System.out.println("**************");
		System.out.println(p.m.color);//has-a-relation
		System.out.println(p.m.size);//has-a-relation
		p.m.write();
		
	}
}
