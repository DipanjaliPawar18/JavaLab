package com.lab;

import java.util.ArrayList;

/* Create a Book class with bookId, bookName and authorName.
 * Create parameterized constructor to initialize the object. 
 * Create an ArrayList of type Book and store all book objects 
 * into collections and display all book details. [Hint:Use 
 * advanced for loop to display all Books details]*/
class Book{
	int bookId;
	String bookName;
	String authorName;
	// constructor
	Book(int bookId,String bookName,String authorName){
		this.bookId = bookId;
		this.bookName = bookName;
		this.authorName = authorName;
	}
}

public class ArrayListOfBooks {

	public static void main(String[] args) {
		// arraylist containing the objects of Book class
		ArrayList<Book> books = new ArrayList<>();
		
		// Add elements into arraylist
		books.add(new Book(1, "Atomic Habits", "James Clear"));
		books.add(new Book(2, "The Power of Now", "Eckhart Tolle"));
		books.add(new Book(3, "Think and Grow Rich", "Nepolean Hill"));
		books.add(new Book(4, "Can't Hurt Me", "David Goggins"));
		
		// Advanced for loop that will print arralist elements one by one
		for(Book b : books) {
			System.out.println("Book id : "+b.bookId+"\nBook name : "+b.bookName+"\nBook Author name : "+b.authorName);
			System.out.println();
		}
	}
}