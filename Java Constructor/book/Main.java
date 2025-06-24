package com.bridgelabz;

public class Main {
	public static void main(String[] args) {
		Book book1 = new Book();
		book1.displayDetails();

		Book book2 = new Book("Harry Potter", "J. K. Rowling", 999);
		book2.displayDetails();
	}
}