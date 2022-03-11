package com.qa.strings;

import java.util.List;

public class Exercise {

	public static void main(String[] args) {
//		Question 1
//		String stringOne = new String("yesterday it was raining");
//		String stringTwo = new String("today it is sunny");
//
//		System.out.println(stringOne.toUpperCase() + " " + stringTwo.toUpperCase());
//		
//		System.out.println(stringTwo.toUpperCase().substring(0, 11) + " " + stringOne.toUpperCase().substring(17, 24));
		
//		Question 2
		
		String str = "Hello there General Kenobi";
		
		System.out.println("No of words : " + methodOne(str));
		System.out.println(str.replace(" ", "\n"));
		
		String s[] = str.split(" "); 
		String ans = ""; 
		for (int i = s.length - 1; i >= 0; i--) {
		  ans += s[i] + " ";
		}
		System.out.println(ans.replace(" ", "\n"));

		
	
		
	
		}

	private static String methodOne(String str) {
		// TODO Auto-generated method stub
		return null;
	}



	}

