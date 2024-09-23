package com.deloitte.lab6.ex7;

import java.util.Arrays;

public class Lab6Ex7 {

	/**
	 * Method to reverse the numbers in the array, sort them, and return the sorted
	 * array.
	 *
	 * @param numbers An integer array to be reversed and sorted.
	 * @return The resulting sorted integer array.
	 */
	public static int[] getSorted(int[] numbers) {
		// Convert each integer to its reversed string representation
		String[] reversedStrings = new String[numbers.length];
		for (int i = 0; i < numbers.length; i++) {
			reversedStrings[i] = new StringBuilder(String.valueOf(numbers[i])).reverse().toString();
		}

		// Convert reversed strings back to integers
		int[] reversedNumbers = new int[reversedStrings.length];
		for (int i = 0; i < reversedStrings.length; i++) {
			reversedNumbers[i] = Integer.parseInt(reversedStrings[i]);
		}

		// Sort the array
		Arrays.sort(reversedNumbers);

		return reversedNumbers;
	}

	public static void main(String[] args) {
		// Example usage
		int[] numbers = { 123, 456, 789, 321 };
		int[] sortedReversedNumbers = getSorted(numbers);

		System.out.println("Sorted reversed numbers:");
		for (int num : sortedReversedNumbers) {
			System.out.print(num + " ");
		}
	}
}
