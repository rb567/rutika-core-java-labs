package com.deloitte.lab5.ex1;

import java.util.Scanner;

// Custom exception class for age validation
class AgeException extends Exception {
    public AgeException(String message) {
        super(message);
    }
}

// Main class containing the age validation logic
public class Lab5Ex1 {

    // Method to validate age
    public static void validateAge(int age) throws AgeException {
        if (age <= 15) {
            throw new AgeException("Age must be above 15.");
        } else {
            System.out.println("Age is valid.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        try {
            validateAge(age);
        } catch (AgeException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
