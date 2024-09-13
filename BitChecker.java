/* Write a program to declare two variables num and n and take an input during compilation
time to check whether the nth bit of the given number is set (1) or not (0).*/

package com.lab;
import java.util.Scanner;

public class BitChecker {

public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		System.out.print("Enter the number of bit you want to check : ");
		int n = sc.nextInt();
		int check = (num & (1 << n)) ;
		
		System.out.println(check);	
		
		if(check != 0) {
			System.out.print("The bit is set");
		}
		else {
			System.out.print("The bit is not set");
		}
		
		sc.close();
	}
}