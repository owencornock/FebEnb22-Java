package operators;

public class Results {

		public int physics;
		public int chemistry;
		public int biology;
		public int total;
		public int percentage;
		public int biologyP;
		public int chemistryP;
		public int physicsP;
	
		public Results(int physics, int chemistry, int biology) {
			this.physics = physics;
			this.chemistry = chemistry;
			this.biology = biology;
			this.total = physics + biology + chemistry;
		}
		
		


		public void methodOne() {
			System.out.println("Physics: " + this.physics);
			System.out.println("Chemistry: " + this.chemistry);
			System.out.println("Biology: " + this.biology);
			System.out.println("Total: " + this.total);
			
}
		
	
		public void methodTwo() {
			this.percentage = (total * 100) / 450;
			 
			System.out.println("Percentage: " + this.percentage + "%\n");
			if (percentage >= 60) {
				 System.out.println("You have passed"); }
			 else {(percentage < 60)
			 	System.out.println("You have failed"); }
	}

		
		public void percentage(int chemistryP, int biologyP, int physicsP) {
			this.chemistryP = (chemistry * 100) / 150;
            this.biologyP = (biology * 100) / 150;
            this.physicsP = (physics * 100) / 150;
			 if (chemistryP < 60, physicsP >= 60, biologyP > 60) {
				 System.out.println("Chemistry failed, Physics passed, Biology passed"); }
			 else { if (chemistryP > 60, physicsP < 60, biologyP > 60)
				 ;
			 }
		}
}
