package com.qa.conditionals;

public class UniqueSum {

	public int numOne;
	public int numTwo;
	public int numThree;
	
	public int methodFour(int numOne, int numTwo, int numThree) {
		this.numOne = numOne;
		this.numTwo = numTwo;
		this.numThree = numThree;
	
		if (numOne == numTwo && numOne == numThree) {
			return 0;
		} else if (numOne == numTwo) {
			return numThree;
		} else if (numOne == numThree) {
			return numTwo;
        } else if (numTwo == numThree) {
        	return numOne;
        } else {
        	return numOne + numTwo + numThree;
        }
	
	}
}
