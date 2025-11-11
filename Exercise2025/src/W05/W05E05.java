package W05;

import java.util.Scanner;

public class W05E05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many number will you enter?: ");
        int i = scanner.nextInt();
        int ecounter = 0;
        int ocounter = 0;
        for (int j = 0; j < i; j++) {
            System.out.printf("Enter number %d:", j + 1);
            int num = scanner.nextInt();
            if (num % 2 == 0) {
                ecounter += 1;
            } else if (num % 2 != 0) {
                ocounter += 1;
            }
        }
        System.out.println("Total even number: " + ecounter);
        System.out.println("Total odd number: " + ocounter);
    }
}
