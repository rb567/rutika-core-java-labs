package com.deloitte.lab6.ex3;

import java.util.HashMap;
import java.util.Map;

public class Lab6Ex3 {

	/**
	 * Method to compute the squares of numbers and return them in a HashMap.
	 *
	 * @param numbers Array of integers to process.
	 * @return Map where the key is the number and the value is its square.
	 */
	public static Map<Integer, Integer> getSquares(int[] numbers) {
		// Create a map to store numbers and their squares
		Map<Integer, Integer> squareMap = new HashMap<>();

		// Iterate through the array
		for (int number : numbers) {
			// Compute the square of the number
			int square = number * number;
			// Put the number and its square into the map
			squareMap.put(number, square);
		}

		return squareMap;
	}

	public static void main(String[] args) {
		// Sample input
		int[] sampleNumbers = { 1, 2, 3, 4, 5 };

		// Get the squares map
		Map<Integer, Integer> result = getSquares(sampleNumbers);

		// Print the result
		System.out.println("Number and their squares: " + result);
	}
}
