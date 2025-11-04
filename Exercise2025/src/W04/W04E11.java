/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package W04;

/**
 *
 * @author Badrul
 */
public class W04E11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Exercise 11: Enhanced for loop (for-each loop)
        // The enhanced for loop is a simplified way to iterate through arrays and collections
        // Syntax: for (dataType variable : array/collection) { ... }
        // Also called "for-each" loop - introduced in Java 5
        
        // ===== EXAMPLE 1: Enhanced for loop with array of integers =====
        System.out.println("===== Example 1: Enhanced for loop with integer array =====");
        System.out.println("Print all numbers in array:");
        
        // Create an array of integers
        int[] numbers = {10, 20, 30, 40, 50};
        
        // Enhanced for loop: for each number in numbers array
        // variable 'num' takes each value from the array one by one
        for (int num : numbers) {
            System.out.println("Number: " + num);
        }
        System.out.println();
        
        // ===== EXAMPLE 2: Enhanced for loop with array of strings =====
        System.out.println("===== Example 2: Enhanced for loop with string array =====");
        System.out.println("Print all names:");
        
        // Create an array of strings
        String[] names = {"Alice", "Bob", "Charlie", "Diana", "Eve"};
        
        // Enhanced for loop: for each name in names array
        for (String name : names) {
            System.out.println("Name: " + name);
        }
        System.out.println();
        
        // ===== EXAMPLE 3: Enhanced for loop with array of doubles =====
        System.out.println("===== Example 3: Enhanced for loop with double array =====");
        System.out.println("Calculate sum of all prices:");
        
        // Create an array of prices (doubles)
        double[] prices = {19.99, 29.99, 39.99, 49.99, 59.99};
        double total = 0;
        
        // Enhanced for loop: for each price in prices array
        for (double price : prices) {
            total += price;
        }
        System.out.println("Total price: $" + String.format("%.2f", total));
        System.out.println();
        
        // ===== EXAMPLE 4: Enhanced for loop with 2D array =====
        System.out.println("===== Example 4: Enhanced for loop with 2D array =====");
        System.out.println("Print all elements in 2D array:");
        
        // Create a 2D array (matrix)
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        // Outer enhanced for loop: for each row in matrix
        for (int[] row : matrix) {
            // Inner enhanced for loop: for each element in row
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
        System.out.println();
        
        // ===== EXAMPLE 5: Comparison - Traditional for vs Enhanced for =====
        System.out.println("===== Example 5: Comparison - Traditional for vs Enhanced for =====");
        
        int[] data = {100, 200, 300, 400, 500};
        
        // Traditional for loop (with index)
        System.out.println("Traditional for loop (with index):");
        for (int i = 0; i < data.length; i++) {
            System.out.println("Index " + i + ": " + data[i]);
        }
        System.out.println();
        
        // Enhanced for loop (without index)
        System.out.println("Enhanced for loop (without index):");
        for (int value : data) {
            System.out.println("Value: " + value);
        }
        System.out.println();
        
        // ===== EXAMPLE 6: When to use each loop type =====
        System.out.println("===== Example 6: When to use each loop type =====");
        
        int[] scores = {85, 90, 78, 92, 88};
        
        // Use traditional for loop when you need the INDEX
        System.out.println("Traditional for loop (need index):");
        for (int i = 0; i < scores.length; i++) {
            System.out.println("Student " + (i + 1) + " scored: " + scores[i]);
        }
        System.out.println();
        
        // Use enhanced for loop when you only need the VALUES
        System.out.println("Enhanced for loop (only need values):");
        for (int score : scores) {
            System.out.println("Score: " + score);
        }
        System.out.println();
        
        // ===== EXAMPLE 7: Enhanced for loop with char array =====
        System.out.println("===== Example 7: Enhanced for loop with char array =====");
        System.out.println("Print all characters:");
        
        // Create an array of characters
        char[] letters = {'A', 'B', 'C', 'D', 'E'};
        
        // Enhanced for loop: for each letter in letters array
        for (char letter : letters) {
            System.out.print(letter + " ");
        }
        System.out.println();
        System.out.println();
        
        // ===== EXAMPLE 8: Enhanced for loop with boolean array =====
        System.out.println("===== Example 8: Enhanced for loop with boolean array =====");
        System.out.println("Check all boolean values:");
        
        // Create an array of booleans
        boolean[] flags = {true, false, true, true, false};
        
        // Enhanced for loop: for each flag in flags array
        for (boolean flag : flags) {
            System.out.println("Flag: " + flag);
        }
        System.out.println();
        
        // ===== KEY POINTS ABOUT ENHANCED FOR LOOP =====
        // 1. Syntax: for (dataType variable : array/collection) { ... }
        // 2. Works with arrays and collections (List, Set, etc.)
        // 3. Variable takes each element value one by one
        // 4. Cannot modify the loop variable to affect the array
        // 5. No access to index - use traditional for loop if you need index
        // 6. Cleaner and more readable than traditional for loop
        // 7. Less error-prone (no off-by-one errors)
        // 8. Preferred when you only need element values, not indices
        // 9. Cannot iterate backwards with enhanced for loop
        // 10. Cannot skip elements or iterate with custom step
    }
    
}

