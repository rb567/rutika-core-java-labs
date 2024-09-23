package com.deloitte.lab2.ex4;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Lab2Ex4 {

	// Method to remove duplicates and return the array in descending order
	public static int[] modifyArray(int[] arr) {
		// Convert array to a Set to remove duplicates
		Set<Integer> set = Arrays.stream(arr).boxed() // Convert int to Integer
				.collect(Collectors.toCollection(LinkedHashSet::new));

		// Convert Set back to array
		Integer[] noDuplicates = set.toArray(new Integer[0]);

		// Sort the array in descending order
		Arrays.sort(noDuplicates, (a, b) -> b - a);

		// Convert Integer[] back to int[]
		return Arrays.stream(noDuplicates).mapToInt(Integer::intValue).toArray();
	}

	public static void main(String[] args) {
		// Example array with duplicates
		int[] numbers = { 5, 2, 9, 1, 5, 3, 2, 8 };

		// Get the modified array
		int[] modifiedArray = modifyArray(numbers);

		// Print the resulting array
		System.out.println("Array with duplicates removed and sorted in descending order:");
		for (int num : modifiedArray) {
			System.out.println(num);
		}
	}
}
