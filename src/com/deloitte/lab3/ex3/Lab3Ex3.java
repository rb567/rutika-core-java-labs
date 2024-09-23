package com.deloitte.lab3.ex3;

public class Lab3Ex3 {

	/**
	 * Method to replace all consonants in the input string with the next alphabetic
	 * character.
	 * 
	 * @param input The input string
	 * @return The modified string with consonants replaced
	 */
	public static String alterString(String input) {
		// Convert the input string to a character array to modify it
		char[] chars = input.toCharArray();

		// Iterate through each character in the array
		for (int i = 0; i < chars.length; i++) {
			char c = chars[i];

			// Check if the character is a consonant
			if (Character.isLetter(c) && !isVowel(c)) {
				// Replace the consonant with the next character in the alphabet
				chars[i] = getNextChar(c);
			}
		}

		// Convert the modified character array back to a string
		return new String(chars);
	}

	/**
	 * Method to check if a character is a vowel.
	 * 
	 * @param c The character to check
	 * @return True if the character is a vowel, false otherwise
	 */
	private static boolean isVowel(char c) {
		// Convert to lowercase for easy comparison
		c = Character.toLowerCase(c);
		return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
	}

	/**
	 * Method to get the next character in the alphabet, wrapping around if
	 * necessary.
	 * 
	 * @param c The current character
	 * @return The next character
	 */
	private static char getNextChar(char c) {
		// If the character is 'z', wrap around to 'a'
		if (c == 'z') {
			return 'a';
		}
		// If the character is 'Z', wrap around to 'A'
		if (c == 'Z') {
			return 'A';
		}
		// Return the next character
		return (char) (c + 1);
	}

	public static void main(String[] args) {
		// Example input
		String input = "JAVA";

		// Call the method and display the result
		String result = alterString(input);
		System.out.println("Output: " + result);
	}
}
