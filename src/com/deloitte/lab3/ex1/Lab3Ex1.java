package com.deloitte.lab3.ex1;

import java.util.StringTokenizer;

public class Lab3Ex1 {

	// Method to parse integers from a line and display each integer and the sum
	public static void parseAndSumIntegers(String line) {
		// Create a StringTokenizer to parse the line based on space delimiter
		StringTokenizer tokenizer = new StringTokenizer(line);

		int sum = 0; // Variable to store the sum of integers

		System.out.println("Parsed integers:");

		// Iterate through all tokens
		while (tokenizer.hasMoreTokens()) {
			// Get the next token
			String token = tokenizer.nextToken();

			try {
				// Parse the token to an integer
				int number = Integer.parseInt(token);

				// Display the integer
				System.out.println(number);

				// Add the integer to the sum
				sum += number;
			} catch (NumberFormatException e) {
				// Handle the case where the token is not a valid integer
				System.out.println("Invalid integer: " + token);
			}
		}

		// Display the sum of all integers
		System.out.println("Sum of all integers: " + sum);
	}

	public static void main(String[] args) {
		// Example input line of integers
		String inputLine = "10 20 30 40 50";

		// Call the method to parse and sum the integers
		parseAndSumIntegers(inputLine);
	}
}
