package W05;

import java.util.Scanner;

/**
 * W05E05B - Simplified version of W05E05
 * Demonstrates: Even/Odd number counting and summing
 *
 * This shorter variant performs the same task as W05E05:
 * - Reads a user-specified number of integers
 * - Counts and sums even and odd numbers
 *
 * Key Concepts:
 * - Modulo operator (%) for even/odd detection
 * - Separate counters and accumulators for different categories
 * - Compact variable declarations
 * - Conditional accumulation based on number properties
 *
 * Simplifications made:
 * - Fewer local variables (combined declarations)
 * - Compact loop body using a single temporary variable `x`
 * - Shorter, clearer output formatting for quick verification
 * 
 * @author Badrul Anuar
 */
public class W05E05B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers? ");
        int n = sc.nextInt();

        // Counters and accumulators declared together for brevity
        int evenCount = 0, oddCount = 0, sumEven = 0, sumOdd = 0;

        // Process each number
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter number " + i + ": ");
            int x = sc.nextInt();

            // Check if even or odd and update appropriate counters/sums
            if (x % 2 == 0) {
                evenCount++; 
                sumEven += x;
            } else {
                oddCount++; 
                sumOdd += x;
            }
        }

        // Compact results output
        System.out.println();
        System.out.println("Even: count=" + evenCount + ", sum=" + sumEven);
        System.out.println("Odd : count=" + oddCount + ", sum=" + sumOdd);

        sc.close();
    }
}
