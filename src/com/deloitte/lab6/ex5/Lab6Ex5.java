package com.deloitte.lab6.ex5;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Lab6Ex5 {

    /**
     * Method to find the second smallest element in an array of integers.
     *
     * @param arr An array of integers.
     * @return The second smallest element in the array.
     */
    public static int getSecondSmallest(int[] arr) {
        if (arr == null || arr.length < 2) {
            throw new IllegalArgumentException("Array must contain at least two elements.");
        }

        // Convert array to list
        List<Integer> list = new ArrayList<>();
        for (int num : arr) {
            list.add(num);
        }

        // Sort the list
        Collections.sort(list);

        // Return the second smallest element
        return list.get(1); // List is zero-indexed; the second smallest is at index 1
    }

    public static void main(String[] args) {
        // Example usage
        int[] numbers = {5, 1, 9, 3, 6, 7, 2};

        try {
            int secondSmallest = getSecondSmallest(numbers);
            System.out.println("The second smallest element is: " + secondSmallest);
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
}
