package com.deloitte.lab4.ex1;

public class CurrentAccount extends Account {
	private static final double OVERDRAFT_LIMIT = 1000.0; // Overdraft limit for current account

	// Constructor
	public CurrentAccount(double balance, Person accHolder) {
		super(balance, accHolder);
	}

	// Overriding withdraw method to check for overdraft
	@Override
	public void withdraw(double amount) {
		if (balance - amount >= -OVERDRAFT_LIMIT) {
			balance -= amount;
		} else {
			System.out.println("Withdrawal denied. Overdraft limit of INR " + OVERDRAFT_LIMIT + " exceeded.");
		}
	}
}
