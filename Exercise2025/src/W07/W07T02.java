package W07;

/**
 * W07T02 - Sorting Three Numbers Descending (Manual Swaps)
 * Demonstrates: Ordering three values without arrays by pairwise swaps.
 *
 * Approach:
 * - Perform conditional swaps to bubble the largest value into 'a', then
 *   ensure second largest in 'b'.
 * - After sequence, a >= b >= c.
 *
 * Key Concepts:
 * - Temporary variable swap pattern.
 * - Multiple conditional passes to achieve ordering.
 * - Formatting output with printf.
 *
 * @author pensyarah
 */
public class W07T02 {
    public static void displayReverseOrder(int a, int b, int c) {
        if (a < b) { int temp = a; a = b; b = temp; }
        if (a < c) { int temp = a; a = c; c = temp; }
        if (b < c) { int temp = b; b = c; c = temp; }
        System.out.printf("%d %d %d%n", a, b, c);
    }

    public static void main(String[] args) {
        displayReverseOrder(4, 10, 6);
    }
}
