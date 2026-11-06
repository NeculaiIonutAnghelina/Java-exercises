
package com.amigoscode._2_developers._1_loops;

/**
 * Loop Exercises
 *
 * Practice nested loops, break/continue statements, labeled breaks,
 * accumulators, pattern printing, reverse iteration, and controlled infinite loops.
 */
public class LoopExercises {

    /**
     * Prints a multiplication table from 1 to n using nested loops.
     */
    public static void printMultiplicationTable(int n) {
        // TODO: 1 - Use nested for loops to print an n x n multiplication table.

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }
    }

    /**
     * Returns the sum of all numbers from 1 to n,
     * skipping multiples of 3 and stopping when sum exceeds 100.
     */
    public static int sumWithSkipAndStop(int n) {
        int sum = 0;

        // TODO: 2 - Use continue and break.
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                continue;
            }

            sum += i;

            if (sum > 100) {
                break;
            }
        }

        return sum;
    }

    /**
     * Searches a 2D array for a target value.
     */
    public static String findInMatrix(int[][] matrix, int target) {
        String result = "Not found";

        // TODO: 3 - Use nested loops and a labeled break.
        search:
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (target == matrix[i][j]) {
                    result = "Found at [" + i + "][" + j + "]";
                    break search;
                }
            }
        }

        return result;
    }

    /**
     * Computes the factorial of n using an accumulator.
     */
    public static long factorial(int n) {
        long accumulator = 1;

        // TODO: 4 - Calculate factorial.
        for (long i = 1; i <= n; i++) {
            accumulator *= i;
        }

        return accumulator;
    }

    /**
     * Prints a centered pyramid pattern of stars.
     */
    public static void printPyramid(int rows) {
        // TODO: 5 - Use nested loops to print a pyramid.
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    /**
     * Returns array elements in reverse order.
     */
    public static String iterateBackwards(int[] arr) {
        StringBuilder sb = new StringBuilder();

        // TODO: 6 - Iterate backwards.
        for (int i = arr.length - 1; i >= 0; i--) {
            sb.append(arr[i]);

            if (i > 0) {
                sb.append(", ");
            }
        }

        return sb.toString();
    }

    /**
     * Generates random numbers until the target is found.
     */
    public static int countUntilMatch(int target) {
        int attempts = 0;
        java.util.Random random = new java.util.Random();

        // TODO: 7 - Use while(true) to create an infinite loop.
        // Each iteration: increment attempts, generate a random int
        // between 1 and 100, and break if it matches the target.

        return attempts;
    }

    public static void main(String[] args) {
        System.out.println("=== Multiplication Table (4x4) ===");
        printMultiplicationTable(4);

        System.out.println("\n=== Sum with Skip and Stop (n=50) ===");
        System.out.println("Sum: " + sumWithSkipAndStop(50));

        System.out.println("\n=== Find in Matrix ===");
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println(findInMatrix(matrix, 5));
        System.out.println(findInMatrix(matrix, 99));

        System.out.println("\n=== Factorial ===");
        System.out.println("5! = " + factorial(5));
        System.out.println("10! = " + factorial(10));

        System.out.println("\n=== Pyramid (5 rows) ===");
        printPyramid(5);

        System.out.println("\n=== Iterate Backwards ===");
        System.out.println(
                iterateBackwards(new int[]{1, 2, 3, 4, 5})
        );

        System.out.println("\n=== Count Until Match ===");
        System.out.println("Attempts to find 42: " + countUntilMatch(42));
    }
}
