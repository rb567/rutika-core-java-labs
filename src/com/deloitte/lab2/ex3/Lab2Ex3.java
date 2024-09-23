package com.deloitte.lab2.ex3;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Lab2Ex3 {

    // Method to reverse the digits of each number, sort, and return the resulting array
    public static int[] getSorted(int[] arr) {
        // Convert the array to a list of reversed numbers
        int[] reversedNumbers = Arrays.stream(arr)
            .map(num -> {
                // Convert the number to a string
                String numStr = Integer.toString(num);
                // Reverse the string
                String reversedStr = new StringBuilder(numStr).reverse().toString();
                // Convert the reversed string back to an integer
                return Integer.parseInt(reversedStr);
            })
            .toArray();

        // Sort the reversed numbers
        Arrays.sort(reversedNumbers);

        return reversedNumbers;
    }

    public static void main(String[] args) {
        // Example array of integers
        int[] numbers = {123, 456, 789, 234};

        // Get the sorted array after reversing the numbers
        int[] sortedArray = getSorted(numbers);

        // Print the resulting array
        System.out.println("Resulting sorted array:");
        for (int num : sortedArray) {
            System.out.println(num);
        }
    }
}
