package com.lab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Write a program to reverse a given List of strings.
public class ReverseStringList {

	public static void main(String[] args) {
		// list of string
		List<String> names = new ArrayList<>();
		// Add elements in the list
		names.add("Lisa");
		names.add("Bob");
		names.add("Alley");
		names.add("Cala");
		names.add("Neo");
		
		System.out.println(names); // prints original list
		System.out.println();
		Collections.reverse(names); // reverse the list
		System.out.println(names); // prints reversed list
	}
}