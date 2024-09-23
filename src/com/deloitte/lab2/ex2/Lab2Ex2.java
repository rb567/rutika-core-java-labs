package com.deloitte.lab2.ex2;

import java.util.Arrays;

public class Lab2Ex2 {

	// Method to sort the array and apply uppercase/lowercase modifications
	public static String[] sortStrings(String[] arr) {
		// Check if the array is null or empty
		if (arr == null || arr.length == 0) {
			throw new IllegalArgumentException("Array must not be null or empty.");
		}

		// Sort the array in alphabetical order
		Arrays.sort(arr);

		int n = arr.length;
		int middleIndex = (n + 1) / 2;

		// Convert elements to uppercase for the left half
		for (int i = 0; i < middleIndex; i++) {
			arr[i] = arr[i].toUpperCase();
		}

		// Convert elements to lowercase for the right half
		for (int i = middleIndex; i < n; i++) {
			arr[i] = arr[i].toLowerCase();
		}

		return arr;
	}

	public static void main(String[] args) {
		// Example array of strings
		String[] strings = { "apple", "banana", "cherry", "date", "fig", "grape" };

		// Sort and modify the array
		String[] sortedArray = sortStrings(strings);

		// Print the resulting array
		System.out.println("Resulting array:");
		for (String s : sortedArray) {
			System.out.println(s);
		}
	}
}
