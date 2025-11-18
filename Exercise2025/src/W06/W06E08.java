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
