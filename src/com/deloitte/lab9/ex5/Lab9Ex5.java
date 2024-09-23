package com.deloitte.lab9.ex5;

import java.util.function.Function;

class MathOperations {
	public static int factorial(int n) {
		if (n == 0 || n == 1) {
			return 1;
		}
		return n * factorial(n - 1);
	}
}

public class Lab9Ex5 {
	public static void main(String[] args) {
		// Method reference to MathOperations::factorial
		Function<Integer, Integer> factorialFunction = MathOperations::factorial;

		// Test the factorial method
		int number = 5;
		System.out.println("Factorial of " + number + " is: " + factorialFunction.apply(number)); // Output: 120
	}
}
