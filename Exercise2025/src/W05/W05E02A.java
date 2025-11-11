package W05;

import java.util.Scanner;

public class W05E02A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int sum = 0;
        do {
            System.out.println("Enter a number: (0 to quit): ");
            num = sc.nextInt();
            if (num != 0) {
                sum += num;
            }
        } while (num != 0);
        System.out.println("The total sum is: " + sum);
    }
}