package com.deloitte.lab6.ex4;

import java.util.HashMap;
import java.util.Map;

public class Lab6Ex4 {

	/**
	 * Method to determine the medal type for students based on their marks.
	 *
	 * @param studentMarks A map where the key is student registration number and
	 *                     value is their marks.
	 * @return A map where the key is student registration number and value is the
	 *         type of medal.
	 */
	public static Map<Integer, String> getStudents(Map<Integer, Integer> studentMarks) {
		// Create a map to store student registration numbers and their medal types
		Map<Integer, String> medalMap = new HashMap<>();

		// Iterate through the map of student marks
		for (Map.Entry<Integer, Integer> entry : studentMarks.entrySet()) {
			int regNumber = entry.getKey();
			int marks = entry.getValue();
			String medalType;

			// Determine the medal type based on the marks
			if (marks >= 90) {
				medalType = "Gold";
			} else if (marks >= 80) {
				medalType = "Silver";
			} else if (marks >= 70) {
				medalType = "Bronze";
			} else {
				continue; // No medal for marks below 70
			}

			// Put the registration number and medal type into the map
			medalMap.put(regNumber, medalType);
		}

		return medalMap;
	}

	public static void main(String[] args) {
		// Sample input: student registration numbers and their marks
		Map<Integer, Integer> studentMarks = new HashMap<>();
		studentMarks.put(101, 95);
		studentMarks.put(102, 85);
		studentMarks.put(103, 75);
		studentMarks.put(104, 65); // This student does not receive a medal

		// Get the medals for students
		Map<Integer, String> result = getStudents(studentMarks);

		// Print the result
		System.out.println("Student Registration Number and Medal Type: " + result);
	}
}
