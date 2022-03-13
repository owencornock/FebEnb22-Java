package com.qa.conditionals;

public class CalculatorRevisited {

	public int add(int a, int b) {
		return a + b;
	}
	
	public int minus(int a, int b) {
		return a - b;
	}
	
	public int multiply(int a, int b) {
		return a * b;
	}
		
	public double divide(int a, int b) {
		if (a >= b) {
				System.out.println("Division cannot be performed");
				return 0;
		} else {
				double x = a;
				double y = b;
				return x / y;
	}


}
}
