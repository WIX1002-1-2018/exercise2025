package W05;

import java.util.Scanner;

public class W05E02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        while (true) {
            System.out.print("Enter a number (0 to stop): ");
            int input = scanner.nextInt();
            if (input == 0) {
                break;
            }

            sum += input;

        }

        System.out.println("The total sum is: " + sum);
    }
}
