package com.deloitte.lab1.ex5;

public class Lab1Ex5 {

	/**
	 * Method to calculate the sum of the first n natural numbers divisible by 3 or
	 * 5.
	 *
	 * @param n the number of terms to sum
	 * @return the sum of the first n numbers divisible by 3 or 5
	 */
	public int calculateSum(int n) {
		int sum = 0;
		int count = 0;
		int number = 1;

		// Loop to find the sum of first n natural numbers divisible by 3 or 5
		while (count < n) {
			if (number % 3 == 0 || number % 5 == 0) {
				sum += number;
				count++;
			}
			number++;
		}

		return sum;
	}

	public static void main(String[] args) {
		Lab1Ex5 obj = new Lab1Ex5();

		int n = 10; // Example value
		int result = obj.calculateSum(n);

		System.out.println("The sum of the first " + n + " natural numbers divisible by 3 or 5 is: " + result);
	}
}
