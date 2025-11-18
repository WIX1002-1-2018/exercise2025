package W06;

import java.util.Random;

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
