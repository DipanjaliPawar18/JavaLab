package com.lab;
// Write a program to prints numbers from 0 to 4 using thread
class NewThread implements Runnable{
	 // implement runnable interface
	@Override
	public void run() {
		System.out.println("New thread is running...!");
		// loop that runs from 0 to 4
		for(int i = 0; i <=4; i++) {
			System.out.println(i);
		}
	}
}

public class PrintNumWithTread {

	public static void main(String[] args) {
		// instance of NewThread class
		NewThread n = new NewThread();
		// instance of Thread class
		Thread t = new Thread(n);
		// Start the thread
		t.start();	
	}
}