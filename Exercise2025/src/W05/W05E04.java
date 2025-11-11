//author:tehjiajie

package W05;
import java.util.Scanner;
public class W05E04 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num;
    int i=0;
    do{
        System.out.print("Enter a positive number: ");
        num = sc.nextInt();
        i++;
    }while(num <= 0);
    System.out.println("You entered: " + num);
    System.out.println("You have entered: " + i + " time(s).");
    sc.close(); 
}
}
