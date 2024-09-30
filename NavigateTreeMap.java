package com.lab;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

// Navigate over the elements of the treemap.(All methods)

public class NavigateTreeMap {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> treemap = new TreeMap<>();
		
		treemap.put(24, "Mary");
		treemap.put(76, "Honey");
		treemap.put(21, "Lina");
		treemap.put(56, "Max");
		treemap.put(34, "Bob");

		// Using forEach() method
	    System.out.println("Using forEach() method:");
	    treemap.forEach((key, value) -> {
	        System.out.println("Key: " + key + ", Value: " + value);
	    });

	    // Using keySet() and for-each or advanced for loop
	    System.out.println("\nUsing keySet() and for-each:");
	    for (Integer key : treemap.keySet()) {
	        System.out.println("Key: " + key + ", Value: " + treemap.get(key));
	    }
	    
	    // Using entrySet() and for-each or advanced for loop
	    System.out.println("\nUsing entrySet() and for-each:");
	    for (Entry<Integer, String> entry : treemap.entrySet()) {
	        System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
	    }

	    // Using values() to iterate over the values
	    System.out.println("\nUsing values() method:");
	    for (String value : treemap.values()) {
	        System.out.println("Value: " + value);
	    }
	    
	    // Using Iterator with keySet()
	    System.out.println("\nUsing Iterator with keySet():");
	    Iterator<Integer> keyIterator = treemap.keySet().iterator();
	    while (keyIterator.hasNext()) {
	        Integer key = keyIterator.next();
	        System.out.println("Key: " + key + ", Value: " + treemap.get(key));
	    }

	    // Using Iterator with entrySet()
	    System.out.println("\nUsing Iterator with entrySet():");
	    Iterator<Map.Entry<Integer, String>> iterator = treemap.entrySet().iterator();
	    while (iterator.hasNext()) {
	        Map.Entry<Integer, String> entry = iterator.next();
	        System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
	    }
	}
}