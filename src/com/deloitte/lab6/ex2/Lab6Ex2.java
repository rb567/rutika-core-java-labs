package com.deloitte.lab6.ex2;

import java.util.HashMap;
import java.util.Map;

public class Lab6Ex2 {

	// Method to count occurrences of each character in the array
	public static Map<Character, Integer> countChars(char[] arr) {
		// Create a map to store character counts
		Map<Character, Integer> charCountMap = new HashMap<>();

		// Iterate through the character array
		for (char c : arr) {
			// If character is already in map, increment its count
			if (charCountMap.containsKey(c)) {
				charCountMap.put(c, charCountMap.get(c) + 1);
			} else {
				// If character is not in map, add it with count 1
				charCountMap.put(c, 1);
			}
		}

		return charCountMap;
	}

	public static void main(String[] args) {
		// Sample character array
		char[] sampleArray = { 'a', 'b', 'c', 'a', 'b', 'a', 'c', 'd' };

		// Get character counts
		Map<Character, Integer> result = countChars(sampleArray);

		// Print the results
		System.out.println("Character counts: " + result);
	}
}
