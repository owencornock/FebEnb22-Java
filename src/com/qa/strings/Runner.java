package com.qa.strings;

public class Runner {

	public static void main(String[] args) {

//		String myString = "Message";
//		String anotherString = "Message";
//		
//		if (myString == anotherString) {
//			System.out.println("Success!");
//		}
//		Two different objects
		String myString = new String("Message");
		String anotherString = new String("Message");
		
		
//		Are these objects the same
		if (myString == anotherString) {
			System.out.println("Success!");
		}
//		Are the strings the same
		if (myString.equals(anotherString)) {
			System.out.println("Success!");
			
		}
		
//		Substring - extract things from within other strings
		System.out.println(myString.substring(0, 3));
	
//		Change Case
		System.out.println(myString.toUpperCase());
		System.out.println(myString.toLowerCase());
		
//		Get the char at specific point
		System.out.println(myString.charAt(0));
		
//		Get position/index of a specific char
		System.out.println(myString.indexOf("e"));
		
		
//		Starts with
		System.out.println(myString.startsWith("Mes"));
		
		
		
		
	}
	

}
