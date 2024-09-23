package com.deloitte.lab4.ex1;

public class Account {
    private static long accountNumberGenerator = 1000;  // Account number will auto-increment
    private long accNum;
    protected double balance;  // Protected so that subclasses can access it
    private Person accHolder;

    // Constructor
    public Account(double balance, Person accHolder) {
        this.accNum = ++accountNumberGenerator;  // Automatically generate account number
        this.balance = balance;
        this.accHolder = accHolder;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Withdraw method (default behavior, can be overridden)
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    // Getters
    public long getAccNum() {
        return accNum;
    }

    public double getBalance() {
        return balance;
    }

    public Person getAccHolder() {
        return accHolder;
    }

    // Display account details
    public void displayDetails() {
        System.out.println("Account Number: " + accNum);
        System.out.println("Account Holder: " + accHolder.getName());
        System.out.println("Balance: INR " + balance);
    }
}
