package com.bridgelabz;

public class Main {
	public static void main(String[] args) {
		BankAccountSystem account1 = new BankAccountSystem("Ashish", 440078915);
		BankAccountSystem account2 = new BankAccountSystem("Prashant", 440045635);

		account1.displayDetails();
		System.out.println();
		account2.displayDetails();

		System.out.println("\nTotal Accounts: " + BankAccountSystem.getTotalAccounts());
	}
}