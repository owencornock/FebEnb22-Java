package com.qa.challenge4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Garage {
	
	
	List<Vehicle> garage = new ArrayList<>();
	
	public void addToGarage(Vehicle input) {
		garage.add(input);
	}
	
	public void bill(Vehicle input) {
			if(input instanceof Car) {
				System.out.println("Bill = £25");
	}		else if(input instanceof Van) {
				System.out.println("Bill = £35");
	}		else if(input instanceof Motorbike) {
				System.out.println("Bill = £40");
	}
				
	}
	
	public void removeVehicle(Vehicle input) {
		garage.remove(input);
	}
	
	public void emptyGarage() {
		garage.clear();
	}
	
//	public void removeVehicleType() {
//		Iterator<Vehicle> gar = garage.iterator();
//		
//		while (gar.hasNext()) {
//			Vehicle number = gar.next();
//			
//			if (number.equals(getClass()))) {
//				garage.remove(number);
//				
//		}
//		}
//			
//		}
//	public void removerE() {
//		garage.remove(getClass());
//	}
//	}
}
