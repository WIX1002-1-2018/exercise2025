package W06;

import java.util.Random;

/**
 * W06E05_1 - Compact Gender Counting (Alternative)
 * Demonstrates: More compact approach to random generation and inline counting
 * 
 * Key Concepts:
 * - Using Random.nextInt(2) for binary choice (0 or 1)
 * - Ternary operator for conditional assignment
 * - Counting while generating (inline counting)
 * - Increment operator (++)
 * 
 * Comparison with W06E05:
 * - Uses nextInt(2) instead of nextBoolean()
 * - Counts during generation instead of separate loop
 * - More compact but same result
 * 
 * @author muhdnuqman
 * @modified pensyarah
 */
public class W06E05_1 {
    public static void main(String[] args) {
        char[] randomList = new char[100];
        Random rng = new Random();
        int females = 0;
        
        // Generate random genders and count females in same loop
        for (int i = 0; i < randomList.length; i++){
            randomList[i] = (rng.nextInt(2) == 1) ? 'M' : 'F';
            if (randomList[i] == 'F') females++;  // Count as we generate
        }
        
        System.out.println(females);
    }
}
