package com.dh.model;

import java.util.List;
import java.util.ArrayList;

public class RecipeAdjuster {

    // Method to adjust the quantities for nbPersons
    public static List<String> adjustQuantities(int nbPersons, List<String> ingredients) {
        // List to hold the adjusted ingredients
        List<String> adjustedIngredients = new ArrayList<>();

        // Iterate over each ingredient
        for (String ingredient : ingredients) {
            // Split the ingredient by the first space to separate quantity and product description
            String[] parts = ingredient.split(" ", 2);

            // Parse the quantity and multiply by nbPersons
            int quantity = Integer.parseInt(parts[0]) * nbPersons;

            // Create the adjusted ingredient string
            String adjustedIngredient = quantity + " " + parts[1];

            // Add the adjusted ingredient to the result list
            adjustedIngredients.add(adjustedIngredient);
        }

        // Return the list of adjusted ingredients
        return adjustedIngredients;
    }

    public static void main(String[] args) {
        // Example usage
        List<String> ingredients = new ArrayList<>();
        ingredients.add("2 eggs");
        ingredients.add("200 grams of flour");
        ingredients.add("150 grams of sugar");
        ingredients.add("1 liter(s) of milk");

        int nbPersons = 3;
        List<String> adjustedList = adjustQuantities(nbPersons, ingredients);

        // Print the adjusted ingredients
        for (String ingredient : adjustedList) {
            System.out.println(ingredient);
        }
    }
}
