package W13;

/**
 * W13E02: Multiple Catch Blocks
 * 
 * LEARNING OBJECTIVES:
 * - Understand how to handle different types of exceptions differently
 * - Learn to chain multiple catch blocks for specific exception types
 * - Understand the order of catch blocks (specific to general)
 * - Use a generic catch block as a fallback for unexpected exceptions
 * 
 * KEY CONCEPTS:
 * 1. Multiple catch blocks allow different handling for different exception types
 * 2. Each catch block handles a specific exception type
 * 3. Order matters: specific exceptions should come before general ones
 * 4. Exception hierarchy: ArithmeticException, ArrayIndexOutOfBoundsException, 
 *    NumberFormatException all inherit from Exception class
 * 5. Only the FIRST matching catch block executes
 * 
 * COMMON EXCEPTION TYPES:
 * - NumberFormatException: When parsing invalid number strings
 * - ArrayIndexOutOfBoundsException: When accessing invalid array indices
 * - ArithmeticException: When arithmetic operation fails (e.g., divide by zero)
 * - Exception: Generic catch-all for any other exceptions
 * 
 * SYNTAX:
 * try {
 *     // Code that might throw different types of exceptions
 * } catch (ExceptionTypeOne e) {
 *     // Handle ExceptionTypeOne specifically
 * } catch (ExceptionTypeTwo e) {
 *     // Handle ExceptionTypeTwo specifically
 * } catch (Exception e) {
 *     // Catch any other exception as a fallback
 * }
 */

public class W13E02 {
    
    public static void main(String[] args) {
        // EXAMPLE 1: Multiple catch blocks for different exception types
        System.out.println("=== Example 1: Multiple Catch Blocks ===");
        multiCatchExample();
        System.out.println();
        
        // EXAMPLE 2: Array and Number format errors
        System.out.println("=== Example 2: Array and Format Errors ===");
        arrayAndFormatErrors();
        System.out.println();
        
        // EXAMPLE 3: Demonstrating catch block order (Specific to General)
        System.out.println("=== Example 3: Catch Block Order ===");
        catchBlockOrderExample();
        System.out.println();
        
        // EXAMPLE 4: Testing multiple scenarios
        System.out.println("=== Example 4: Various Exception Scenarios ===");
        testVariousExceptions();
    }
    
    /**
     * EXAMPLE 1: Multiple catch blocks handling different exception types
     * 
     * IMPORTANT: When you have multiple catch blocks:
     * - Each catch handles ONE specific exception type
     * - Only the FIRST matching catch block executes
     * - The rest are skipped
     * - Specific exceptions should be before general ones
     */
    public static void multiCatchExample() {
        try {
            // Test 1: NumberFormatException
            String numberStr = "abc123";  // Not a valid integer
            int num = Integer.parseInt(numberStr);
            
            // Test 2: ArrayIndexOutOfBoundsException
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]);  // Index 5 doesn't exist
            
        } catch (NumberFormatException e) {
            // Executes ONLY if NumberFormatException is thrown
            // This handles invalid number string conversions
            System.out.println("Caught NumberFormatException!");
            System.out.println("Error message: " + e.getMessage());
            System.out.println("The string could not be converted to a number.");
            
        } catch (ArrayIndexOutOfBoundsException e) {
            // Executes ONLY if ArrayIndexOutOfBoundsException is thrown
            // This handles attempts to access invalid array indices
            System.out.println("Caught ArrayIndexOutOfBoundsException!");
            System.out.println("Error message: " + e.getMessage());
            System.out.println("Array access index is out of valid bounds.");
            
        } catch (Exception e) {
            // Catch-all: handles ANY other exception not caught above
            // This is a safety net for unexpected errors
            System.out.println("Caught general Exception!");
            System.out.println("Error message: " + e.getMessage());
            
        }
    }
    
    /**
     * EXAMPLE 2: Specific scenario with array and format errors
     * 
     * IMPORTANT CONCEPT: Order of catch blocks
     * - MUST go from most specific to least specific
     * - NumberFormatException is more specific than Exception
     * - ArrayIndexOutOfBoundsException is more specific than Exception
     * - If you put Exception first, it will catch everything and 
     *   the specific catch blocks will never execute (compiler error)
     */
    public static void arrayAndFormatErrors() {
        try {
            // Scenario: Parse a number and access an array
            String userInput = "25";  // Valid input
            int number = Integer.parseInt(userInput);  // Convert to integer
            
            // Create a small array
            int[] scores = {10, 20, 30};
            
            // Try to access an element at index = the parsed number
            System.out.println("Accessing array at index " + number);
            int score = scores[number];  // This will throw exception (index out of bounds)
            System.out.println("Score: " + score);
            
        } catch (NumberFormatException e) {
            // Handles conversion errors
            System.out.println("ERROR: Invalid number format");
            System.out.println("Details: " + e.getMessage());
            
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handles array access errors
            System.out.println("ERROR: Array index out of bounds");
            System.out.println("Details: " + e.getMessage());
            
        } catch (Exception e) {
            // Fallback for any unexpected errors
            System.out.println("ERROR: Unexpected error occurred");
            System.out.println("Details: " + e.getMessage());
        }
    }
    
    /**
     * EXAMPLE 3: Why catch block order matters
     * 
     * CORRECT ORDER (Specific to General):
     * 1. Most specific exceptions first (NumberFormatException, ArrayIndexOutOfBoundsException)
     * 2. Less specific exception next (ArithmeticException)
     * 3. Most general exception last (Exception)
     * 
     * INCORRECT ORDER:
     * If you put Exception first, all exceptions match it, and the
     * specific catch blocks below will never execute (unreachable code)
     */
    public static void catchBlockOrderExample() {
        try {
            // Different test cases - uncomment one to test
            
            // Test Case 1: Division by zero (ArithmeticException)
            int x = 10;
            int y = 0;
            int result = x / y;
            
            // Test Case 2: Invalid format (NumberFormatException)
            // String str = "notanumber";
            // int parsed = Integer.parseInt(str);
            
            // Test Case 3: Array out of bounds (ArrayIndexOutOfBoundsException)
            // int[] arr = {1, 2, 3};
            // int element = arr[10];
            
        } catch (NumberFormatException e) {
            System.out.println("Caught: Invalid number format");
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught: Array index out of bounds");
            
        } catch (ArithmeticException e) {
            System.out.println("Caught: Arithmetic exception (division by zero)");
            
        } catch (Exception e) {
            // This MUST be last - it's the most general
            System.out.println("Caught: General exception");
        }
    }
    
    /**
     * EXAMPLE 4: Test different scenarios in a loop
     * 
     * This demonstrates practical use of multiple catch blocks
     * by handling different types of errors that might occur
     */
    public static void testVariousExceptions() {
        // Test data: mix of valid and invalid inputs
        String[] inputs = {"10", "abc", "25.5", "0"};
        
        for (String input : inputs) {
            try {
                System.out.println("\nProcessing input: " + input);
                
                // Try to convert to integer
                int number = Integer.parseInt(input);
                System.out.println("Converted to: " + number);
                
                // Try to divide by this number
                int result = 100 / number;
                System.out.println("100 divided by " + number + " = " + result);
                
            } catch (NumberFormatException e) {
                // Handles when input cannot be converted to a number
                System.out.println("Error: '" + input + "' is not a valid integer");
                
            } catch (ArithmeticException e) {
                // Handles when number is zero (division by zero)
                System.out.println("Error: Cannot divide by " + input);
                
            } catch (Exception e) {
                // Catches any other unexpected errors
                System.out.println("Unexpected error: " + e.getMessage());
            }
        }
    }
}
