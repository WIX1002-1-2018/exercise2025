package W06;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

//i think this code isnt working but ill save first

public class W06E03;
  //generate array of 20 num 
  public static void main(String[] args){
  int size = 20; int j =0;
  int[] num = new int [size];
  Random random = new Random();
    
  for ( int i = 0; i < num.length; i++ ) {
    num[i] = random.nextInt(100);
  }
    
  System.out.println("the array is: "); 
  System.out.println(Arrays.toString(num)); //practice using this line

  System.out.println("sorted array: "); //practice using this line //critical ogic error: forgot to sort before binary search
  System.out.println(Arrays.toString(num));

  //call function
  int result = binarySearch(num);
  if (result == -1) {System.out.println("Number not found, try another that is in the array");}  
  }

  //func to binary search
  public static int binarysearch(int[] num) { //goal: to get the position of desired num in the array
    System.out.println("Enter number to search: ");
    Scanner scanner = new scanner(System.in);
    int goal = scanner.nextInt();

    int low = 0;
    int high = num.length-1;
    //int middle;

    while (low <= high) {
      int middle = (low + high)/2;
      if (goal == name[middle]) {
        System.out.println("Number found at position " + middle);
        return middle; }
      else if (goal < num[middle]) {
        high = middle - 1; }
      else { low = middle + 1; }
    }
    return -1;
  }
}    
        
    
    
  
    
    
