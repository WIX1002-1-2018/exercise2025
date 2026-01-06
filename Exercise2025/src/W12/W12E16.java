package W12;

import java.util.Arrays;

/**
 * W12E16 - Clone Method and Comparable Interface
 *
 * CONTEXT: Capstone exercise on object copying and comparison.
 * LEARNING OBJECTIVES:
 * - Understand shallow vs. deep copy
 * - Implement the clone() method for deep copying objects
 * - Implement Comparable<T> interface for natural ordering
 * - Use Collections.sort() with compareTo() for sorting
 * - Demonstrate why proper cloning and comparison are important
 */
public class W12E16 {

    public static void main(String[] args) {
        System.out.println("=== CLONE METHOD: Shallow vs. Deep Copy ===\n");
        
        // Create original student
        StudentE16 original = new StudentE16("Alice", 3.8, new int[] { 85, 90, 88 });
        System.out.println("Original Student: " + original);
        System.out.println("  Scores: " + Arrays.toString(original.scores));
        
        // Assignment: Reference copy (shallow copy)
        StudentE16 shallowCopy = original;
        
        System.out.println("\nAfter assignment (reference copy):");
        System.out.println("  shallowCopy == original: " + (shallowCopy == original) + " (same object)");
        
        // Modify scores through shallow copy
        shallowCopy.scores[0] = 95;
        System.out.println("  Changed shallowCopy.scores[0] to 95");
        System.out.println("  Original scores: " + Arrays.toString(original.scores));
        System.out.println("  PROBLEM: Original was modified! (Shallow copy doesn't protect)");
        
        // Create a proper deep copy using clone()
        StudentE16 original2 = new StudentE16("Bob", 3.9, new int[] { 92, 94, 96 });
        System.out.println("\n\nOriginal Student: " + original2);
        System.out.println("  Scores: " + Arrays.toString(original2.scores));
        
        StudentE16 deepCopy = null;
        try {
            deepCopy = (StudentE16) original2.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Clone not supported!");
        }
        
        System.out.println("\nAfter cloning (deep copy):");
        System.out.println("  deepCopy == original2: " + (deepCopy == original2) + " (different objects)");
        
        // Modify scores through deep copy
        deepCopy.scores[0] = 100;
        System.out.println("  Changed deepCopy.scores[0] to 100");
        System.out.println("  Original scores: " + Arrays.toString(original2.scores));
        System.out.println("  Cloned scores: " + Arrays.toString(deepCopy.scores));
        System.out.println("  SUCCESS: Original is safe! (Deep copy protects)");
        
        System.out.println("\n\n=== COMPARABLE INTERFACE: Sorting by Natural Order ===\n");
        
        // Create an array of students with different GPAs
        StudentE16[] students = {
            new StudentE16("Charlie", 3.5, new int[] { 80, 82, 81 }),
            new StudentE16("Diana", 3.9, new int[] { 95, 97, 94 }),
            new StudentE16("Eve", 3.2, new int[] { 78, 75, 80 }),
            new StudentE16("Frank", 3.7, new int[] { 88, 90, 87 })
        };
        
        System.out.println("Students before sorting:");
        for (StudentE16 s : students) {
            System.out.println("  " + s.getName() + " - GPA: " + s.getGpa());
        }
        
        // Sort using the natural order defined in compareTo()
        // Arrays.sort() uses compareTo() from Comparable interface
        Arrays.sort(students);
        
        System.out.println("\nStudents after sorting (by GPA, highest first):");
        for (StudentE16 s : students) {
            System.out.println("  " + s.getName() + " - GPA: " + s.getGpa());
        }
        
        System.out.println("\n\n=== PRACTICAL EXAMPLE: Student Ranking System ===\n");
        
        // Create new students for ranking
        StudentE16[] ranking = {
            new StudentE16("Student A", 3.6, new int[] { 85, 87, 86 }),
            new StudentE16("Student B", 3.6, new int[] { 86, 88, 87 }),  // Same GPA as A
            new StudentE16("Student C", 3.4, new int[] { 82, 84, 83 })
        };
        
        System.out.println("Ranking before sorting:");
        for (int i = 0; i < ranking.length; i++) {
            System.out.println("  #" + (i + 1) + ": " + ranking[i].getName() + 
                             " - GPA: " + ranking[i].getGpa() + ", Avg Score: " + ranking[i].getAverageScore());
        }
        
        Arrays.sort(ranking);
        
        System.out.println("\nRanking after sorting (primary: GPA desc, secondary: avg score desc):");
        for (int i = 0; i < ranking.length; i++) {
            System.out.println("  #" + (i + 1) + ": " + ranking[i].getName() + 
                             " - GPA: " + ranking[i].getGpa() + ", Avg Score: " + ranking[i].getAverageScore());
        }
        
        System.out.println("\n=== KEY POINTS ===\n");
        System.out.println("Clone Method:");
        System.out.println("  - Reference assignment (=) creates shallow copy (same object)");
        System.out.println("  - clone() method creates deep copy (independent object)");
        System.out.println("  - Must implement Cloneable interface");
        System.out.println("  - Must override clone() and handle CloneNotSupportedException");
        System.out.println("  - Deep copy protects original data from modification");
        
        System.out.println("\nComparable Interface:");
        System.out.println("  - Implements Comparable<StudentE16>");
        System.out.println("  - Defines natural ordering via compareTo()");
        System.out.println("  - Returns: negative (this < other), 0 (equal), positive (this > other)");
        System.out.println("  - Enables use with Arrays.sort() and Collections.sort()");
        System.out.println("  - Primary sort: GPA descending");
        System.out.println("  - Secondary sort: Average score descending (tiebreaker)");
    }
}

