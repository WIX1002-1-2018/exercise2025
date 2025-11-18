package W06;
import java.util.Array;
import java.util.Scanner;
import java.util.Random;

//i think this code isnt working but ill save first

public class W06E03;
  //generate array of 20 num 
  public static void main(String[] args){
  int size = 20; int j =0;
  int[] num = new int [size];
  for ( int i = 0; i < num.length; i++ ) {
    Random random = new Random();
    int randomNum = random.nextInt(100);
    num[j] = randomNum;
    j + 1;
    System.out.println("the array is: " + randomNum + "\t"); 
  }
  binarysearch();
  }

  //func to binary search
  public static int binarysearch() {
    System.out.println("Enter number to search: ");
    Scanner scanner = new scanner(System.in);
    int goal = scanner.nextInt();

    int low = 0;
    int high = num.length-1;
    int middle;

    while (low <= high) {
      middle = (low + high)/2;
      if (goal == name[middle]) {
        return middle; }
      else if (goal < num[middle]) {
        high = middle - 1; }
      else { low = middle + 1; }
    }
    System.out.println("Found in position " + middle)
  }
    
        
    
    
  
    
    
