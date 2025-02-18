package com.dh.model;

import java.util.HashMap;
import java.util.Map;

public class Ascii {

    // Carte de correspondance des lettres A-Z avec leur représentation ASCII
    private static Map<Character, String> asciiMap = new HashMap<>();

    static {
        // Remplir la carte avec les représentations ASCII de A-Z
        asciiMap.put('A', "  A  \n A A \nAAAAA\nA   A\nA   A");
        asciiMap.put('B', "BBBB \nB   B\nBBBB \nB   B\nBBBB ");
        asciiMap.put('C', " CCC \nC   \nC   \nC   \n CCC ");
        asciiMap.put('D', "BBBB \nB   B\nB   B\nB   B\nBBBB ");
        asciiMap.put('E', "EEEEE\nE    \nEEE  \nE    \nEEEEE");
        // ... Ajouter ici les représentations de toutes les lettres de A à Z
    }

    public static char scanChar(String s) {
        for (Map.Entry<Character, String> entry : asciiMap.entrySet()) {
            if (entry.getValue().equals(s)) {
                return entry.getKey();
            }
        }
        // Si aucune correspondance, retourne ?
        return '?';
    }

    public static void main(String[] args) {
        // Test avec une chaîne ASCII
        String testString = "  A  \n A A \nAAAAA\nA   A\nA   A";
        System.out.println(scanChar(testString)); // Affiche 'A'

        testString = " BBB \nB   B\nBBBB \nB   B\nBBBB ";
        System.out.println(scanChar(testString)); // Affiche 'B'

        testString = "EEEEE\nE    \nEEE  \nE    \nEEEEE";
        System.out.println(scanChar(testString)); // Affiche '?' si 'XXXXX' n'existe pas
    }
}
