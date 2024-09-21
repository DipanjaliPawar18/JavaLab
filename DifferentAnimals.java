package com.lab;

/* Write a Java program that demonstrates method overriding
 * by creating a superclass called Animal and two subclasses
 * called Dog and Cat. ● The Animal class should have a
 * method called makeSound(), which simply prints "The 
 * animal makes a sound." ● The Dog and Cat classes should 
 * override this method to print "TheCat/The dog meows/barks" 
 * respectively. ● The program should allow the user to create 
 * and display objects of each class.*/

class Animal{
	
	public void makeSound() {
		System.out.println("The animal makes a sound....!");
	}
}

class Dog extends Animal{
	
	public void makeSound() {
		System.out.println("The dog barks....!");
	}
}

class Cat extends Animal{
	
	public void makeSound() {
		System.out.println("The cat meows....!");
	}
}

public class DifferentAnimals {

	public static void main(String[] args) {

		Animal a = new Animal();
		Dog d = new Dog();
		Cat c = new Cat();
		
		a.makeSound();
		d.makeSound();
		c.makeSound();
	}
}