package W05;

import java.util.Scanner;

public class W05E05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, number;

        int even = 0;
        int odd = 0;

        System.out.print("How many numbers will you enter?: ");
        num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            ;
            System.out.print("Enter number " + i + " : ");
            number = sc.nextInt();

            if (number % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("Total even numbers: " + even);
        System.out.println("Total odd numbers: " + odd);
    }
}