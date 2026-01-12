package W13;

import java.io.PrintWriter;
import java.io.FileNotFoundException;

/**
 * W13E04: File I/O with Exception Handling and finally Block
 * 
 * LEARNING OBJECTIVES:
 * - Understand checked exceptions (FileNotFoundException)
 * - Learn to use the finally block for resource cleanup
 * - Use PrintWriter to write to files with exception handling
 * - Ensure proper resource management to prevent memory leaks
 * 
 * KEY CONCEPTS:
 * 1. Checked Exception: An exception that MUST be caught or declared with throws
 *    FileNotFoundException is a checked exception
 * 2. PrintWriter: A class used to write text to files
 * 3. finally block: Code that ALWAYS executes, whether exception occurs or not
 * 4. Resource Management: Always close files/streams to prevent resource leaks
 * 5. Best Practice: Use try-catch-finally to ensure resources are cleaned up
 * 
 * WHY FINALLY IS IMPORTANT:
 * - Ensures cleanup code executes even if exception occurs
 * - Prevents resource leaks (unclosed files, memory not freed)
 * - Guarantees cleanup happens before method returns
 * 
 * EXECUTION ORDER:
 * try block     → executes normally
 * exception     → caught by catch block OR jumps to finally
 * catch block   → executes if exception caught
 * finally block → ALWAYS executes (after try or catch)
 * 
 * SYNTAX:
 * try {
 *     // Code that might throw exception
 * } catch (ExceptionType e) {
 *     // Handle the exception
 * } finally {
 *     // Code that ALWAYS executes
 *     // Use this to close resources
 * }
 */

public class W13E04 {
    
    public static void main(String[] args) {
        // EXAMPLE 1: Basic file writing with exception handling
        System.out.println("=== Example 1: Basic File Writing ===");
        basicFileWritingExample();
        System.out.println();
        
        // EXAMPLE 2: Multiple writes with error handling
        System.out.println("=== Example 2: Writing Multiple Lines ===");
        multipleWritesExample();
        System.out.println();
        
        // EXAMPLE 3: Exception handling in file operations
        System.out.println("=== Example 3: Simulating File Errors ===");
        fileErrorExample();
    }
    
    /**
     * EXAMPLE 1: Basic file writing with exception handling
     * 
     * IMPORTANT PATTERN:
     * 1. Declare PrintWriter as null outside try block
     *    This allows finally block to check if it was created
     * 2. Initialize PrintWriter in try block
     *    This throws FileNotFoundException if file cannot be created
     * 3. Write data in try block
     * 4. Catch FileNotFoundException if it occurs
     * 5. Close resource in finally block
     * 
     * WHY THIS PATTERN:
     * - try block throws FileNotFoundException when creating file
     * - catch block handles the error gracefully
     * - finally block ensures file is closed even if error occurs
     * - Prevents resource leaks (unclosed file handles)
     */
    public static void basicFileWritingExample() {
        // Step 1: Declare resource outside try block
        // This is important so finally block can access it
        PrintWriter outputStream = null;
        
        try {
            // Step 2: Create/open the file
            // This line MUST be in try block because it throws FileNotFoundException
            // If file cannot be created, this exception is thrown immediately
            outputStream = new PrintWriter("W13E04_Example1.txt");
            
            // Step 3: Write data to file
            // These lines only execute if file was created successfully
            outputStream.println("=== Exception Handling Example 1 ===");
            outputStream.println("This file was created successfully.");
            outputStream.println("Date: January 2026");
            outputStream.println();
            outputStream.println("Lesson: File I/O with exception handling");
            
            System.out.println("File created and written successfully!");
            
        } catch (FileNotFoundException e) {
            // Step 4: Handle the exception if file creation fails
            // This block ONLY executes if FileNotFoundException is thrown
            System.out.println("Error: Could not create the file");
            System.out.println("Exception message: " + e.getMessage());
            System.out.println("Possible causes:");
            System.out.println("  - Insufficient permissions");
            System.out.println("  - Invalid file path");
            System.out.println("  - Disk full");
            
        } finally {
            // Step 5: Close the resource
            // This block ALWAYS executes, whether exception occurred or not
            // CRITICAL: This prevents resource leaks
            
            if (outputStream != null) {
                // Only close if file was successfully created
                outputStream.close();
                System.out.println("File closed and resources released.");
            } else {
                System.out.println("File was never opened, nothing to close.");
            }
        }
        
        // Execution continues here after try-catch-finally completes
        System.out.println("Method execution complete.");
    }
    
