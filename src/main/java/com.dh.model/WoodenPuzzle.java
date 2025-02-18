package com.dh.model;

import java.util.*;

public class WoodenPuzzle {

    public static int solve(int width, int height, int nbBlocks, String[] grid) {
        // Loop over each possible block number
        for (int blockNum = 0; blockNum < nbBlocks; blockNum++) {
            // Find all positions of the current block number
            List<int[]> blockPositions = new ArrayList<>();
            for (int r = 0; r < height; r++) {
                for (int c = 0; c < width; c++) {
                    if (grid[r].charAt(c) == (char)('0' + blockNum)) {
                        blockPositions.add(new int[]{r, c});
                    }
                }
            }

            // Check if the block can be moved
            if (canMoveRight(width, height, grid, blockPositions)) {
                return blockNum;
            }
        }

        return -1; // No block can be moved (should not happen as per the problem statement)
    }

    // Helper function to check if a block can move right
    private static boolean canMoveRight(int width, int height, String[] grid, List<int[]> blockPositions) {
        // Check if all positions of the block can be moved to the right
        for (int[] pos : blockPositions) {
            int r = pos[0];
            int c = pos[1];

            // If the block is already at the right edge or the next cell is a wall or another block
            if (c + 1 >= width || grid[r].charAt(c + 1) != '.') {
                return false;
            }
        }

        return true;
    }

    // Test the solve method
    public static void main(String[] args) {
        // Example usage
        int width = 5;
        int height = 5;
        int nbBlocks = 3;
        String[] grid = {
                "X.XXX",
                "0...X",
                "0....",
                "X....",
                "XXXXX"
        };

        int blockToRemove = solve(width, height, nbBlocks, grid);
        System.out.println("Next block to remove: " + blockToRemove);
    }
}