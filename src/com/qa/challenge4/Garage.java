package com.qa.challenge4;

import java.util.ArrayList;
import java.util.List;

public class Garage {
	
	
	List<Vehicle> garage = new ArrayList<>();
	
	public void addToGarage(Vehicle input) {
		garage.add(input);
	}
	
	public void removeVehicle(String input) {
		for (Vehicle vehicle : garage) {
			if(vehicle.getId() == input) {
				garage.remove(vehicle);
				return;
			}
		}
	}
}
