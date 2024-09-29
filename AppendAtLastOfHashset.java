package com.lab;

import java.util.HashSet;
import java.util.Scanner;

/*Write a Java program to append the specified element to the end of a HashSet.
[Hint:Add elements in the Set using add() method]*/
public class AppendAtLastOfHashset {

	public static void main(String[] args) {
		// hashset of type string
		HashSet<String> hs = new HashSet<>();
		// adding elements to the hashset
		hs.add("C");
		hs.add("C++");
		hs.add("Java");
		hs.add("Python");
		
		System.out.println("HashSet : " + hs); // prints original hashset
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the element you wanr to enter : ");
		String spElement = sc.nextLine(); // Input specified element to be add
		
		if(hs.add(spElement)) { // because add() method returns true at successful addition
			System.out.println("The HashSet after adding " + spElement);
			System.out.println(hs);
		} else {
			System.out.println(spElement + " Already exists in the Hashset");
		}
		sc.close();
	}
}