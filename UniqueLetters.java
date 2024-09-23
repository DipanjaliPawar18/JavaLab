package com.lab;

import java.util.Scanner;

/*You need to find and print all the unique characters in a given string.
  Input string : java Output : jv*/

public class UniqueLetters {

	public static void findUniqueChar(String str) {
		
		String uniqueChars = "";
		for(int i = 0; i < str.length(); i++) {
			char currChar = str.charAt(i);
			if(str.indexOf(currChar) == str.lastIndexOf(currChar)) {
				uniqueChars += currChar;
			}
		}
		System.out.println(uniqueChars);
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str = sc.nextLine();
		findUniqueChar(str);
		sc.close();
	}
}