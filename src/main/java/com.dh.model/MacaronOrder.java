package com.dh.model;

import java.util.*;

public class MacaronOrder {

    public static int computeTotalPrice(int unitPrice, String[] macarons) {
        // Step 1: Group macarons into sets, each containing distinct flavors
        List<List<String>> sets = new ArrayList<>();

        // Create sets of macarons, each set can have at most 5 different flavors
        Set<String> currentSet = new HashSet<>();

        for (String macaron : macarons) {
            // If current set already has 5 distinct flavors, start a new set
            if (currentSet.size() == 5) {
                sets.add(new ArrayList<>(currentSet));
                currentSet.clear();
            }
            currentSet.add(macaron);
        }

        // Add the last set if it contains any macarons
        if (!currentSet.isEmpty()) {
            sets.add(new ArrayList<>(currentSet));
        }

        // Step 2: Calculate the total price
        double totalPrice = 0;

        for (List<String> set : sets) {
            int uniqueFlavors = set.size();

            // Calculate the discount based on the number of unique flavors
            double discount = 0;
            switch (uniqueFlavors) {
                case 2:
                    discount = 0.1;
                    break;
                case 3:
                    discount = 0.2;
                    break;
                case 4:
                    discount = 0.3;
                    break;
                case 5:
                    discount = 0.4;
                    break;
                default:
                    break; // No discount for 1 flavor
            }

            // Calculate the price for the current set
            double setPrice = unitPrice * set.size() * (1 - discount);
            totalPrice += setPrice;
        }

        // Step 3: Return the total price rounded down
        return (int) Math.floor(totalPrice);
    }

    public static void main(String[] args) {
        // Test example
        int unitPrice = 5;
        String[] macarons = {"chocolate", "vanilla", "strawberry", "chocolate", "lemon", "raspberry", "chocolate"};

        int totalPrice = computeTotalPrice(unitPrice, macarons);
        System.out.println("Total Price: " + totalPrice);  // Output will depend on the input

    }
}
