package com.deloitte.lab3.ex4;

public class Lab3Ex4 {

	/**
	 * Method to modify the number as per the requirement.
	 * 
	 * @param number1 The input number
	 * @return The modified number
	 */
	public static int modifyNumber(int number1) {
		// Convert the number to a String to easily access each digit
		String numStr = Integer.toString(number1);

		// Use a StringBuilder to build the resulting number
		StringBuilder result = new StringBuilder();

		// Iterate through each pair of consecutive digits
		for (int i = 0; i < numStr.length() - 1; i++) {
			// Get the current and next digit
			int currentDigit = Character.getNumericValue(numStr.charAt(i));
			int nextDigit = Character.getNumericValue(numStr.charAt(i + 1));

			// Calculate the absolute difference
			int difference = Math.abs(currentDigit - nextDigit);

			// Append the difference to the result
			result.append(difference);
		}

		// Append the last digit as is
		result.append(numStr.charAt(numStr.length() - 1));

		// Convert the StringBuilder to an integer and return it
		return Integer.parseInt(result.toString());
	}

	public static void main(String[] args) {
		// Example input
		int number = 45862;

		// Call the method and display the result
		int modifiedNumber = modifyNumber(number);
		System.out.println("Output: " + modifiedNumber);
	}
}
