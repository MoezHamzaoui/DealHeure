package com.dh.model;

import java.util.Scanner;

public class SumOfNaturalNumbers {

    public static void main(String[] args) {
        // Create a Scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for input
        System.out.print("Enter a number N: ");
        int N = scanner.nextInt();

        // Use the formula to calculate the sum
        int sum = N * (N + 1) / 2;

        // Output the result
        System.out.println("The sum of the first " + N + " natural numbers is: " + sum);

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
