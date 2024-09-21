package com.lab;

/* Create a program to calculate the annual salary of an
 * employee by using inheritance. Create a class named 
 * "User" with the following properties and methods: 
 * Properties: id(int): representing the id of the User 
 * name(String):representing the name of the User 
 * Constructor: Declare parameterized constructor to 
 * initialize id and name.
 * Create a subclass named "Employee" that inherits from 
 * the "User" class. Add the following additional properties 
 * and methods: Properties: salary(double):representing the
 * monthly salary of the employee Method: 
 * double calculateAnnualSalary():to calculate the annual 
 * salary earned by the employee. In the main method, 
 * create an object of "Employee" class. Calculate the annual 
 * salary of the employee and display it.. [Hint:Use constructor 
 * or setter methods to set the value]*/

class User{
	int id;
	String name;
	
	User(int id, String name){
		this.id = id;
		this.name = name;
	}
}

class Employee extends User{
	double monthlySalary;
	
	Employee(int id, String name, double salary){
		super(id,name);
		this.monthlySalary = salary;
		
		System.out.println("Name : " + name + "\nid : " + id + "\nMonthly salary : " + salary);
	}
	
	public double calculateAnnualSalary() {
		double anualSalary = monthlySalary * 12;
		return anualSalary;
	}
	
}

public class EmployeeEx {
	
	public static void main(String[] args) {
		
		Employee e = new Employee(12, "Joe", 50000);
		
		double salary = e.calculateAnnualSalary();
		System.out.println("Anual salary of the employee is : " + salary);
	}

}
