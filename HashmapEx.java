package com.lab;

import java.util.HashMap;
import java.util.Scanner;

/* Write a Java program to associate the specified value 
 * with the specified key in a HashMap.*/
public class HashmapEx {

	public static void main(String[] args) {
		// Hashmap with integer key & string value
		HashMap<Integer, String> h = new HashMap<>();
		// add elements
		h.put(24, "Raccoon");
		h.put(66, "Koala");
		h.put(24, "Otter");
		h.put(96, "Jackal");
		h.put(18, "Hamster");
		
		System.out.println("Hashmap at starting " + h); // prints hashmap
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the key you want to add :");
		int key = sc.nextInt(); // input desired key
		System.out.println("Enter the value you want to add :");
		String value = sc.nextLine(); // input desired value
		
		h.put(key, value); // insert desired key value pair
		System.out.println("Hashmap after adding desired key value pair " + h);
		
		sc.close();
	}
}