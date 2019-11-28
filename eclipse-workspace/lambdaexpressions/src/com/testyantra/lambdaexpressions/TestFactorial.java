package com.testyantra.lambdaexpressions;

public class TestFactorial {

	public static void main(String[] args) {
	
		FactorialInterface facti = (int n)->{
			int fact =1;
			for(int i =1; i<=n; i++) {
				fact = fact * i;
			}
			return fact;
		};
		
		int factorial = facti.fact(5);
		System.out.println("faxtorial is"+factorial);
	}
}
