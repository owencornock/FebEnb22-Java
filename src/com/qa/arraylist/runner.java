package com.qa.arraylist;

import java.util.ArrayList;
import java.util.List;

public class runner {

	public static void main(String[] args) {
//		Create a new arraylist
		List<String> listOfStrings = new ArrayList<>();
//									List.of("Hello", "There");    This creates everything in instead of empty list

//		How to add to the list
		listOfStrings.add("Hello");
		listOfStrings.add("There");
		
//		listOfStrings.get(0);
//		How we get values out
		System.out.println(listOfStrings.get(0));
		
		listOfStrings.set(0, "New Hello");
//		Change a value at a specified index in the array list
		System.out.println(listOfStrings.get(0));
		
//		Remove the element from the list and change the length of the list
		listOfStrings.remove(1);
		System.out.println(listOfStrings);
		
//		Get the length of the array list
		System.out.println("The Length is: " + listOfStrings.size()); 
		
//		Clear the aray list (remove all values)		
		listOfStrings.clear();
		System.out.println(listOfStrings);
		
		for(int i = 0; i < listOfStrings.size(); i++) {
			System.out.println(listOfStrings.get(i));
		}
		
		for(String str : listOfStrings) {
			System.out.println(str);
		}
//		Gives us the index position of an element, if it's there
		System.out.println(listOfStrings.indexOf("There"));
		
		
	}
	
	

}