// ============================================================================
// STUDENT CLASS WITH CLONE AND COMPARABLE
// ============================================================================

// Implements Cloneable to allow cloning
// Implements Comparable to allow sorting
class StudentE16 implements Cloneable, Comparable<StudentE16> {
    private String name;
    private double gpa;
    int[] scores;  // Package-scoped for demo purposes: requires deep copy
    
    public StudentE16(String name, double gpa, int[] scores) {
        this.name = name;
        this.gpa = gpa;
        this.scores = scores.clone();  // Deep copy in constructor
    }
    
    public String getName() {
        return name;
    }
    
    public double getGpa() {
        return gpa;
    }
    
    public int[] getScores() {
        return scores.clone();  // Return clone to prevent external modification
    }
    
    public double getAverageScore() {
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        return (double) sum / scores.length;
    }
    
    @Override
    public String toString() {
        return name + " (GPA: " + gpa + ", Scores: " + Arrays.toString(scores) + ")";
    }
    
    // ========== CLONE METHOD ==========
    @Override
    public Object clone() throws CloneNotSupportedException {
        // Call parent clone for primitive fields
        StudentE16 cloned = (StudentE16) super.clone();
        
        // Deep copy the scores array (important for mutable fields!)
        cloned.scores = this.scores.clone();
        
        return cloned;
    }
    
    // ========== COMPARABLE INTERFACE ==========
    // Define natural ordering for sorting
    @Override
    public int compareTo(StudentE16 other) {
        // Primary sort: GPA (descending - higher GPA comes first)
        if (this.gpa != other.gpa) {
            // Return negative if this.gpa > other.gpa (descending order)
            return Double.compare(other.gpa, this.gpa);
        }
        
        // Secondary sort: Average score (descending - higher score comes first)
        double thisAvg = this.getAverageScore();
        double otherAvg = other.getAverageScore();
        
        if (thisAvg != otherAvg) {
            return Double.compare(otherAvg, thisAvg);
        }
        
        // Tertiary sort: Name (alphabetical - ascending)
        return this.name.compareTo(other.name);
    }
}
