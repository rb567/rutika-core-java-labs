package com.deloitte.lab9.ex1;

@FunctionalInterface
interface PowerCalculator {
    double calculate(double x, double y);
}

public class Lab9Ex1 {
    public static void main(String[] args) {
        // Lambda expression to calculate x^y
        PowerCalculator powerCalculator = (x, y) -> Math.pow(x, y);

        // Test the lambda
        double x = 2.0;
        double y = 3.0;
        System.out.println("Result: " + powerCalculator.calculate(x, y)); // Output: 8.0
    }
}
