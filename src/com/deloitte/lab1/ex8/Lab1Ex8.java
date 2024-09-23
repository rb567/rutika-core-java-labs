package com.deloitte.lab1.ex8;

import java.util.Scanner;

public class Lab1Ex8 {

    // Method to check if a number is a power of two
    public static boolean checkNumber(int n) {
        if (n <= 0) {
            return false;
        }
        return (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            // Print message and move to the next line for clear input prompt
            System.out.println("Enter a number to check if it is a power of two (or '0' to exit): ");
            int number = scanner.nextInt();
            
            // Break the loop if the user enters '0'
            if (number == 0) {
                System.out.println("Exiting...");
                break;
            }

            // Check if the number is a power of two and print the result
            boolean result = checkNumber(number);
            if (result) {
                System.out.println(number + " is a power of two.");
            } else {
                System.out.println(number + " is NOT a power of two.");
            }
        }
        scanner.close();
    }
}
