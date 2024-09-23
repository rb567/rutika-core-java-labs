package com.deloitte.lab3.ex2;

public class Lab3Ex2 {

	/**
	 * Method to generate the mirror image of a string and return both the original
	 * and mirrored string separated by a pipe symbol.
	 * 
	 * @param input The input string
	 * @return A string consisting of the original and mirror image separated by '|'
	 */
	public static String getImage(String input) {
		// Create a StringBuffer with the input string
		StringBuffer stringBuffer = new StringBuffer(input);

		// Reverse the string using StringBuffer's reverse method
		String mirrorImage = stringBuffer.reverse().toString();

		// Concatenate the original string with the mirror image separated by '|'
		return input + "|" + mirrorImage;
	}

	public static void main(String[] args) {
		// Example input
		String input = "EARTH";

		// Call the method and display the result
		String result = getImage(input);
		System.out.println("Output: " + result);
	}
}
