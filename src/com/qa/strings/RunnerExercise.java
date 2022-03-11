package com.qa.strings;

import java.util.Scanner;

public class RunnerExercise {
		

		public static int
		countWords(String str)
		{
			
			if (str == null || str.isEmpty())
				return 0;
			
			String[] words = str.split("\\s+");
			
			return words.length;
		}
		
		
		
		public static void main(String args[])
		{
			
			String str = "Hello there General Kenobi";
			
			System.out.println("No of words : " + countWords(str));
			System.out.println(str.replace(" ", "\n"));

//			This reverse all chars not words
//			for(int i=str.length()-1;i>=0;i--)
//			{
//				System.out.println(str.charAt(i));
//				
//			}
//			This outputs in reverse but not vertical ** After comment added (.replace....) This printed in reverse
			String s[] = str.split(" "); 
			String ans = ""; 
			for (int i = s.length - 1; i >= 0; i--) {
			  ans += s[i] + " ";
			}
			System.out.println(ans.replace(" ", "\n"));
		
		}
		
	}
