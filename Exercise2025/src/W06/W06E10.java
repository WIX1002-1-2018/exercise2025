package W06;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * W06E10 - Binary Search Algorithm
 * Demonstrates: Efficient searching in a sorted array using binary search
 * 
 * Key Concepts:
 * - Binary search algorithm (divide and conquer)
 * - Requires sorted array
 * - Time complexity: O(log n) - much faster than linear search
 * - Divides search space in half with each comparison
 * - Uses Arrays.sort() to sort the array
 * - Counting comparisons to show efficiency
 * 
 * Algorithm:
 * 1. Generate array with random numbers
 * 2. Sort the array (binary search requires sorted data)
 * 3. Display the sorted array
 * 4. Prompt user for number to search
 * 5. Set left = 0, right = array.length - 1
 * 6. While left <= right:
 *    - Calculate middle index
 *    - If middle element equals target, found!
 *    - If target < middle, search left half (right = middle - 1)
 *    - If target > middle, search right half (left = middle + 1)
 * 7. If loop ends without finding, return "Not found"
 * 
 * Advantages:
 * - Very fast for large arrays (logarithmic time)
 * - Best case: finds element in 1 comparison
 * - Worst case: O(log n) comparisons
 * 
 * Disadvantages:
 * - Requires sorted array
 * - More complex than linear search
 * - Sorting takes time if array isn't already sorted
 * 
 * Comparison with Linear Search:
 * - Linear Search: O(n) - checks each element
 * - Binary Search: O(log n) - eliminates half each time
 * - Example: For 1000 elements, linear needs up to 1000 comparisons,
 *            binary needs at most 10 comparisons
 * 
 * @author pensyarah
 */
public class W06E10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rng = new Random();
        int[] a = new int[100];
        
        System.out.println("BINARY SEARCH DEMONSTRATION");
        System.out.println("Original array (unsorted):");
        
        // Generate random numbers
        for (int i = 0; i < a.length; i++){
            a[i] = rng.nextInt(1000);
            System.out.print(a[i] + " ");
        }
        System.out.println();
        
        // Sort the array (required for binary search)
        Arrays.sort(a);
        System.out.println("\nSorted array:");
        for (int num : a) {
            System.out.print(num + " ");
        }
        System.out.println("\n");
        
        // Get search value from user
        System.out.print("Enter number to search: ");
        int toFind = in.nextInt();
        
        // Binary search with comparison counter
        int comparisons = 0;
        int left = 0;
        int right = a.length - 1;
        boolean found = false;
        int position = -1;
        
        System.out.println("\nSearch process:");
        while (left <= right) {
            int middle = (left + right) / 2;
            comparisons++;
            
            System.out.println("Comparison " + comparisons + ": Checking index " + 
                             middle + " (value = " + a[middle] + ")");
            
            if (a[middle] == toFind) {
                // Found the target
                found = true;
                position = middle;
                break;
            } else if (toFind < a[middle]) {
                // Target is in left half
                System.out.println("  -> " + toFind + " < " + a[middle] + 
                                 ", search left half");
                right = middle - 1;
            } else {
                // Target is in right half
                System.out.println("  -> " + toFind + " > " + a[middle] + 
                                 ", search right half");
                left = middle + 1;
            }
        }
        
        // Display results
        System.out.println();
        if (found) {
            System.out.println("Found at position " + position);
            System.out.println("Number of comparisons: " + comparisons);
        } else {
            System.out.println("Not found!");
            System.out.println("Number of comparisons: " + comparisons);
        }
        
        // Show efficiency comparison
        System.out.println("\nEfficiency Note:");
        System.out.println("Binary search used " + comparisons + " comparisons.");

        
        if (found) {
            // Count actual linear search comparisons for fair comparison
            int linearComparisons = position + 1;
            System.out.println("  - Actual for this search: " + linearComparisons + " comparisons");
            System.out.println("\nBinary search was " + 
                     String.format("%.1f", (double)linearComparisons / comparisons) + 
                     "x faster for this search!");
        }
        
        in.close();
    }
}
