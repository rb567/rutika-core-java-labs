package com.deloitte.lab9.ex8;

public class Lab9Ex8 {

	// Function to validate the username of job seekers
	public boolean isValidUsername(String username) {
		// Minimum length should be 12 (8 characters + "_job" which is 4 characters)
		int minRequiredLength = 12;
		String jobSuffix = "_job";

		// Validate that the username is at least 12 characters long and ends with
		// "_job"
		if (username != null && username.length() >= minRequiredLength && username.endsWith(jobSuffix)) {
			return true;
		} else {
			return false;
		}
	}

	// Main method for testing the validation
	public static void main(String[] args) {
		Lab9Ex8 validator = new Lab9Ex8();

		// Test cases
		String[] testUsernames = { "johnsmith_job", "mary_job", "validuser1234_job", "shortname_job", "incorrect" };

		for (String username : testUsernames) {
			boolean isValid = validator.isValidUsername(username);
			System.out.println("Username: " + username + " -> Valid: " + isValid);
		}
	}
}
