package com.deloitte.lab2.ex1;

import java.util.Arrays;

public class Lab2Ex1 {

    // Method to get the second smallest element in the array
    public static int getSecondSmallest(int[] array) {
        // Check if the array has less than 2 elements
        if (array.length < 2) {
            throw new IllegalArgumentException("Array must have at least two elements.");
        }

        // Sort the array
        Arrays.sort(array);

        // Initialize the smallest and second smallest
        int smallest = array[0];
        int secondSmallest = Integer.MAX_VALUE;

        // Find the second smallest element
        for (int i = 1; i < array.length; i++) {
            if (array[i] > smallest) {
                secondSmallest = array[i];
                break;
            }
        }

        // Check if we found a valid second smallest element
        if (secondSmallest == Integer.MAX_VALUE) {
            throw new IllegalArgumentException("Array does not have a distinct second smallest element.");
        }

        return secondSmallest;
    }

    public static void main(String[] args) {
        int[] numbers = {5, 3, 9, 1, 7, 2, 4};

        try {
            int secondSmallest = getSecondSmallest(numbers);
            System.out.println("The second smallest element is: " + secondSmallest);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
