package com.qa.conditionals;

public class Runner {
	
	public static void main(String[] args) {
		
//	Results Revisited
//	ResultsRevisited r = new ResultsRevisited(120, 91, 65);
//	r.methodOne();
//	r.methodTwo();
//	
//  Flowcharts
//	Flowcharts f = new Flowcharts();
//	int result = f.methodThree(15, 6, true);
//	System.out.println(result);

//	Blackjack
//	BlackJack b = new BlackJack();
//	int result = b.methodFour(22, 5);
//	System.out.println(result);
		
//	Unique Sum
//	UniqueSum u = new UniqueSum();
//	int result = u.methodFour(6, 5, 4);
//	System.out.println(result);

//	Taxes
	Taxes t = new Taxes();
	
	int result = t.methodFive(130000);
	int resultT = t.methodSix(20000);
	int resultTt = t.methodSeven(20000);
	
	System.out.println("tax: " + result + "%");
	System.out.println("Taxed amount: " + "£" + resultT);	
	System.out.println("Taxed amount: " + "£" + resultTt);
	}



	

}
