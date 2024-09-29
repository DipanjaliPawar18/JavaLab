package com.lab;

import java.util.ArrayList;

//.Write a Java program that calculates the sum of all even numbers present in an 
//ArrayList of integers.
public class SumOfAllEvenInArrayList {

	public static void main(String[] args) {
		// arraylist of type integer
		ArrayList<Integer> a = new ArrayList<>();
		// add elements to the arraylist
		a.add(35);
		a.add(12);
		a.add(132);
		a.add(89);
		a.add(10);
		a.add(6);
		a.add(75);
		
		int sum = 0; 
		
		// iterate through each element of arraylist one by one
		for(Integer o : a) {
			System.out.print(o + " "); // Print elements of the arraylist
			
			// if the element is even then add it to sum
			if(o%2 == 0) {
				sum += o;
			}
		}
		System.out.println();
		System.out.println("Sum of all even numbers present in Arraylist : " + sum);
	}
}