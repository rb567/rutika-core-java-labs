package com.deloitte.lab4.ex1;

public class Lab4Ex1 {

	public static void main(String[] args) {
		// Creating person instances
		Person smith = new Person("Smith", 30);
		Person kathy = new Person("Kathy", 28);

		// Creating accounts for Smith and Kathy
		SavingsAccount smithAccount = new SavingsAccount(2000.0, smith);
		CurrentAccount kathyAccount = new CurrentAccount(3000.0, kathy);

		// Deposit 2000 INR into Smith's account
		smithAccount.deposit(2000.0);
		System.out.println("Deposited 2000 INR into Smith's account.");
		smithAccount.displayDetails(); // Display updated details

		// Withdraw 2000 INR from Kathy's account
		kathyAccount.withdraw(2000.0);
		System.out.println("Withdrew 2000 INR from Kathy's account.");
		kathyAccount.displayDetails(); // Display updated details
	}
}
