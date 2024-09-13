/*
 Create a Bank class and declare an instance variable named amount of type double.
 Create parameterized constructor to initialize variable “amount” with value 10000.
 Create two methods withdraw(double withdrawalAmount) and deposit(double depositAmount).
 Calculate withdrawal based on some condition (using ternary operator) like If amount is
 sufficient then “withdraw successful” message will be printed on the console and amount
 should be updated after withdraw. Later on, deposit 5000 in the account balance.At the
 end display total balance on the console.
*/

package com.lab;

public class Bank {
	
	double amount;
	
	Bank(double amount){
		this.amount = amount;
	}
	
	public void withdraw(double withdrawalAmount) {
		/*String status = (withdrawalAmount <= amount) ? "withdraw successful...!" : "You don't have sufficient balance!!!";
		System.out.println(status);
		
		if(status == "withdraw successful...!") {
			amount = amount - withdrawalAmount;*/
		
		if(withdrawalAmount <= amount) {
			amount = (withdrawalAmount <= amount) ? (amount -= withdrawalAmount):amount;
			System.out.println("withdraw successful...!");
		}
		else {
			System.out.println("You don't have sufficient balance!!!");
		}
	}

	public void deposit(double depositAmount) {
		amount = amount + depositAmount;
		System.out.println("Amount successfully deposited...!");
	}
	
	public static void main(String[] args) {

		Bank b = new Bank(10000);
		
		b.deposit(3000);
		
		b.withdraw(5000);
		
		System.out.println("Available balance is : " + b.amount);
		
		b.withdraw(9000);
	}

}