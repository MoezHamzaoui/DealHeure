package com.dh.model;
import java.util.HashMap;


public class SumPair {
    public static int[] findSumPair(int[] numbers, int k) {
        HashMap<Integer, Integer> map = new HashMap<>(); // Stocke les nombres et leurs indices
        int[] result = {0, 0}; // Valeur par défaut si aucune paire n'est trouvée
        int minLeft = Integer.MAX_VALUE, minRight = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            int complement = k - numbers[i];

            if (map.containsKey(complement)) {
                int left = map.get(complement);
                int right = i;

                if (left < minLeft || (left == minLeft && right < minRight)) {
                    minLeft = left;
                    minRight = right;
                    result[0] = left;
                    result[1] = right;
                }
            }

            if (!map.containsKey(numbers[i])) {
                map.put(numbers[i], i);
            }
        }

        return (minLeft == Integer.MAX_VALUE) ? new int[]{0, 0} : result;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 5, 5, 4, 5};
        int k = 6;
        int[] result = findSumPair(numbers, k);
        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }
}
