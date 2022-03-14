package com.qa.challenge4;

public class Van extends Vehicle{

	private String name;
	private boolean storageSpace;

	public Van(int year, int numOfWheels, String colour, int id, String name, boolean storageSpace) {
		super(year, numOfWheels, colour, id);
		this.name = name;
		this.storageSpace = storageSpace;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isStorageSpace() {
		return storageSpace;
	}

	public void setStorageSpace(boolean storageSpace) {
		this.storageSpace = storageSpace;
	}

	@Override
	public String toString() {
		return "Van [name=" + name + ", storageSpace=" + storageSpace + ", getId()=" + getId() + ", getYear()="
				+ getYear() + ", getNumOfWheels()=" + getNumOfWheels() + ", getColour()=" + getColour() + "]";
	}


	
}
