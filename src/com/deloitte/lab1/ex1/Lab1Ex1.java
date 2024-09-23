package com.deloitte.lab1.ex1;

import java.util.Scanner;

public class Lab1Ex1 {
	// Method to calculate the sum of the cubes of digits of a number
	public static int sumOfCubesOfDigits(int number) {
		int sum = 0;
		while (number != 0) {
			int digit = number % 10;
			sum += digit * digit * digit;
			number /= 10;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number:");
		int number = scanner.nextInt();

		int result = sumOfCubesOfDigits(number);
		System.out.println("Sum of the cubes of the digits: " + result);
		scanner.close();
	}
}
