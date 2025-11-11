package W05;
import java.util.Scanner;

public class W05E05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many number all you enter? :");
        int count=input.nextInt();
        int evenCount=0, oddCount=0, currentCount,currentNum,sumOdd=0,sumEven=0;
        for(currentCount=1;currentCount<=count;currentCount++){
            System.out.print("Enter number "+currentCount+" : ");
            currentNum=input.nextInt();
            if(currentNum%2==0){
                evenCount++;
                sumEven += currentNum;
            }else{
                oddCount++;
                sumEven += currentNum;
            }
        }
        System.out.println("Total even number : " + evenCount);
        System.out.println("Total odd number : " + oddCount);       
        System.out.println("Sum of even number : " + sumEven);
        System.out.println("Sum of odd number : " + sumOdd);
    }
    
}
