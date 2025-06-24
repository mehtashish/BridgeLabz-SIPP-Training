package com.bridgelabz;

public class Main {
	public static void main(String[] args) {
		Circle defaultCircle = new Circle();
		System.out.println("For default circle - ");
		defaultCircle.displayRadius();

		Circle customCircle = new Circle(5.5);
		System.out.println("For custom circle - ");
		customCircle.displayRadius();
	}
}