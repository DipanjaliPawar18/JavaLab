package com.lab;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/* write a program in Java to create a Map Interface 
 * where we can store the cricketer name in it along
 * with his scores and search for the batsman name 
 * and display his score.*/

public class Cricketer {

	public static void main(String[] args) {
		// map storing name and score of cricketers
		Map<String, Integer> cricketer = new HashMap<>();
		// put elements in map
		cricketer.put("Alex", 102);
		cricketer.put("Bob", 56);
		cricketer.put("Tim", 85);
		cricketer.put("Neil", 94);
		cricketer.put("Ron", 33);
		//If we input our search for batsman
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of batsman whose score you want to see :");
		String batsman = sc.nextLine();
		System.out.println(cricketer.get(batsman));// here we can get the score
		sc.close();
	}
}