package com.deloitte.lab1.ex3;

import java.util.Scanner;

public class Lab1Ex3 {
	// Recursive method to calculate nth Fibonacci number
	public static int fibonacciRecursive(int n) {
		if (n <= 1) {
			return n;
		}
		return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
	}

	// Non-recursive method to calculate nth Fibonacci number
	public static int fibonacciNonRecursive(int n) {
		if (n <= 1) {
			return n;
		}
		int first = 0, second = 1, next = 0;
		for (int i = 2; i <= n; i++) {
			next = first + second;
			first = second;
			second = next;
		}
		return next;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the value of n:");
		int n = scanner.nextInt();

		System.out.println("Fibonacci value using recursion: " + fibonacciRecursive(n));
		System.out.println("Fibonacci value using iteration: " + fibonacciNonRecursive(n));

		scanner.close();
	}
}
