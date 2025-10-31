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
        // Exercise E10: Nested ternary and readable alternatives

        int score = 85;

        // ===== Example 1: Nested ternary to assign a grade =====
        // Not recommended for complex logic because it reduces readability
        String grade = score >= 90 ? "A"
                : score >= 80 ? "B"
                : score >= 70 ? "C"
                : score >= 60 ? "D" : "F";
        System.out.println("Score: " + score + " -> Grade (nested ternary): " + grade);

        // ===== Example 2: The same logic using if-else (more readable) =====
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

        // ===== Example 3: Simple boolean ternary =====
        boolean passed = score >= 60;
        String result = passed ? "Passed" : "Failed";
        System.out.println("Result: " + result);

        // ===== Example 4: Ternary used in method call (compact) =====
        System.out.println("Short message: " + statusMessage(score >= 75 ? 1 : 0));

        // ===== Example 5: Null-check with ternary =====
        Integer maybeNull = null;
        String safe = maybeNull != null ? maybeNull.toString() : "No value";
        System.out.println("maybeNull -> " + safe);

        // Recommendation: use ternary for short, simple choices. Prefer if-else
        // when the logic is multi-branch or needs clearer structure.
    }

    private static String statusMessage(int code) {
        return code == 1 ? "Excellent" : "Keep trying";
    }

}
