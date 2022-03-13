package com.qa.conditionals;

public class ResultsRevisited {
	
	public int physics;
	public int chemistry;
	public int biology;
	public int total;
	public int percentage;
	public int chemistryP;
	public int biologyP;
	public int physicsP;
	
	public ResultsRevisited(int physics, int chemistry, int biology) {
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
		this.chemistryP = (chemistry * 100) / 150;
		this.biologyP = (biology * 100) / 150;
		this.physicsP = (physics * 100) / 150;
		
		if (percentage < 60) {
			System.out.println("You have failed all exams: " + percentage + "%");	
	} 	else if (chemistryP < 60) {
			System.out.println("You have failed overall: " + percentage + "%" + "\n" + "You have failed Chemistry: " + chemistryP + "%" + "\n" + "You have passed Physics: "  + physicsP + "%" + "\n" + "You have passed BiologyP: " + biologyP + "%");
	}	else if (biologyP < 60) {
			System.out.println("You have failed overall: " + percentage + "%" + "\n" + "You have passed Chemistry: " + chemistryP + "%" + "\n" + "You have passed Physics: "  + physicsP + "%" + "\n" + "You have failed BiologyP: " + biologyP + "%");
	}	else if (physicsP < 60) {
			System.out.println("You have failed overall: " + percentage + "%" + "\n" + "You have passed Chemistry: " + chemistryP + "%" + "\n" + "You have failed Physics: "  + physicsP + "%" + "\n" + "You have passed BiologyP: " + biologyP + "%");
	}	else {
		System.out.println("You have passed all exams" + "\n" + "Percentage: " + percentage + "%");
		
	}	
}
}