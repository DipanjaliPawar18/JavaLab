package com.lab;
@SuppressWarnings("serial")
class CountryNotValidException extends Exception{
	CountryNotValidException(){
		
	}
}

@SuppressWarnings("serial")
class TaxNotEligibleException extends Exception{
	TaxNotEligibleException(){
		
	}
}
@SuppressWarnings("serial")
class EmployeeNameInvalidException extends Exception{
	EmployeeNameInvalidException(){
		
	}
}

class TaxCalculator{
	
	public double calculateTax(String empName,boolean isIndian,double empSal)throws TaxNotEligibleException,CountryNotValidException,EmployeeNameInvalidException {
		
		if(!isIndian) {
			System.out.println("Not Indian...!");
			throw new CountryNotValidException();
		}
		
		if(empName == null || empName.isEmpty()) {
			System.out.println("Name not found...!");
			throw new EmployeeNameInvalidException();
		}
		
		double taxAmount = 0;
		
		if(empSal > 100000) {
			taxAmount = empSal * 8 /100 ;
		} else if(50000 < empSal ) {
			taxAmount = empSal * 6 / 100 ;
		} else if(30000 < empSal ) {
			taxAmount = empSal * 5 / 100 ;
		} else if(10000 < empSal ) {
			taxAmount = empSal * 4 / 100 ;
		} else {
			System.out.println("You are not eligible to pay tax..!");
			throw new TaxNotEligibleException();
		}
		return taxAmount;
	}
}

public class CalculatorSimulator {

	public static void main(String[] args) {

		TaxCalculator tc = new TaxCalculator();
		
		try {
			double tax = tc.calculateTax("Ron", false, 34000);
			System.out.println("Tax Amount for Ron " + tax);
		} catch (Exception e){
			e.printStackTrace();
            System.out.println(e.getMessage());
		}
		System.out.println();
		
		try {
			double tax = tc.calculateTax("Tim", true, 1000);
			System.out.println("Tax Amount for Tim " + tax);
		} catch (Exception e){
			e.printStackTrace();
            System.out.println(e.getMessage());
		}
		System.out.println();
		
		try {
			double tax = tc.calculateTax("Jack", true, 55000);
			System.out.println("Tax Amount for Jack " + tax);
		} catch (Exception e){
			e.printStackTrace();
            System.out.println(e.getMessage());
		}
		System.out.println();
		
		try {
			double tax = tc.calculateTax("", true , 30000);
			System.out.println("Tax Amount for null " + tax);
		} catch (Exception e){
			e.printStackTrace();
            System.out.println(e.getMessage());
		}
	}
}