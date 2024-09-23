//package com.deloitte.lab1.ex7;
//
//public class Lab1Ex7 {
//
//    /**
//     * Method to check if a number is an increasing number.
//     * An increasing number is a number where no digit is exceeded by the digit to its left.
//     *
//     * @param number the number to check
//     * @return true if the number is increasing, false otherwise
//     */
//    public boolean checkNumber(int number) {
//        // Convert the number to a string for easy digit comparison
//        String numStr = Integer.toString(number);
//
//        // Loop through the digits of the number
//        for (int i = 0; i < numStr.length() - 1; i++) {
//            // Compare the current digit with the next one
//            if (numStr.charAt(i) > numStr.charAt(i + 1)) {
//                // If any digit is greater than the next, it's not an increasing number
//                return false;
//            }
//        }
//
//        // If no digits are exceeded by their left digit, it's an increasing number
//        return true;
//    }
//
//    public static void main(String[] args) {
//        Lab1Ex7 obj = new Lab1Ex7();
//
//        int testNumber1 = 134468;
//        int testNumber2 = 987654;
//
//        System.out.println("Is " + testNumber1 + " an increasing number? " + obj.checkNumber(testNumber1)); // true
//        System.out.println("Is " + testNumber2 + " an increasing number? " + obj.checkNumber(testNumber2)); // false
//    }
//}

//package com.deloitte.lab1.ex7;
//
//import java.util.Scanner;
//
//public class Lab1Ex7 {
//
//	/**
//	 * Method to check if a number is an increasing number. An increasing number is
//	 * a number where no digit is exceeded by the digit to its left.
//	 *
//	 * @param number the number to check
//	 * @return true if the number is increasing, false otherwise
//	 */
//	public boolean checkNumber(int number) {
//		// Convert the number to a string for easy digit comparison
//		String numStr = Integer.toString(number);
//
//		// Loop through the digits of the number
//		for (int i = 0; i < numStr.length() - 1; i++) {
//			// Compare the current digit with the next one
//			if (numStr.charAt(i) > numStr.charAt(i + 1)) {
//				// If any digit is greater than the next, it's not an increasing number
//				return false;
//			}
//		}
//
//		// If no digits are exceeded by their left digit, it's an increasing number
//		return true;
//	}
//
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		Lab1Ex7 obj = new Lab1Ex7();
//
//		// Prompt the user to input a number
//		System.out.print("Enter a number to check if it is an increasing number: ");
//		int userInput = scanner.nextInt();
//
//		// Call the checkNumber method and print the result
//		boolean result = obj.checkNumber(userInput);
//		if (result) {
//			System.out.println(userInput + " is an increasing number.");
//		} else {
//			System.out.println(userInput + " is not an increasing number.");
//		}
//
//		scanner.close();
//	}
//}


package com.deloitte.lab1.ex7;

import java.util.Scanner;

public class Lab1Ex7 {

    /**
     * Method to check if a number is an increasing number.
     * An increasing number is a number where no digit is exceeded by the digit to its left.
     *
     * @param number the number to check
     * @return true if the number is increasing, false otherwise
     */
    public boolean checkNumber(int number) {
        // Convert the number to a string for easy digit comparison
        String numStr = Integer.toString(number);

        // Loop through the digits of the number
        for (int i = 0; i < numStr.length() - 1; i++) {
            // Compare the current digit with the next one
            if (numStr.charAt(i) > numStr.charAt(i + 1)) {
                // If any digit is greater than the next, it's not an increasing number
                return false;
            }
        }

        // If no digits are exceeded by their left digit, it's an increasing number
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Lab1Ex7 obj = new Lab1Ex7();

        // Loop to keep taking input until the user chooses to exit
        while (true) {
            // Prompt the user to input a number
            System.out.print("Enter a number to check if it is an increasing number (or type 'exit' to quit): ");
            String input = scanner.next();

            // Check if the user wants to exit
            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Exiting the program...");
                break; // Exit the loop and end the program
            }

            try {
                // Convert the input to an integer and check if it's an increasing number
                int userInput = Integer.parseInt(input);
                boolean result = obj.checkNumber(userInput);

                // Print the result
                if (result) {
                    System.out.println(userInput + " is an increasing number.");
                } else {
                    System.out.println(userInput + " is not an increasing number.");
                }
            } catch (NumberFormatException e) {
                // Handle invalid input (non-integer)
                System.out.println("Invalid input! Please enter a valid integer or type 'exit' to quit.");
            }
        }

        scanner.close();
    }
}
