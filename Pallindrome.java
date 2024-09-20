package com.lab;

import java.util.Scanner;

/*Write code to determine if the string is a palindrome.
Input String : Madam 
Output : Madam is a Palindrome*/

public class Pallindrome {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str = sc.nextLine();
		
		int len = str.length();
		for(int i =0; i <= len/2; i++) {
			if(str.charAt(i) == str.charAt(len-i-1)) {
				if(i == len/2) {
					System.out.println(str + " is palindrome...!");
				} else {
					continue;
				}	
			} else {
				System.out.println(str + " is not palindrome!!!");
				break;
			}
		}
		sc.close();
	}
}