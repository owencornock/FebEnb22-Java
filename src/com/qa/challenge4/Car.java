package com.qa.challenge4;

public class Car extends Vehicle {

	private int price;
	private int seats;
	

	public Car(int year, int numOfWheels, String colour, int id, int price, int seats) {
		super(year, numOfWheels, colour, id);
		this.price = price;
		this.seats = seats;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	@Override
	public String toString() {
		return "Car [price=" + price + ", seats=" + seats + ", getId()=" + getId() + ", getYear()=" + getYear()
				+ ", getNumOfWheels()=" + getNumOfWheels() + ", getColour()=" + getColour() + "]";
	}


	
	
}
