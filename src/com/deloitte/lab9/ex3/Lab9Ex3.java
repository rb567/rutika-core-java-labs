package com.deloitte.lab9.ex3;

@FunctionalInterface
interface Authenticator {
	boolean authenticate(String username, String password);
}

public class Lab9Ex3 {
	public static void main(String[] args) {
		String correctUsername = "user123";
		String correctPassword = "password123";

		// Lambda expression for authentication
		Authenticator authenticator = (username, password) -> username.equals(correctUsername)
				&& password.equals(correctPassword);

		// Test the lambda
		System.out.println("Authentication Result: " + authenticator.authenticate("user123", "password123")); // Output:
																												// true
	}
}
