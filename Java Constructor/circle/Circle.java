package com.bridgelabz;

public class Circle {
	private double radius;

	// Default constructor
	public Circle() {
		this(1.0); // Constructor chaining
	}

	// Parameterized constructor
	public Circle(double radius) {
		this.radius = radius;
	}

	// Method to display radius
	public void displayRadius() {
		System.out.println("Radius: " + radius);
	}
}