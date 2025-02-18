package com.dh.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AdjustQuantity {

    public static List<String> adjustQuantity(List<String> ingredients, int nbrPers){
        List<String> adjustedIngredients = new ArrayList<>();

        for (String ingredient : ingredients) {
            // Split only at the first space to separate quantity from description
            int spaceIndex = ingredient.indexOf(" ");

            // Extract and modify the quantity
            int quantity = Integer.parseInt(ingredient.substring(0, spaceIndex));
            int newQuantity = quantity * nbrPers;

            // Rebuild the string
            String updatedIngredient = newQuantity + ingredient.substring(spaceIndex);
            adjustedIngredients.add(updatedIngredient);
        }
        return  adjustedIngredients;
    };

    public static void main (String [] args){
        List<String> ingredients = Arrays.asList(
                "2 eggs",
                "200 grams of flour",
                "150 grams of sugar",
                "1 liter(s) of milk");
        adjustQuantity(ingredients, 5).forEach(System.out::println);
    }
}
