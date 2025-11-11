package W05;
import java.util.Scanner;
/**
 *
 * @author tanjunyong
 */
public class W05E02A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        do{
            System.out.print("Please enter integer : ");
            int num = input.nextInt();
            sum += num;
        }while (sum!=0);
        System.out.println("Sum: "+sum);
    }
    
}
