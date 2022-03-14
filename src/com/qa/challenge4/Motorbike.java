package com.qa.challenge4;

public class Motorbike extends Vehicle{

	private int price;
	private boolean fast;
	
	public Motorbike(int year, int numOfWheels, String colour, int id, int price, boolean fast) {
		super(year, numOfWheels, colour, id);
		this.price = price;
		this.fast = fast;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public boolean isFast() {
		return fast;
	}

	public void setFast(boolean fast) {
		this.fast = fast;
	}

	@Override
	public String toString() {
		return "Motorbike [price=" + price + ", fast=" + fast + ", getId()=" + getId() + ", getYear()=" + getYear()
				+ ", getNumOfWheels()=" + getNumOfWheels() + ", getColour()=" + getColour() + "]";
	}


	
	
}
