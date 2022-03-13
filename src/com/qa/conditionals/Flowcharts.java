package com.qa.conditionals;

public class Flowcharts {

	public int numOne;
	public int numTwo;
	public boolean input;
	
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
	

	
	
}
