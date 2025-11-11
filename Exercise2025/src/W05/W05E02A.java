package W05;
import java.util.Scanner;
/**
 *
 * 
 */
public class W05E02A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sum = 0, num = 0;
        do{
            System.out.print("Enter a number : ");
            num = input.nextDouble();
            sum += num;
        }while (num!=0);
        System.out.println("Sum: "+sum);
    }
    
}
