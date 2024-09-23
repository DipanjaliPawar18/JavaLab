package com.lab;
// Write an program to print the array element from 1 to 100 
public class ArrayElements {

	public static void main(String[] args) {

		int arr[] = new int[100];
		
		for(int i = 1; i<=100; i++) {
			arr[i-1] = i;
		}
		
		for(int i = 0; i<100; i++) {
			System.out.println(arr[i] + " ");
		}
	}
}
