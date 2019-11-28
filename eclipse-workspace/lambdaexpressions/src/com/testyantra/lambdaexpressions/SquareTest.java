package com.testyantra.lambdaexpressions;

public class SquareTest {

	public static void main(String[] args) {
		SquareInterface sq = x->x*x;
		int value = sq.square(10);
		System.out.println("square is "+value);
	}
}
