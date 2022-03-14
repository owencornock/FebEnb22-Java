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
		
	public String methodFour(Integer input) {
		
		if(input > 2000) {
				return "A";
		}	else if(input <= 2000){
				return "1";
			if(input > 100) {
				return "3";
			if(input > 600) {
				return "5";
		}	else if(input <= 600) {
				return "4";
			if(input > 500) {
				return "6";
		}	else if(input <= 500) {
				return "7";
		}
		}
			}	
			

			}
		}
		
	}

	
	

