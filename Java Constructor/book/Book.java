package com.bridgelabz;

public class Book {
	private String title;
	private String author;
	private int price;

	// Default Constructor
	Book() {
		title = "Rich Dad Poor Dad";
		author = "Robert Kiyosaki";
		price = 375;
	}

	// Parameterized Constructor
	Book(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}

	// Display book details
	void displayDetails() {
		System.out.println("Title: " + title);
		System.out.println("Author: " + author);
		System.out.println("Price: " + price);
	}
}