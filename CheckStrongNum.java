package com.lab;

import java.util.Scanner;

/* Write a program to check whether a number is a Strong number or not.
 * Strong number is a special number whose sum of factorial of digits is
 * equal to the original number. For example: 145 is a strong number.
 * Since, 1! + 4! + 5! = 145*/

public class CheckStrongNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		int n = num, len = 0 ;
		while(n != 0) {
			len++;
			n /= 10;
		}
		System.out.println("Length of the number : "+len);
		n = num;
		int addition=0;
		for(int i= 0; i < len; i++ ) {
			int mod = n % 10;
			int mul=1;
			for(int j = mod; j > 0; j--) {
				mul *= j; 
			}
			addition += mul;
			n /= 10;
		}
		
		if(addition == num) {
			System.out.println("It's a strong number....!");
		} else {
			System.out.println("Not a strong number!!");
		}
		sc.close();
	}
}