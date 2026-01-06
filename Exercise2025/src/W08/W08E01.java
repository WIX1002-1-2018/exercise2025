package W08;

import java.util.Scanner;
import java.util.Locale;

/**
 * W08E01 - Student Grade Management System
 *
 * SCENARIO: Read student names and grades, calculate statistics, display results.
 * COMBINES: W02 (variables), W03 (conditionals), W05 (input validation),
 *           W06 (arrays), String operations
 *
 * LEARNING OBJECTIVES:
 * - Use arrays to store related data (names and grades)
 * - Validate input before processing
 * - Calculate statistics (average, min, max)
 * - Use conditionals to classify grades (A, B, C, etc.)
 */
public class W08E01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        // Arrays to store student data
        String[] names = new String[5];
        double[] grades = new double[5];
        int count = 0;

        // Input validation: read exactly 5 students
        System.out.println("Enter 5 student records (name and grade):");
        while (count < 5) {
            System.out.print("Student " + (count + 1) + " - Name: ");
            String name = sc.nextLine().trim();

            // Validate name is not empty
            if (name.isEmpty()) {
                System.out.println("Name cannot be empty. Try again.");
                continue;
            }

            System.out.print("Grade (0-100): ");
            // Validate grade input
            if (!sc.hasNextDouble()) {
                System.out.println("Invalid grade. Please enter a number.");
                sc.nextLine(); // consume invalid input
                continue;
            }

            double grade = sc.nextDouble();
            sc.nextLine(); // consume newline

            // Validate grade range
            if (grade < 0 || grade > 100) {
                System.out.println("Grade must be between 0-100. Try again.");
                continue;
            }

            names[count] = name;
            grades[count] = grade;
            count++;
        }

        // Display results with grade classification
        System.out.println("\n=== Grade Report ===");
        double sum = 0;
        double min = grades[0];
        double max = grades[0];

        for (int i = 0; i < count; i++) {
            char letterGrade = classifyGrade(grades[i]);
            System.out.println(names[i] + ": " + String.format(Locale.US, "%.1f", grades[i])
                    + " (" + letterGrade + ")");

            sum += grades[i];
            if (grades[i] < min) min = grades[i];
            if (grades[i] > max) max = grades[i];
        }

        // Display statistics
        double average = sum / count;
        System.out.println("\nStatistics:");
        System.out.println("Average: " + String.format(Locale.US, "%.2f", average));
        System.out.println("Highest: " + String.format(Locale.US, "%.1f", max));
        System.out.println("Lowest: " + String.format(Locale.US, "%.1f", min));

        sc.close();
    }

    // Helper method: convert numerical grade to letter grade
    static char classifyGrade(double grade) {
        if (grade >= 90) return 'A';
        else if (grade >= 80) return 'B';
        else if (grade >= 70) return 'C';
        else if (grade >= 60) return 'D';
        else return 'F';
    }
}
