package com.qa.iteration;

	public class Coins {
		
		public void methodOne(double cost, double amount) {
			double change = amount - cost;
			int onePence = 0;
			int twoPence = 0;
			int fivePence = 0;
			int tenPence = 0;
			int twentyPence = 0;
			int fiftyPence = 0;
			int onePound = 0;
			int twoPound = 0;
			int fivePound = 0;
			int tenPound = 0;
			int twentyPound = 0;
					
			while (change >= 20) {
				change -= 20;
				twentyPound++;
			}
			if (twentyPound != 0) {
				System.out.println(twentyPound + " £20 notes");
			}
			while (change >= 10) {
				change -= 10;
				tenPound++;
			}
			if (tenPound != 0) {
				System.out.println(tenPound + " £10 notes");
			}
			while (change >= 5) {
				change -= 5;
				fivePound++;
			}
			if (fivePound != 0) {
				System.out.println(fivePound + " £5 notes");
			}
			while (change >= 2) {
				change -= 2;
				twoPound++;
			}
			if (twoPound != 0) {
				System.out.println(twoPound + " £2 coins");
				
			while (change >= 1) {
				change -= 1;
				onePound++;
				}
			if (onePound != 0) {
				System.out.println(onePound + " £1 coins");
				}
			while (change >= 0.5) {
				change -= 0.5;
				fiftyPence++;
			}
			if (fiftyPence != 0) {
				System.out.println(fiftyPence + " 50p coincs");
			}
			while (change >= 0.2) {
				change -= 0.2;
				twentyPence++;
			}
			if (twentyPence != 0) {
				System.out.println(twentyPence + " 20p coins");
			}
			while (change >= 0.1) {
				change -= 0.1;
				tenPence++;
			}
			if (tenPence != 0) {
				System.out.println(tenPence + " 10p coins");
			}	
			while (change >= 0.05) {
				change -= 0.05;
				fivePence++;
			}
			if (fivePence != 0) {
				System.out.println(fivePence + " 5o coins");
			}
			while (change >= 0.019) {
				change -= 0.019;
				twoPence++;
			}
			if (twoPence != 0) {
				System.out.println(twoPence + " 2p coins");
			}
			while (change >= 0.009) {
				change -= 0.009;
				onePence++;
			}
			if (onePence != 0) {
				System.out.println(onePence + " 1p coins");
			}
			}
		
		
		}
		
		
}
