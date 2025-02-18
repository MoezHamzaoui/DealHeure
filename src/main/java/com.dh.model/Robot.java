package com.dh.model;

import java.util.*;


class Robot {
    public static String solve(int clawPos, int[] boxes, boolean boxInClaw) {
        int n = boxes.length;  // Number of stacks
        int totalBoxes = Arrays.stream(boxes).sum();  // Total number of boxes in all stacks

        // If the arm is carrying a box, include it in the total
        if (boxInClaw) totalBoxes++;

        // Calculate the average number of boxes per stack
        int average = (int) Math.floor(totalBoxes / n);
        int remains = average >= 1 ? totalBoxes % n : totalBoxes;  // Remaining boxes to distribute

        // Create an expected array to hold the ideal number of boxes in each stack
        int[] expected = new int[n];
        for (int i = 0; i < n; i++) {
            expected[i] = (i < remains) ? average + 1 : average;  // Distribute the remaining boxes
        }

        // If the arm is carrying a box
        if (boxInClaw) {
            // Check if we can place the box in the current stack
            if (boxes[clawPos] < expected[clawPos]) {
                return "PLACE";  // Place the box if the current stack is below expectation
            }
            // Check neighboring stacks to find where to go
            for (int i = 1; i < n; i++) {
                if (clawPos - i >= 0) {
                    if (boxes[clawPos - i] < expected[clawPos - i]) {
                        return "LEFT";  // Move left if a neighboring stack is below expectation
                    }
                }
                if (clawPos + i < n) {
                    if (boxes[clawPos + i] < expected[clawPos + i]) {
                        return "RIGHT";  // Move right if a neighboring stack is below expectation
                    }
                }
            }
        } else {
            // If the arm is not carrying a box, check if we can pick from the current stack
            if (boxes[clawPos] > expected[clawPos]) {
                return "PICK";  // Pick the box if the current stack is above expectation
            }
            // Check neighboring stacks to find where to go
            for (int i = 1; i < n; i++) {
                if (clawPos - i >= 0) {
                    if (boxes[clawPos - i] > expected[clawPos - i]) {
                        return "LEFT";  // Move left if a neighboring stack is above expectation
                    }
                }
                if (clawPos + i < n) {
                    if (boxes[clawPos + i] > expected[clawPos + i]) {
                        return "RIGHT";  // Move right if a neighboring stack is above expectation
                    }
                }
            }
        }
        return "";  // Return an empty string if no action is required
    }
}
