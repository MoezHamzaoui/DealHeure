package com.dh.model;

public class Largest {

    class Algorithm {

        /**
         * @return the largest number of the given array
         */
        static int findLargest(int[] numbers) {
            int largest = numbers[0];
            for (int i = 0; i < numbers.length; i++) {
                if (largest <= numbers[i]) {
                    largest = numbers[i];
                }
            }
            return largest;

        }
    }
}
