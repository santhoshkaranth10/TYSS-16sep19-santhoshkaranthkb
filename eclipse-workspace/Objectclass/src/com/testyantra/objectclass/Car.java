package com.testyantra.objectclass;

public class Car {

	int cost;
	String brand;
	String color;
	
	public Car(int cost, String brand, String color) {
		super();
		this.cost = cost;
		this.brand = brand;
		this.color = color;
	}
	
	@Override
	public int hashCode() {
		return cost;
	}
	
	@Override
	public String toString() {
		return " cost of "+ cost + " brand " + brand + " color is "+color;
	}
	
	void printDetails() {
		System.out.println(cost);
		System.out.println("brand");
		System.out.println("color");
	}
}
