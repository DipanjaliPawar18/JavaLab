package com.lab;

import java.util.Scanner;

/* Write a program to check leap year using if else.
 * How to check whether a given year is a leap year
 * or not. [Hint:Take an input of any number. Store
 * it in some variable say year. If a year is exactly
 * divisible by 4 and not divisible by 100, then it
 * is a leap year. Or if a year is exactly divisible by
 * 400 then it is a leap year.]*/
public class LeapYearCheck {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year : ");
		int year = sc.nextInt();
		
		if(year % 100 == 0) {
				if(year % 400 == 0) {
					System.out.println("Yeah!! It's a leap year...");
				}
				else {
					System.out.println("Not a leap year!!! ");
				}
		}
		else if(year % 4 == 0 ) {
			System.out.println("This is a leap year... ");
		} 
		else {
			System.out.println("Not a leap year!!! ");
		}
		sc.close();
	}
}