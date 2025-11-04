/*
 * Example companion for W03 exercises: extend the discussion on the ternary operator
 * and show readable alternatives.
 */
package W03;

/**
 * Demonstrates nested ternary usage, readable if-else equivalent, and small ternary examples.
 * Author: pensyarah
 */
public class W03E10 {

    public static void main(String[] args) {
        // Exercise 10: Nested ternary operators and readable alternatives
        // This demonstrates when to use nested ternary and when to prefer if-else

        // Initialize a score variable
        int score = 85;

        // ===== Example 1: Nested ternary to assign a grade =====
        // Nested ternary: Multiple ternary operators chained together
        // Syntax: condition1 ? value1 : condition2 ? value2 : condition3 ? value3 : value4
        // This assigns grades based on score ranges: A (90+), B (80+), C (70+), D (60+), F (<60)
        // WARNING: Not recommended for complex logic because it reduces readability
        String grade = score >= 90 ? "A"
                : score >= 80 ? "B"
                : score >= 70 ? "C"
                : score >= 60 ? "D" : "F";
        System.out.println("Score: " + score + " -> Grade (nested ternary): " + grade);

        // ===== Example 2: The same logic using if-else (more readable) =====
        // This is the PREFERRED way to write the same logic
        // Much easier to read and understand, especially for complex conditions
        String gradeIfElse;
        if (score >= 90) {
            gradeIfElse = "A";
        } else if (score >= 80) {
            gradeIfElse = "B";
        } else if (score >= 70) {
            gradeIfElse = "C";
        } else if (score >= 60) {
            gradeIfElse = "D";
        } else {
            gradeIfElse = "F";
        }
        System.out.println("Grade (if-else): " + gradeIfElse);

        // ===== Example 3: Simple boolean ternary (GOOD USE CASE) =====
        // Ternary is appropriate for simple, two-way choices
        // This is readable and concise
        boolean passed = score >= 60;
        String result = passed ? "Passed" : "Failed";
        System.out.println("Result: " + result);

        // ===== Example 4: Ternary used in method call (compact) =====
        // Ternary can be used directly as a method argument
        // This is concise and still readable for simple conditions
        System.out.println("Short message: " + statusMessage(score >= 75 ? 1 : 0));

        // ===== Example 5: Null-check with ternary (GOOD USE CASE) =====
        // Ternary is useful for null-checking and providing default values
        // This is a common pattern: check if value is not null, use it; otherwise use default
        Integer maybeNull = null;
        String safe = maybeNull != null ? maybeNull.toString() : "No value";
        System.out.println("maybeNull -> " + safe);

        // ===== BEST PRACTICES =====
        // When to use ternary operator:
        // 1. Simple, two-way choices (condition ? trueValue : falseValue)
        // 2. Null-checking and providing defaults
        // 3. Simple assignments in method calls
        // 4. When the logic is short and immediately understandable
        //
        // When to use if-else instead:
        // 1. Multiple branches (more than 2 options)
        // 2. Complex conditions that need explanation
        // 3. When each branch has multiple statements
        // 4. When readability is more important than compactness
        //
        // AVOID nested ternary operators - they reduce code readability!
    }

    private static String statusMessage(int code) {
        return code == 1 ? "Excellent" : "Keep trying";
    }

}
