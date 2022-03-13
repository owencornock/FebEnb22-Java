package com.qa.conditionals;

public class BlackJack {
	
	int numOne;
	int numTwo;
	
	public int methodFour(int numOne, int numTwo) {
		this.numOne = numOne;
		this.numTwo = numTwo;
		
		if (numOne <= 21 && numOne > numTwo) {
			return numOne;
	}	else if(numTwo <= 21 && numOne < numTwo) {
			return numTwo;
	}	else if(numOne > 21 && numTwo > 21) {
			return 0;
	}
	}
	
}
