package com.dh.model;

import java.util.*;

public class ConstructS1FormS2 {

    // Fonction principale pour compter les façons de construire s1 à partir de s2
    public static int countOccurrences(String s1, String s2) {
        return findWays(s1, s2, 0, 0);
    }

    // Fonction récursive pour compter les occurrences de s1 dans s2
    public static int findWays(String s1, String s2, int i, int j) {
        // Si on a trouvé toute la chaîne s1 (i == s1.length()), c'est une occurrence valide
        if (i == s1.length()) {
            return 1; // Une façon trouvée
        }

        // Si on a parcouru toute la chaîne s2 (j == s2.length()), on ne peut pas continuer
        if (j == s2.length()) {
            return 0; // Aucun moyen de compléter s1
        }

        int count = 0;

        // Si les caractères correspondent, on peut choisir de les utiliser
        if (s1.charAt(i) == s2.charAt(j)) {
            // Soit on utilise ce caractère de s2 et on passe à l'indice suivant de s1
            count += findWays(s1, s2, i + 1, j + 1);
        }

        // Soit on ignore ce caractère de s2 et on passe à l'indice suivant de s2
        count += findWays(s1, s2, i, j + 1);

        return count;
    }

    public static void main(String[] args) {
        String s1 = "ABC";
        String s2 = "ABCBHC";

        // Compter le nombre de façons de construire s1 à partir de s2
        int result = countOccurrences(s1, s2);
        System.out.println("Nombre de façons de construire s1 à partir de s2: " + result);
    }
}