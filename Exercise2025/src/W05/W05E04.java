package W05;
import java.util.Scanner;
public class W05E04 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num;
    int count = 0;
    do{
        System.out.print("Enter a positive number: ");
        num = sc.nextInt();
        count++;
    }while(num <= 0);
    System.out.println("You entered: " + num);
    System.out.println("You have entered "+ count + " times.");
    sc.close(); 
}
}
