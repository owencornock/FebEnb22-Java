package com.qa.challenge7;


public class Runner {
	
	public static void main(String[] args) {
		

	Person owen = new Person("Owen", 24, "Tech Consultant");
	Person josh = new Person("Josh", 24, "STFC");
	Person tim = new Person("Tim", 24, "Consultant");
	
	System.out.println(owen);
	System.out.println(josh);
	System.out.println(tim);
	
//	List<Person> myPerson = new ArrayList<>();
//	
//	myPerson.add(owen);
//	myPerson.add(tim);
//	myPerson.add(josh);
	
	PersonManager pm = new PersonManager();
	
	pm.addList(tim);
	pm.addList(josh);
	pm.addList(owen);
		
		
	}
	}

