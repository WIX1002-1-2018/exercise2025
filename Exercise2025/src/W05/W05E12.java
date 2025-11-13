package W05;
import java.util.Scanner;

/**
 * W05E12 - Fibonacci Rabbit Population Simulation
 * Demonstrates: Fibonacci sequence, loop control, and input validation
 *
 * Key Concepts:
 * - Simulating population growth using the Fibonacci sequence
 * - Using a while loop for repeated simulation steps
 * - Sentinel and limit conditions to stop the simulation
 * - User input for number of months
 *
 * Algorithm:
 * 1. Prompt user for number of months to simulate
 * 2. Initialize first two Fibonacci numbers (n1, n2)
 * 3. For each month, print the number of pairs
 * 4. Stop if the month limit is reached or population exceeds 1000
 *
 * @author Muhd. Fathi Nuqman
 */
public class W05E12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Scanner for user input
        int n1 = 0, n2 = 1, tempn2, month = 1, inputmonth;

        System.out.print("How many months to simulate?: ");
        inputmonth = in.nextInt();

        // Simulate Fibonacci sequence for rabbit pairs
        while (true) {
            System.out.printf("Month %d: %d pairs\n", month, n2);
            if (month >= inputmonth) break; // Stop if reached user-specified month
            if (n2 > 1000){
                System.out.print("LIMIT EXCEEDED!"); // Stop if population exceeds 1000
                break;
            }
            tempn2 = n2;
            n2 += n1;
            n1 = tempn2;
            month++;
        }

        in.close(); // Close scanner to prevent resource leak
    }
}
