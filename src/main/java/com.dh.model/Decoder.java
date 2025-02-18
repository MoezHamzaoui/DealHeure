package com.dh.model;

import java.util.Arrays;
import java.util.List;
 public class Decoder {

    // Helper function to check if a scrambled word matches a known word
    private static boolean matchWord(String scrambledWord, String knownWord) {
        if (scrambledWord.length() != knownWord.length()) {
            return false;
        }

        // If the word has only one letter, it trivially matches itself
        if (scrambledWord.length() == 1) {
            return scrambledWord.equals(knownWord);
        }

        // Check if first and last letters are the same, and inner letters are anagrams
        if (scrambledWord.charAt(0) == knownWord.charAt(0) && scrambledWord.charAt(scrambledWord.length() - 1) == knownWord.charAt(knownWord.length() - 1)) {
            // Check if the inner letters (excluding the first and last) are anagrams
            char[] scrambledInner = scrambledWord.substring(1, scrambledWord.length() - 1).toCharArray();
            char[] knownInner = knownWord.substring(1, knownWord.length() - 1).toCharArray();
            Arrays.sort(scrambledInner);
            Arrays.sort(knownInner);
            return Arrays.equals(scrambledInner, knownInner);
        }
        return false;
    }

    // Main function to decode the message
    public static String decode(List<String> words, String message) {
        StringBuilder decodedMessage = new StringBuilder();
        String[] messageWords = message.split(" ");

        for (String word : messageWords) {
            for (String knownWord : words) {
                if (matchWord(word, knownWord)) {
                    decodedMessage.append(knownWord).append(" ");
                    break;  // Once we find the match, we don't need to check other words
                }
            }
        }

        // Remove the trailing space
        return decodedMessage.toString().trim();
    }

    public static void main(String[] args) {
        // Test example
        List<String> words = Arrays.asList("orange", "apple", "banana", "grape");
        String message = "onrgae aplpe bnaana";
        String decodedMessage = decode(words, message);
        System.out.println(decodedMessage);  // Output should be: "orange apple banana"
    }
}
