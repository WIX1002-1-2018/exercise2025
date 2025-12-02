package W07;

/**
 * W07L01 - Printing Text Shapes with Helper Method
 * Demonstrates: Using a utility method to reduce repetition when printing
 * characters for console-based ASCII shapes (triangle & diamond).
 *
 * Method:
 * - multiPrint(int n, char c): prints the character c exactly n times
 *   without a newline.
 *
 * Key Concepts:
 * - Method extraction for reuse.
 * - Building shapes with controlled spacing and width.
 * - Diamond pattern: increasing then decreasing width (2*i-1 stars).
 *
 * @author pensyarah
 */
public class W07L01 {
    public static void multiPrint(int n, char c) {
        for (int i = 0; i < n; i++) {
            System.out.print(c);
        }
    }

    public static void main(String[] args) {
        int size = 5;

        System.out.println("Triangle");
        for (int i = 1; i <= size; i++) {
            multiPrint(i, '*');
            System.out.println();
        }

        System.out.println("Diamonds");
        // Upper half
        for (int i = 1; i <= size; i++) {
            multiPrint(size - i, ' ');
            multiPrint(2 * i - 1, '*');
            System.out.println();
        }
        // Lower half
        for (int i = size - 1; i >= 1; i--) {
            multiPrint(size - i, ' ');
            multiPrint(2 * i - 1, '*');
            System.out.println();
        }
    }
}
