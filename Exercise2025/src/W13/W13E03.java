package W13;

/**
 * W13E03: Custom Exception Classes and throws Keyword
 * 
 * LEARNING OBJECTIVES:
 * - Create custom exception classes by extending the Exception class
 * - Use the throws keyword in method signatures
 * - Understand the difference between throwing and catching exceptions
 * - Use custom exceptions to enforce business logic validation
 * 
 * KEY CONCEPTS:
 * 1. Custom Exception: A user-defined exception class that extends Exception
 * 2. throws keyword: Declares that a method might throw a specific exception
 * 3. The responsibility moves from the method to the caller (who called the method)
 * 4. If a method declares throws Exception, the caller MUST handle it with try-catch
 * 5. Creating custom exceptions allows domain-specific error handling
 * 
 * CUSTOM EXCEPTION SYNTAX:
 * public class CustomExceptionName extends Exception {
 *     // Constructor with default message
 *     public CustomExceptionName() {
 *         super("Default error message");
 *     }
 *     
 *     // Constructor with custom message parameter
 *     public CustomExceptionName(String message) {
 *         super(message);
 *     }
 * }
 * 
 * USING THROWS KEYWORD:
 * public returnType methodName(parameters) throws CustomException {
 *     if (error condition) {
 *         throw new CustomException("Error message");
 *     }
 * }
 * 
 * HANDLING IN CALLER:
 * try {
 *     methodThatThrowsException();
 * } catch (CustomException e) {
 *     // Handle the exception
 * }
 */

/**
 * STEP 1: Define a custom exception class
 * 
 * This exception is thrown when age is not valid for voting
 * Requirements: age must be >= 18
 * 
 * IMPORTANT: Custom exceptions MUST extend Exception class
 */
class InvalidAgeException extends Exception {
    
    /**
     * Constructor 1: No-argument constructor with default message
     * Calls super() to pass a default message to the Exception class
     */
    public InvalidAgeException() {
        super("Age is not valid.");
    }
    
    /**
     * Constructor 2: Accepts a custom message parameter
     * Allows the caller to provide a specific error message
     * The message is passed to the parent Exception class via super()
     * 
     * @param message The custom error message to display
     */
    public InvalidAgeException(String message) {
        super(message);
    }
}

/**
 * Custom exception for invalid student grade
 */
class InvalidGradeException extends Exception {
    public InvalidGradeException(String message) {
        super(message);
    }
}

/**
 * STEP 2: Create a class that uses the custom exception
 */
public class W13E03 {
    
    public static void main(String[] args) {
        // EXAMPLE 1: Basic custom exception usage
        System.out.println("=== Example 1: Age Validation ===");
        basicCustomExceptionExample();
        System.out.println();
        
        // EXAMPLE 2: Multiple custom exceptions
        System.out.println("=== Example 2: Multiple Custom Exceptions ===");
        multipleCustomExceptionsExample();
        System.out.println();
        
        // EXAMPLE 3: Processing multiple users
        System.out.println("=== Example 3: Batch Processing ===");
        batchProcessingExample();
    }
    
    /**
     * EXAMPLE 1: Basic custom exception with throws keyword
     * 
     * IMPORTANT CONCEPTS:
     * 1. checkVotingEligibility() declares throws InvalidAgeException
     *    This means: "This method might throw InvalidAgeException"
     * 2. The caller (main method) MUST handle it with try-catch
     * 3. If the method throws, execution stops and jumps to catch block
     * 4. If the method doesn't throw, execution continues normally
     */
    public static void basicCustomExceptionExample() {
        System.out.println("Checking voting eligibility...\n");
        
        // Test Case 1: Valid age (should not throw)
        System.out.println("Test 1: Age 25");
        try {
            checkVotingEligibility(25);
            // If no exception, this line executes
            System.out.println("Status: Eligible to vote\n");
            
        } catch (InvalidAgeException e) {
            // Only executes if InvalidAgeException is thrown
            System.out.println("Error: " + e.getMessage() + "\n");
        }
        
        // Test Case 2: Invalid age (should throw)
        System.out.println("Test 2: Age 15");
        try {
            checkVotingEligibility(15);
            // This line will NOT execute because exception is thrown above
            System.out.println("Status: Eligible to vote\n");
            
        } catch (InvalidAgeException e) {
            // Executes because checkVotingEligibility() throws exception
            System.out.println("Error: " + e.getMessage() + "\n");
        }
    }
    
