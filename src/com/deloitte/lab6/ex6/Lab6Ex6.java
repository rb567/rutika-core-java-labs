package com.deloitte.lab6.ex6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lab6Ex6 {

    /**
     * Method to generate a list of IDs of persons eligible to vote.
     *
     * @param ageMap A map with person IDs as keys and their ages as values.
     * @return A list of IDs of eligible voters.
     */
    public static List<Integer> votersList(Map<Integer, Integer> ageMap) {
        List<Integer> eligibleVoters = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : ageMap.entrySet()) {
            Integer id = entry.getKey();
            Integer age = entry.getValue();

            // Check if the person is eligible to vote
            if (age > 18) {
                eligibleVoters.add(id);
            }
        }

        return eligibleVoters;
    }

    public static void main(String[] args) {
        // Example usage
        Map<Integer, Integer> peopleAges = new HashMap<>();
        peopleAges.put(101, 25);
        peopleAges.put(102, 17);
        peopleAges.put(103, 30);
        peopleAges.put(104, 16);

        List<Integer> voters = votersList(peopleAges);
        System.out.println("IDs of eligible voters: " + voters);
    }
}
