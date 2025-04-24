import java.util.Scanner;

public class W04E02 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       
       int[] numbers = new int[10];
       
       System.out.println("Enter 10 numbers:");
       
       for (int i = 0; i < 10; i++) {
       
        System.out.print("Number " + (i + 1) + ": ");
        numbers[i] = scanner.nextInt();
            
        }
            
        System.out.println("You entered:");
            
        for (int number : numbers) {
            System.out.println(number);
        }
        }
    }

