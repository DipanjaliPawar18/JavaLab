package com.lab;

/* Create abstract class vaccine.Create two variables 
 * age(int),nationality(String).create 2 concrete methods 
 * firstDose() and secondDose(). Scenario 1:user can take 
 * the first dose if the user is Indian and age is 18.
 * After vaccination the user has to pay 250rs(which will 
 * be displayed on the console). Scenario 2: Users are 
 * eligible to take the second dose only after completing 
 * the first dose. Scenario 3: create abstract method 
 * boosterDose() in abstract class Vaccine.Create one 
 * implementation class vaccinationSuccessful, where 
 * implement boosterDose() method. Create main class 
 * vaccination and invoke all methods accordingly. 
 * [Hint:Create constructor to initialize variables age 
 * and nationality,Use flow control(Ifelse) to check condition] */

abstract class Vaccine{
	int age;
	String nationality;
	
	void boosterDose(){};
	
	public void firstDose() {
		System.out.println("You can take the first dose...!");
		System.out.println("After vaccination the you have to pay 250rs...!");
	}
	
	public void secondDose() {
		System.out.println("Once you get vaccinated with first dose..."
				+ " you are eligible for second one also !!!");
	}
}

class VaccinationSuccessful extends Vaccine{
	
	VaccinationSuccessful(int age, String ntion){
		
		this.age = age;
		this.nationality = ntion;

		if(age >= 18 && ntion == "Indian") {
			super.firstDose();
			super.secondDose();
			this.boosterDose();
		} else {
			System.out.println("You can't get vaccinated yet !!!");
		}
	}
	
	void boosterDose(){
		System.out.println("You can take booster dose if you are done with previous two...!");
	}
}

public class Vaccination {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
	
		VaccinationSuccessful v = new VaccinationSuccessful(21, "Indian");
		System.out.println();
		VaccinationSuccessful v1 = new VaccinationSuccessful(17, "Indian");
	}
}