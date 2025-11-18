package W06;

import java.util.Random;
class W06E07 {
    public static void main(String[] args) {
        Random r = new Random();
        int [] nums = new int[20];
        for (int index = 0; index < nums.length; index++) {
            nums[index] = r.nextInt(100);
            System.out.print(nums[index] + " ");
        }
        for (int pass = 1; pass < nums.length; pass++ ) 
		for ( int i = 0; i < nums.length - 1; i++) 
			if (nums[ i ] > nums[ i + 1 ])  {
               		int temp = nums[i];        
				nums[i] = nums[i+1];  
				nums[i+1] = temp;
			}
		System.out.println("\n" + "Bubble Sort (Asc)");
		for (int index = 0; index < nums.length; index++) {
                        System.out.print(nums[index] + " ");
                }
                
                System.out.println("\n" + "Bubble Sort (Desc");
		for (int index = nums.length-1; index >= 0; index--) {
                        System.out.print(nums[index] + " ");
                }
    }
}