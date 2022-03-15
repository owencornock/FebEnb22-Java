package com.qa.challenge4;

public class Runner {

	public static void main(String[] args) {
		
		Car carOne = new Car(2000, 4, "blue", 1, 20000, 5);
		Motorbike mbOne = new Motorbike(2005, 2, "Chrome", 2, 15000, true);
		Van vanOne = new Van(2020, 3, "White", 3, "VannyVan", true);
			
		Garage garage = new Garage();
		garage.addToGarage(vanOne);
		garage.addToGarage(mbOne);
		garage.addToGarage(carOne);
		
		garage.bill(vanOne);
		
		garage.removeVehicle(vanOne);
		
		garage.emptyGarage();
		
		garage.removeVehicleType();
		
		garage.removerE();
	}
}
