package com.lab;

import java.util.Scanner;

/*Question 5: Match the Parenthesis
Write a function in your preferred programming language that takes as
input a sentence containing nested parentheses and the position of an
opening parenthesis. The function should find the corresponding closing 
parenthesis and return its position.
For example, if the input sentence is:
"Sometimes (when I nest my parenthesis (also called parentheticals) too 
many times (like this (and this))) they get quite confusing."
And the position of the opening parenthesis is 10, the function should 
return 79, which is the position of the corresponding closing parenthesis.*/
public class MatchTheParenthesis {
	
	public static void findClosing(String str) {
		int count = 0;
		for(int i = 0; i < str.length(); i++) {
			
			if(str.charAt(i) == '(') {
				count++;
				if(count == 1) {
				System.out.println("The position of the opening parenthesis is : " + i);
				} 
			}
			
			if(str.charAt(i) == ')') {
				count--;
				if(count == 0) {
				System.out.println("The position of the closing parenthesis is : " + i);
				break;
				} 
			}
		}
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentence : ");
		String str = sc.nextLine();
		System.out.println();
		System.out.println("length : "+ str.length());
		
		findClosing(str);
		
		sc.close();
	}
}