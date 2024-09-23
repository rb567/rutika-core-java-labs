package com.deloitte.lab1.ex6;

public class Lab1Ex6 {

    /**
     * Method to calculate the difference between the sum of the squares
     * and the square of the sum of the first n natural numbers.
     *
     * @param n the number of natural numbers
     * @return the calculated difference
     */
    public int calculateDifference(int n) {
        int sumOfSquares = 0;
        int sum = 0;

        // Loop to calculate the sum of squares and the sum of first n natural numbers
        for (int i = 1; i <= n; i++) {
            sumOfSquares += i * i;  // Sum of squares of each number
            sum += i;               // Sum of the numbers
        }

        int squareOfSum = sum * sum;  // Square of the total sum

        // Return the difference
        return sumOfSquares - squareOfSum;
    }

    public static void main(String[] args) {
        Lab1Ex6 obj = new Lab1Ex6();
        
        int n = 10;  // Example value for testing
        int result = obj.calculateDifference(n);
        
        System.out.println("The difference for the first " + n + " natural numbers is: " + result);
    }
}
