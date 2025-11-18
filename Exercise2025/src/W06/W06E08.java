package W06;

import java.util.Random;

public class W06E08 {

    public static void main(String[] args) {
        Random r = new Random();
        int[] nums = new int[20];
        for (int i = 0; i < 20; i++) {
            nums[i] = r.nextInt(100);
        }
        System.out.println("Items in the array: ");
        for (int i = 0; i < 20; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();

        //Bubble Sort
        int temp;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        System.out.println("This is sorted array (ascending order): ");
        for (int i = 0; i < 20; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();

        //get the MAX, MIN
        int MAX, MIN;
        MAX = nums[nums.length - 1];
        MIN = nums[0];
        System.out.println("This is MAX: " + MAX);
        System.out.println("This is MIN: " + MIN);

        //get the sum value
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        System.out.println("Sum value of array items: " + sum);
    }
}

//generate random numbers and assign it to array
//sort the array
//get the min,max
//calculate the sum
/**
 * W06E08 - Array Statistics with Sorting
 * Demonstrates: Generating random array, sorting, and calculating statistics
 * 
 * Key Concepts:
 * - Random number generation into array
 * - Bubble sort implementation
 * - Finding minimum (first element after sort)
 * - Finding maximum (last element after sort)
 * - Calculating sum using accumulator
 * - Enhanced for-each loop
 * 
 * @author Tey Yong Zhun
 */
public class W06E08 {
    public static void main(String[] args) {
        Random g = new Random();
        int [] number = new int[20];
        int sum = 0;
        
        // Generate random numbers and calculate sum
        for(int i = 0; i < number.length; i++){
            number[i] = g.nextInt(100);
            sum += number[i];  // Accumulate sum
        }
            
        // Display original array
        for(int element : number){
            System.out.print(element + " ");
        }
        
        // Bubble sort method - sort in ascending order
        for(int i = 0; i < number.length - 1; i++){
            for(int j = 0; j < number.length - 1; j++)
            if(number[j] > number [j+1]){
                int temp = number[j];
                number[j] = number[j+1];
                number[j+1] = temp;
            }
        }
        
        System.out.println();
        System.out.println("Bubble Sort");
        for(int elementBS : number){
            System.out.print(elementBS + " ");
        }
        
        System.out.println();
        // After sorting, first element is minimum
        System.out.println("Min: " + number[0]);
        // After sorting, last element is maximum
        System.out.println("Max: "+ number[number.length -1]);
        System.out.println("Sum of number: " + sum);
    
    }
}
