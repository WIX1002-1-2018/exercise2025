package W05;

import java.util.Scanner;

public class W05E02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int sum = 0;
        while (true) {
            System.out.print("Enter a number: (0 to quit): ");
            num = sc.nextInt();
            if (num == 0) {
                break;
            }
            sum += num;

        }
        System.out.println("The total sum is: " + sum);
    }
}