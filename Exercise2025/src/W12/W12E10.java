package W12;

import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

/**
 * W12E10 - Capstone Combination
 *
 * CONTEXT: Continuation of W10/W11 (classes, subclasses, inheritance, polymorphism).
 * LEARNING OBJECTIVES:
 * - Combine inheritance, overriding, and overloading in one workflow
 * - Parse mixed input with Scanner and guard with exception handling
 * - Persist polymorphic results with PrintWriter
 */
public class W12E10 {

    public static void main(String[] args) {
        // Input data: mix of homework (HW) and lab (LAB) tasks with scores
        String dataset = "HW 85\nLAB 70 10\nHW 92";
        CourseTaskE10[] tasks = new CourseTaskE10[10];
        int count = 0;

        // Try-with-resources: automatically closes Scanner and PrintWriter
        try (Scanner scanner = new Scanner(dataset);
             PrintWriter writer = new PrintWriter("W12E10_grades.txt")) {
            
            // Set locale for consistent number parsing (US format)
            scanner.useLocale(Locale.US);

            // Parse input tokens and create task objects
            while (scanner.hasNext() && count < tasks.length) {
                try {
                    String type = scanner.next();
                    
                    // Check for HW task: type and required score
                    if ("HW".equalsIgnoreCase(type) && scanner.hasNextDouble()) {
                        tasks[count++] = new HomeworkTaskE10(scanner.nextDouble());
                    } 
                    // Check for LAB task: type, score, and optional bonus
                    else if ("LAB".equalsIgnoreCase(type) && scanner.hasNextDouble()) {
                        double score = scanner.nextDouble();
                        // If bonus present, use it; otherwise default to 0
                        double bonus = scanner.hasNextDouble() ? scanner.nextDouble() : 0;
                        tasks[count++] = new LabTaskE10(score, bonus);
                    }
                } catch (InputMismatchException e) {
                    // Skip invalid tokens
                    scanner.next();
                }
            }

            // Write polymorphic results to file
            writer.println("Computed Grades:");
            for (int i = 0; i < count; i++) {
                // Call describe() - uses overridden grade() internally
                writer.println(tasks[i].describe());
                // Call overloaded grade(double) with weight factor
                writer.println("Weighted: " + tasks[i].grade(1.1));
            }
            System.out.println("Grades saved to W12E10_grades.txt");
            
        } catch (Exception e) {
            // Handle file I/O or parsing errors
            System.out.println("Failed to process tasks: " + e.getMessage());
        }
    }
}

// Abstract base class for course tasks
abstract class CourseTaskE10 {
    // Abstract method: each subclass MUST provide its own grading logic
    abstract double grade();

    // Overloaded version: applies a weight factor to the grade
    // Demonstrates method overloading: same name, different parameters
    double grade(double weight) {
        // Calls the abstract grade() which resolves to subclass implementation
        return grade() * weight;
    }

    // Describe the task with its grade
    String describe() {
        return getClass().getSimpleName() + " score: " + grade();
    }
}

// Concrete subclass for homework tasks
class HomeworkTaskE10 extends CourseTaskE10 {
    private final double score;

    HomeworkTaskE10(double score) {
        this.score = score;
    }

    // OVERRIDES grade() - returns raw homework score
    @Override
    double grade() {
        return score;
    }
}

// Concrete subclass for lab tasks with bonus points
class LabTaskE10 extends CourseTaskE10 {
    private final double score;
    private final double bonus;

    LabTaskE10(double score, double bonus) {
        this.score = score;
        this.bonus = bonus;
    }

    // OVERRIDES grade() - returns score plus bonus
    @Override
    double grade() {
        return score + bonus;
    }
}
