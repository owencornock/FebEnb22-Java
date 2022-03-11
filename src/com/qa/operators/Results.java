package com.qa.operators;

public class Results {
	
	public int physics;
	public int chemistry;
	public int biology;
	public int total;
	public int percentage;
	
	public Results(int physics, int chemistry, int biology) {
		this.physics = physics;
		this.chemistry = chemistry;
		this.biology = biology;
		this.total = physics + chemistry + biology;
		
	}
	
	public void methodOne() {
		System.out.println("Physics Result: " + physics);
		System.out.println("Chemistry Result: " + chemistry);
		System.out.println("Biology Result: " + biology);
		System.out.println("Total: " + total);
	}
		
	public void methodTwo() {
		this.percentage = (total * 100) / 450;
		System.out.println("Percentage: " + percentage + "%");
		
	}

	
	
}
