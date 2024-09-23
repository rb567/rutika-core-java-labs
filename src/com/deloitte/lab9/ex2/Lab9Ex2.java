package com.deloitte.lab9.ex2;

@FunctionalInterface
interface StringFormatter {
    String format(String input);
}

public class Lab9Ex2 {
    public static void main(String[] args) {
        // Lambda expression to format string by inserting spaces between characters
        StringFormatter formatter = (input) -> String.join(" ", input.split(""));

        // Test the lambda
        String input = "CG";
        System.out.println("Formatted String: " + formatter.format(input)); // Output: C G
    }
}
