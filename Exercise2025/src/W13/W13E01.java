package W13;

/**
 * W13E01: Basic try-catch Exception Handling
 * 
 * LEARNING OBJECTIVES:
 * - Understand the concept of exceptions and how they occur during program execution
 * - Learn the basic syntax of try-catch blocks
 * - Handle ArithmeticException when dividing by zero
 * - Understand exception flow: try block executes, if error occurs, catch block handles it
 * 
 * KEY CONCEPTS:
 * 1. Exception: An error condition that occurs during normal program execution
 * 2. try block: Contains code that might generate an exception
 * 3. catch block: Contains code to handle the exception if it occurs
 * 4. The Process:
 *    - An error occurs in the try block
 *    - An exception is thrown
 *    - Program jumps to the catch block
 *    - The catch block handles the exception
 *    - Program continues normally after the catch block
 * 
 * SYNTAX:
 * try {
 *     // Code that may throw an exception
 * } catch (ExceptionType e) {
 *     // Code to handle the exception
 *     System.out.println(e.getMessage());
 * }
 */

public class W13E01 {
    
    public static void main(String[] args) {
        // EXAMPLE 1: Division by Zero (ArithmeticException)
        System.out.println("=== Example 1: Handling ArithmeticException ===");
        divisionExample();
        System.out.println();
        
        // EXAMPLE 2: Safe division with multiple test cases
        System.out.println("=== Example 2: Multiple Division Tests ===");
        safeMultipleDivisions();
        System.out.println();
        
        // EXAMPLE 3: Understanding exception flow
        System.out.println("=== Example 3: Exception Flow Control ===");
        exceptionFlowExample();
    }
    
    /**
     * EXAMPLE 1: Basic try-catch for ArithmeticException
     * Demonstrates:
     * - try block containing the potentially problematic code
     * - catch block that executes if an ArithmeticException occurs
     * - Program continues after the exception is handled
     */
    public static void divisionExample() {
        // Variables for division
        int numerator = 10;
        int denominator = 0;  // This will cause an ArithmeticException
        
        try {
            // This line causes an ArithmeticException because denominator is 0
            // The Java Virtual Machine detects this and throws ArithmeticException
            int result = numerator / denominator;
            System.out.println("Result: " + result);
            
        } catch (ArithmeticException e) {
            // This block ONLY executes if ArithmeticException is thrown
            // e.getMessage() returns the error message from the exception
            System.out.println("Error caught: Cannot divide by zero.");
            System.out.println("Exception message: " + e.getMessage());
            
        }  // End of catch block
        
        // This line executes regardless of whether an exception occurred
        // Demonstrates that the program doesn't crash, it continues normally
        System.out.println("Program continues after exception handling...");
    }
    
    /**
     * EXAMPLE 2: Testing multiple divisions with exception handling
     * Shows that the try-catch block can protect code from crashing
     * when different error conditions occur
     */
    public static void safeMultipleDivisions() {
        // Array of denominators - some will be zero
        int[] denominators = {5, 0, 3, 0, 2};
        int numerator = 20;
        
        for (int i = 0; i < denominators.length; i++) {
            try {
                // Attempt the division
                int result = numerator / denominators[i];
                System.out.println(numerator + " / " + denominators[i] + " = " + result);
                
            } catch (ArithmeticException e) {
                // If division by zero occurs, handle it gracefully
                System.out.println(numerator + " / " + denominators[i] + " -> ERROR: Division by zero");
                
            }
        }
    }
    
    /**
     * EXAMPLE 3: Understanding exception flow
     * When an exception is thrown in the try block:
     * - The rest of the try block is skipped
     * - Control immediately jumps to the catch block
     * - The catch block executes
     * This demonstrates that not all code in the try block executes
     */
    public static void exceptionFlowExample() {
        int a = 10;
        int b = 0;
        int result = 0;
        
        try {
            System.out.println("Entered try block");
            System.out.println("About to divide: " + a + " by " + b);
            
            // Exception occurs here
            result = a / b;
            
            // THIS LINE WILL NOT EXECUTE because exception occurs above
            System.out.println("This line is skipped due to exception");
            System.out.println("Result: " + result);
            
        } catch (ArithmeticException e) {
            // Program jumps here when exception is thrown
            System.out.println("Caught exception in catch block!");
            System.out.println("Exception type: " + e.getClass().getSimpleName());
            System.out.println("The rest of try block was skipped");
            
        }
        
        // Code after try-catch always executes (unless caught exception exits program)
        System.out.println("After the try-catch block");
    }
}
