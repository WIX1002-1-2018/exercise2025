package W06;

import java.util.Random;

/**
 * W06E05 - Random Array Generation and Counting
 * Demonstrates: Filling array with random values and counting occurrences
 * 
 * Key Concepts:
 * - Using Random.nextBoolean() for binary choices
 * - Ternary operator for conditional assignment
 * - Enhanced for-each loop for array traversal
 * - Counting specific values in an array
 * 
 * @author hafidzmrizky
 */
public class W06E05 {
    
    public static void main(String[] args) {
        Random random = new Random();
        
        // Create array to store 100 student genders
        char[] students = new char[100];
        
        // Fill array with random 'M' or 'F' values
        for (int i = 0; i < students.length; i++) {
            students[i] = random.nextBoolean() ? 'M' : 'F';
        }

        // Count female students
        int femaleCount = 0;
        
        // Enhanced for-each loop to iterate through array
        for (char student : students) 
            if (student == 'F') {
                femaleCount++;
            }
        
        System.out.println("female students count: " + femaleCount);
    }
    
}
