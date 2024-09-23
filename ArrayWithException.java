package com.lab;

import java.util.Scanner;

@SuppressWarnings("serial")
/*Create a program with a logic that throws the  
ArrayIndexOutOfBoundsException while accessing 
elements in an array. */
class UserDefinedExcep extends Exception{
	UserDefinedExcep(){
		
	}
}

public class ArrayWithException {

	public static void checkIndex(int[] arr) throws UserDefinedExcep{
		for(int i =0; i <= arr.length; i++) {	
			if(i<0 || i>arr.length-1) {
				throw new UserDefinedExcep();
			} else {
				System.out.println("Element at index " + i +" is " + arr[i]);
			}
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the elements of the array : ");
		for(int i =0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		try {
			checkIndex(arr);
		} catch(UserDefinedExcep e){
			System.out.println("Exception occurred!!!");
		}
		sc.close();
	}
}