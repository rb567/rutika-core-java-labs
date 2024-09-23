package com.deloitte.lab4.ex1;

public class SavingsAccount extends Account {
	private static final double MINIMUM_BALANCE = 500.0; // Minimum balance requirement

	// Constructor
	public SavingsAccount(double balance, Person accHolder) {
		super(balance, accHolder);
	}

	// Overriding the withdraw method to enforce minimum balance
	@Override
	public void withdraw(double amount) {
		if (balance - amount >= MINIMUM_BALANCE) {
			balance -= amount;
		} else {
			System.out.println("Withdrawal failed. Minimum balance of INR " + MINIMUM_BALANCE + " must be maintained.");
		}
	}
}
