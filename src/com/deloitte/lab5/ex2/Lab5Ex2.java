package com.deloitte.lab5.ex2;

// Custom exception class for name validation
class NameException extends Exception {
    public NameException(String message) {
        super(message);
    }
}

public class Lab5Ex2 {
    // Method to validate full name
    public static void validateName(String firstName, String lastName) throws NameException {
        if (firstName.trim().isEmpty() || lastName.trim().isEmpty()) {
            throw new NameException("First name and last name cannot be blank.");
        } else {
            System.out.println("Name is valid.");
        }
    }

    public static void main(String[] args) {
        // Example usage
        String firstName = "John"; // Replace with user input if needed
        String lastName = "Doe";   // Replace with user input if needed

        try {
            validateName(firstName, lastName);
        } catch (NameException e) {
            System.out.println(e.getMessage());
        }
    }
}
