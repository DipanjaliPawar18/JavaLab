/* Write a program to input two numbers and find the maximum between two numbers using the
conditional/ternary operator.*/

package com.lab;
import java.util.Scanner;

public class MaxNum {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter first number : ");
		int num1 = sc.nextInt();
		System.out.print("Enter second number : ");
		int num2 = sc.nextInt();
		
		if(num1>num2) {
			System.out.print("First number is the maximum between the two...");
		}
		else if(num1<num2) {
			System.out.print("Second number is the maximum between the two...");
		}
		else {
			System.out.print("Both are equal...");
		}
		sc.close();
	}
}
