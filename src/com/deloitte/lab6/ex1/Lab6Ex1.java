package com.deloitte.lab6.ex1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lab6Ex1 {

    // Method to get sorted values from a HashMap
    public static List<Integer> getValues(HashMap<String, Integer> map) {
        // Extract values from the map
        List<Integer> values = new ArrayList<>(map.values());
        
        // Sort the list of values
        Collections.sort(values);
        
        return values;
    }

    public static void main(String[] args) {
        // Create a HashMap and add some key-value pairs
        HashMap<String, Integer> sampleMap = new HashMap<>();
        sampleMap.put("Alice", 30);
        sampleMap.put("Bob", 20);
        sampleMap.put("Charlie", 25);
        sampleMap.put("Diana", 28);

        // Get sorted values from the map
        List<Integer> sortedValues = getValues(sampleMap);

        // Print the sorted values
        System.out.println("Sorted values: " + sortedValues);
    }
}
