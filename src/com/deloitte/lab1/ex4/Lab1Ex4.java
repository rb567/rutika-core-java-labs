package com.deloitte.lab1.ex4;

import java.util.Scanner;

public class Lab1Ex4 {
	// Method to check if a number is prime
	public static boolean isPrime(int number) {
		if (number <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

	// Method to print all prime numbers up to a given integer
	public static void printPrimesUpTo(int limit) {
		for (int i = 2; i <= limit; i++) {
			if (isPrime(i)) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an integer:");
		int number = scanner.nextInt();

		System.out.println("Prime numbers up to " + number + ":");
		printPrimesUpTo(number);

		scanner.close();
	}
}
