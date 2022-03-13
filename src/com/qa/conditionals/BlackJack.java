package com.qa.conditionals;

public class BlackJack {
	
	public int numOne;
	public int numTwo;
	
	public int methodFour(int numOne, int numTwo) {
		this.numOne = numOne;
		this.numTwo = numTwo;
		
		if(numOne > 21 && numTwo > 21) {
			return 0;
		} else if (numOne > 21) {
			return numTwo;
		}	else if(numTwo > 21) {
			return numOne;
//		This will return the max of numOne or numTwo
		}	else {
			return Math.max(numOne, numTwo);
	}
	
	}
	
}
