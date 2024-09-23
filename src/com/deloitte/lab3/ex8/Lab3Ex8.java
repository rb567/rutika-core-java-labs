package com.deloitte.lab3.ex8;

public class Lab3Ex8 {

	/**
	 * Checks if the input string is a positive string.
	 * 
	 * @param str The string to check
	 * @return true if the string is a positive string, false otherwise
	 */
	public static boolean isPositiveString(String str) {
		if (str == null || str.isEmpty()) {
			return false; // Empty or null strings are not positive
		}

		// Convert the string to uppercase to handle case-insensitive comparison
		str = str.toUpperCase();

		for (int i = 1; i < str.length(); i++) {
			// Compare each character with the previous one
			if (str.charAt(i) <= str.charAt(i - 1)) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		// Test the method
		String testString = "ANT"; // Example string
		boolean result = isPositiveString(testString);
		System.out.println("Is \"" + testString + "\" a positive string? " + result);
	}
}