    /**
     * EXAMPLE 2: Writing multiple lines with proper exception handling
     * 
     * Demonstrates:
     * - Writing multiple lines of text
     * - Using println() for each line (adds newline automatically)
     * - Proper resource management
     */
    public static void multipleWritesExample() {
        PrintWriter writer = null;
        
        try {
            // Create output file
            writer = new PrintWriter("W13E04_Example2.txt");
            
            // Write educational content about exception handling
            writer.println("=== Chapter 11: Exception Handling ===");
            writer.println();
            writer.println("Key Concepts:");
            writer.println("1. try-catch blocks handle exceptions gracefully");
            writer.println("2. Multiple catch blocks handle different exception types");
            writer.println("3. finally block ensures resource cleanup");
            writer.println("4. Custom exceptions enable domain-specific error handling");
            writer.println();
            writer.println("Benefits:");
            writer.println("- Prevents program crashes");
            writer.println("- Provides meaningful error messages");
            writer.println("- Ensures proper resource management");
            writer.println("- Makes code more robust and maintainable");
            
            System.out.println("Successfully wrote educational content to file.");
            
        } catch (FileNotFoundException e) {
            System.out.println("ERROR: Could not create file - " + e.getMessage());
            
        } finally {
            // Ensure file is closed
            if (writer != null) {
                writer.close();
                System.out.println("File closed successfully.");
            }
        }
    }
    
    /**
     * EXAMPLE 3: Demonstrating exception flow in file operations
     * 
     * IMPORTANT:
     * This example shows what happens when:
     * 1. File is created successfully (first case)
     * 2. Finally block executes in both success and failure cases
     */
    public static void fileErrorExample() {
        PrintWriter writer = null;
        boolean simulateError = true;  // Change to false to test success case
        
        try {
            // Create output file
            writer = new PrintWriter("W13E04_Example3.txt");
            
            System.out.println("File opened successfully!");
            
            // This demonstrates exception handling pattern
            if (simulateError) {
                // Simulate an error condition
                // In real code, this might be a read error, invalid data, etc.
                throw new FileNotFoundException("Simulated error: Cannot write to file");
            }
            
            // This line will not execute if exception is thrown above
            writer.println("This line only executes if no error occurs.");
            System.out.println("Data written successfully!");
            
        } catch (FileNotFoundException e) {
            System.out.println("Caught exception: " + e.getMessage());
            System.out.println("Error type: " + e.getClass().getSimpleName());
            
        } finally {
            // This ALWAYS executes, demonstrating the guaranteed cleanup
            System.out.println("Executing finally block - cleanup phase");
            
            if (writer != null) {
                writer.close();
                System.out.println("File closed during finally block execution.");
            }
        }
        
        System.out.println("Exception handling complete, program continues.");
    }
    
    /**
     * BONUS: Real-world example of writing student records to a file
     * 
     * PATTERN:
     * This method demonstrates how exception handling is used in
     * practical applications for data persistence
     * 
     * You could call this from main:
     * writeStudentRecords();
     */
    public static void writeStudentRecords() {
        PrintWriter writer = null;
        
        try {
            // Create output file for student records
            writer = new PrintWriter("W13E04_StudentRecords.txt");
            
            // Sample student data
            String[] names = {"Alice", "Bob", "Charlie"};
            int[] ids = {1001, 1002, 1003};
            double[] gpa = {3.8, 3.5, 3.9};
            
            // Write header
            writer.println("=== Student Records ===");
            writer.println("ID\tName\t\tGPA");
            writer.println("---\t---\t\t---");
            
            // Write student records
            for (int i = 0; i < names.length; i++) {
                writer.printf("%d\t%s\t\t%.2f%n", ids[i], names[i], gpa[i]);
            }
            
            System.out.println("Student records saved to file.");
            
        } catch (FileNotFoundException e) {
            System.out.println("Error saving student records: " + e.getMessage());
            
        } finally {
            if (writer != null) {
                writer.close();
                System.out.println("Resources released.");
            }
        }
    }
}
