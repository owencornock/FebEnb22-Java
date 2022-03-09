package com.qa.constructors;

public class Runner {

		public static void main(String[] args) {
			
			Person owen = new Person("Owen", 24, 9);
			System.out.println("Name: " + owen.name);
			System.out.println("Age: " + owen.age);
			System.out.println("Shoe Size: " + owen.shoeSize);
			
			System.out.println();
			
			Person john = new Person("John", 30, 13);
			System.out.println("Name: " + john.name);
			System.out.println("Age: " + john.age);
			System.out.println("Shoe Size: " + john.shoeSize);
			
			                       
					
		}
}
