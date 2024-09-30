package com.lab;

import java.util.TreeMap;

/*Returns and removes the entry associated with the specified key from a TreeMap
	Eg:TreeMap: {One=1, Three=3, Two=2}
	Removed value = 2
	Is the entry {Three=3} removed? True
	Updated TreeMap: {One=1} */
public class TreeMapEx {

	public static void main(String[] args) {
	
		TreeMap<String, Integer> tm = new TreeMap<>();
		// adding elements
		tm.put("One", 1);
		tm.put("Two", 2);
		tm.put("Three", 3);
		// print original TreeMap
		System.out.println("Original TreeSet : " + tm);
		
		// remove(key) gives the value stored with key
		System.out.println("Removed value = " + tm.remove("Two")); // print removed value
		// remove(key,value) will give a boolean value
		// true if the entry deleted else false
        System.out.println("Is the entry {Three=3} removed? : " + tm.remove("Three", 3)); // print true

        System.out.println("Updated TreeMap: " + tm); // Updated TreeMap
	}
}