    /**
     * EXAMPLE 2: Multiple custom exceptions
     * 
     * A method can throw multiple different exception types
     * The caller must handle each one with separate catch blocks
     */
    public static void multipleCustomExceptionsExample() {
        System.out.println("Checking student eligibility for scholarship...\n");
        
        // Test different scenarios
        testScholarshipEligibility(25, 85);  // Valid
        testScholarshipEligibility(15, 85);  // Invalid age
        testScholarshipEligibility(25, 45);  // Invalid grade
    }
    
    /**
     * Helper method for Example 2
     * This method can throw TWO different custom exceptions
     * The caller MUST handle both
     * 
     * @param age The student's age
     * @param grade The student's grade percentage
     */
    private static void testScholarshipEligibility(int age, int grade) {
        try {
            System.out.println("Processing: Age " + age + ", Grade " + grade);
            checkScholarshipEligibility(age, grade);
            System.out.println("Result: Eligible for scholarship\n");
            
        } catch (InvalidAgeException e) {
            // Executes if age is invalid
            System.out.println("Age Error: " + e.getMessage() + "\n");
            
        } catch (InvalidGradeException e) {
            // Executes if grade is invalid
            System.out.println("Grade Error: " + e.getMessage() + "\n");
            
        }
    }
    
    /**
     * EXAMPLE 3: Processing multiple people in a batch
     * Shows how try-catch loops handle multiple exceptions
     */
    public static void batchProcessingExample() {
        // Array of person data: {name, age}
        Object[][] people = {
            {"Alice", 22},
            {"Bob", 17},
            {"Charlie", 30},
            {"Diana", 16},
            {"Eve", 25}
        };
        
        System.out.println("Registering voters:\n");
        int successCount = 0;
        int failureCount = 0;
        
        for (Object[] person : people) {
            String name = (String) person[0];
            int age = (int) person[1];
            
            try {
                System.out.println("Processing: " + name + " (age " + age + ")");
                checkVotingEligibility(age);
                System.out.println("✓ " + name + " registered successfully\n");
                successCount++;
                
            } catch (InvalidAgeException e) {
                System.out.println("✗ " + name + " registration failed: " + e.getMessage() + "\n");
                failureCount++;
            }
        }
        
        System.out.println("=== Registration Summary ===");
        System.out.println("Successful: " + successCount);
        System.out.println("Failed: " + failureCount);
    }
    
    /**
     * METHOD 1: Check voting eligibility
     * 
     * IMPORTANT DECLARATION:
     * The "throws InvalidAgeException" in the signature tells the compiler:
     * "This method might throw InvalidAgeException"
     * 
     * Consequence:
     * - The caller MUST wrap this call in try-catch
     * - OR the caller must also declare throws InvalidAgeException
     * - Otherwise, the code won't compile
     * 
     * @param age The person's age
     * @throws InvalidAgeException if age is less than 18
     */
    public static void checkVotingEligibility(int age) throws InvalidAgeException {
        // IMPORTANT: This method THROWS the exception, not catches it
        // The responsibility is passed to the caller
        
        if (age < 18) {
            // Throw with custom message (uses Constructor 2)
            throw new InvalidAgeException("Age is not valid for voting. Must be 18 or older.");
        } else {
            // Normal execution if no error
            System.out.println("Age is valid for voting (Age: " + age + ")");
        }
    }
    
    /**
     * METHOD 2: Check scholarship eligibility
     * 
     * This method declares MULTIPLE exceptions it might throw
     * Syntax: throws Exception1, Exception2, Exception3
     * 
     * IMPORTANT: 
     * - Comma-separated list of exception types
     * - Caller must handle each one with separate catch blocks
     * 
     * @param age The student's age
     * @param grade The student's grade percentage
     * @throws InvalidAgeException if age is less than 18
     * @throws InvalidGradeException if grade is less than 80
     */
    public static void checkScholarshipEligibility(int age, int grade) 
            throws InvalidAgeException, InvalidGradeException {
        
        // Check age first
        if (age < 18) {
            throw new InvalidAgeException("Student must be 18 or older.");
        }
        
        // Check grade
        if (grade < 80) {
            throw new InvalidGradeException("Minimum grade requirement is 80. Current: " + grade);
        }
        
        // If both checks pass
        System.out.println("All checks passed!");
    }
}
