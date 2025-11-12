package W05;
import java.util.Scanner;
/**
 * W05E07 - Summing multiple user inputs
 * Demonstrates : Keep asking for user input until a sentinel value ("done") is entered then display the sum of the inputs
 * 
 * Key Concepts:
 * - Using while loop to continuously accept user input
 * - Handling sentinel values to terminate input
 * - Accumulating a sum of numeric inputs
 * - Using try-catch to handle invalid input formats
 * 
 * Algorithm:
 * 1. Initialize sum and number variables
 * 2. Use while loop to get user input
 * 3. Check for sentinel value to exit loop
 * 4. Try to parse input and add to sum
 * 5. Catch and handle invalid input
 * 6. Display the total sum
 * 
 * @author Yudask
 */
public class W05E07 {
    public static void main(String[] args) {
       try (Scanner input = new Scanner(System.in)){
        double sum = 0;
        double number;

        while (true) {
            // Prompt user for input
            System.out.print("Enter...: ");
            String inputStr = input.nextLine();
            // Sentinel value to end input
            if (inputStr.equalsIgnoreCase("done")) {
                break;
            }
            // Using try-catch to handle invalid number inputs
            try {
                // Parse the input to double and add it to sum
                number = Double.parseDouble(inputStr.trim());
                sum += number;
            // Catch block for invalid input format
            } catch (NumberFormatException Invalid) {
                System.out.println("Invalid input, please enter a number or \"done\".");
                continue;
            }
        }
        System.out.printf("Total Expenses: %.2f%n", sum);
        }
       }
    }

