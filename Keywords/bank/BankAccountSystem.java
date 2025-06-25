package com.bridgelabz;

public class BankAccountSystem {
	private static String bankName = "Bank of Baroda";
	private static int totalAccounts = 0;

	private String accountHolderName;
	private final int accountNumber;

	// Constructor using 'this'
	public BankAccountSystem(String accountHolderName, int accountNumber) {
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		totalAccounts++;
	}

	// Static method to return total number of accounts
	public static int getTotalAccounts() {
		return totalAccounts;
	}

	// Method to display account details (uses instanceof)
	public void displayDetails() {
		if (this instanceof BankAccountSystem) {
			System.out.println("Bank Name: " + bankName);
			System.out.println("Account Holder Name: " + accountHolderName);
			System.out.println("Account Number: " + accountNumber);
		} else {
			System.out.println("Not a valid bank account!");
		}
	}
}