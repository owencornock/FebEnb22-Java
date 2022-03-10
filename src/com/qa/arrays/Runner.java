package com.qa.arrays;

public class Runner {

//	public static void main(String[] args) {
//		for(int i : numbers) {
//			System.out.println("number: " + i);
//		}
//	}
//		public static int[] numbers = {0,1,2,3,4,5,6,7,8,9}; {
//
//		}
//		}

		
public static int votes[] = {1,1,2,1,3}

public static void process(int vote) {
    System.out.println(vote);
}

public static void main(String[] args) {
    for(int i = 0; i < votes.length; i++) {
        process(votes[i])
    }
}
}