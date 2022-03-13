package com.qa.conditionals;

public class Taxes {
	
	public int salary;

	public int methodFive(int salary) {
		this.salary = salary;
		
			if (salary >= 45000) {
				return 25;
		}	else if (salary >= 30000 && salary < 44999) {
				return 20;
		}	else if (salary >= 20000 && salary <= 29999) {
				return 15;
		}	else if (salary >=15000 && salary <= 19999) {
				return 10;
		}	else {
				return 0;
		}
	}
	
	public int methodSix(int salary) {
		this.salary = salary;
		
		if (salary >= 45000) {
			return (salary * 25) / 100;
	}	else if (salary >= 30000 && salary < 44999) {
			return (salary * 20) / 100;
	}	else if (salary >= 20000 && salary <= 29999) {
			return (salary * 15) / 100;
	}	else if (salary >=15000 && salary <= 19999) {
			return (salary * 10) / 100;
	}	else {
			return 0;
	}
			
	}
	
	public int methodSeven(int salary) {
		return (salary / 100) * methodFive(salary);
	}
}
	

