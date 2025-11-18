package W06;

import java.util.Random;

/**
 * W06E07 - Bubble Sort Algorithm
 * Demonstrates: Sorting array elements in ascending and descending order
 * 
 * Key Concepts:
 * - Bubble sort algorithm implementation
 * - Nested loops for comparison
 * - Swapping elements using temporary variable
 * - Displaying array in different orders
 * 
 * Algorithm:
 * 1. Generate 20 random numbers (0-99)
 * 2. Compare adjacent elements
 * 3. Swap if left > right (ascending order)
 * 4. Repeat until array is sorted
 * 5. Display sorted array (ascending and descending)
 * 
 * @author Yaseen Ayatullah Khan
 * @modified pensyarah
 */
class W06E07 {
    public static void main(String[] args) {
        Random r = new Random();
        int [] nums = new int[20];
        
        // Generate and display random numbers
        for (int index = 0; index < nums.length; index++) {
            nums[index] = r.nextInt(100);
            System.out.print(nums[index] + " ");
        }
        
        // Bubble Sort Algorithm
        for (int pass = 1; pass < nums.length; pass++ ) 
		for ( int i = 0; i < nums.length - 1; i++) 
			if (nums[ i ] > nums[ i + 1 ])  {
				// Swap elements if left is greater than right
               		int temp = nums[i];        
				nums[i] = nums[i+1];  
				nums[i+1] = temp;
			}
			
		// Display sorted array in ascending order
		System.out.println("\n" + "Bubble Sort (Asc)");
		for (int index = 0; index < nums.length; index++) {
                        System.out.print(nums[index] + " ");
                }
                
                // Display sorted array in descending order
                System.out.println("\n" + "Bubble Sort (Desc");
		for (int index = nums.length-1; index >= 0; index--) {
                        System.out.print(nums[index] + " ");
                }
    }
}