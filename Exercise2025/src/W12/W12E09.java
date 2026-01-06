package W12;

import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * W12E09 - Exception Handling with Input and Output
 *
 * CONTEXT: Continuation of W10/W11 (classes, subclasses, inheritance, polymorphism).
 * LEARNING OBJECTIVES:
 * - Catch input errors while scanning tokens
 * - Use overriding and overloading inside a small processor hierarchy
 * - Persist results using PrintWriter
 */
public class W12E09 {

    public static void main(String[] args) {
        // Input data: mix of integers and invalid tokens
        String data = "10\nabc\n5";
        
        // Create processor object (using subclass type)
        NumberProcessorE09 processor = new EvenOddProcessorE09();

        // Try-with-resources: automatically closes Scanner and PrintWriter
        try (Scanner scanner = new Scanner(data);
             PrintWriter writer = new PrintWriter("W12E09_report.txt")) {
            
            // Process each token in the input
            while (scanner.hasNext()) {
                try {
                    // Try to read an integer
                    int value = scanner.nextInt();
                    
                    // Call single-parameter process() - uses overridden version
                    writer.println(processor.process(value));
                    
                    // Call overloaded process(int, int) with multiplier
                    writer.println(processor.process(value, 3));
                    
                } catch (InputMismatchException badToken) {
                    // Handle non-integer tokens (exception handling)
                    String skipped = scanner.next();
                    writer.println("Skipped non-integer token: " + skipped);
                }
            }
            System.out.println("Report written to W12E09_report.txt");
            
        } catch (Exception e) {
            // Handle file I/O errors
            System.out.println("Could not generate report: " + e.getMessage());
        }
    }
}

// Base class for processing numbers
class NumberProcessorE09 {
    // Basic process method - can be overridden by subclasses
    String process(int value) {
        return "Number: " + value;
    }

    // Overloaded version: includes a multiplier parameter
    // Demonstrates method overloading: same name, different parameters
    String process(int value, int multiplier) {
        // Reuse single-parameter process() and append multiplication result
        // If called on subclass, the overridden process() will be used (polymorphism)
        return process(value) + ", multiplied: " + (value * multiplier);
    }
}

// Concrete subclass that determines if number is even or odd
class EvenOddProcessorE09 extends NumberProcessorE09 {
    // OVERRIDES process() to add even/odd classification
    @Override
    String process(int value) {
        String type = value % 2 == 0 ? "even" : "odd";
        return "Number: " + value + " is " + type;
    }
}
