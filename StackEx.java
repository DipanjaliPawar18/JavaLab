package com.lab;

import java.util.Stack;

/* Write a program to declare stack.Store 10 elements 
 * into it.Remove 4 elements from stack and display it.*/
public class StackEx {
	
	public static void main(String[] args) {
		
		Stack<Integer> s = new Stack<>();
		
		s.push(45);
		s.push(62);
		s.push(10);
		s.push(56);
		s.push(93);
		s.push(177);
		s.push(65);
		s.push(3);
		s.push(1);
		s.push(5);
		
		System.out.println("Stack is : " + s);
		System.out.println("Removed element is : " + s.pop());
		System.out.println("Removed element is : " + s.pop());
		System.out.println("Removed element is : " + s.pop());
		System.out.println("Removed element is : " + s.pop());
		System.out.println("After deleting top 4 elements Stack is :");
		System.out.println(s);
	}
}