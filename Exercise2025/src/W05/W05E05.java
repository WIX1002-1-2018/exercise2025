package W05;

import java.util.Scanner;

public class W05E05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many number will you enter?: ");
        int i = scanner.nextInt();
        int ecounter = 0;
        int esum = 0;
        int ocounter = 0;
        int osum = 0;
        for (int j = 0; j < i; j++) {
            System.out.printf("Enter number %d: ", j + 1);
            int num = scanner.nextInt();
            if (num % 2 == 0) {
                ecounter += 1;
                esum += num;
            } else if (num % 2 != 0) {
                ocounter += 1;
                osum += num;
            }
        }
        System.out.println("Total even number: " + ecounter);
        System.out.println("Sum of even numbers: " + esum);
        System.out.println("Total odd number: " + ocounter);
        System.out.println("Sum of odd numbers: " + osum);

    }
}