package com.qa.conditionals;

public class Flowcharts {

	public int numOne;
	public int numTwo;
	public boolean input;
	public int a;
	
	public int methodThree(int numOne, int numTwo, boolean input) {
		this.numOne = numOne;
		this.numTwo = numTwo;
		this.input = input;
		
		if (input) {
			return numOne + numTwo;
	}	else {
			return numOne * numTwo;
		}
	
	}
	public void methodFour(int a) {
		this.a = a;
		
		if(a > 2000) {
			System.out.println("A");
		}	else {
			System.out.println("1"); 
			if(a > 100) {
				System.out.println("3");
				else if(a > 600); {
				System.out.println("5");
				}
			else {
					System.out.println("4");
				}
			else {
				System.out.println("2");
			}
		}
		
	}

	
	
}
