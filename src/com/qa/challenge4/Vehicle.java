package com.qa.challenge4;

public class Vehicle {

	private int year;
	private int numOfWheels;
	private String colour;
	private int id;
	
	public Vehicle() {}

	public Vehicle(int year, int numOfWheels, String colour, int id) {
		this.year = year;
		this.numOfWheels = numOfWheels;
		this.colour = colour;
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getNumOfWheels() {
		return numOfWheels;
	}

	public void setNumOfWheels(int numOfWheels) {
		this.numOfWheels = numOfWheels;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	@Override
	public String toString() {
		return "Vehicle [year=" + year + ", numOfWheels=" + numOfWheels + ", colour=" + colour + ", id=" + id + "]";
	}


	
	

}


