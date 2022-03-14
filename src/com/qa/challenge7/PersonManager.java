package com.qa.challenge7;

import java.util.ArrayList;
import java.util.List;

public class PersonManager {

	private List<Person> myPerson = new ArrayList<>();
	
		public void addList(Person person) {
		myPerson.add(person);
		}
	
		public void search(String name) {
			
			for (int i =0; 1 < myPerson.size(); i++) {
				if(myPerson.get(i).getName().equals(name)) {
					System.out.println(myPerson.get(i));
					return;
				}
		}	System.out.println("No name found");
		}
		
				
	
	
}
