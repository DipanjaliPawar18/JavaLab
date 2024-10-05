package com.lab;

// Write a program to prints 1 to 10 and sleep for 500ms using thread

class Thread1 implements Runnable{
	// Implement runnable interface
	@Override
	public void run() {
		System.out.println("Thread 1 is running now...!");
		// loop that runs from 1 to 10
		for(int i = 1; i <=10; i++) {
			System.out.println(i);
			
			try {
				Thread.sleep(500); // Thread delay (interruption) of 500ms
			} catch(InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}

public class ThreadWithSleep {

	public static void main(String[] args) {
		// Create the object of Thread1 - instantiation
		Thread1 t1 = new Thread1();
		// Object of Thread class pass the object of Thread2 in it
		Thread t = new Thread(t1);
		t.start(); // Run the thread
	}
}