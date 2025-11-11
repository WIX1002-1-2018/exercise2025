package W05;

import java.util.Scanner;

public class W05E02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int number;
        do {
            System.out.println("Enter a number (0 to stop): ");
            number = scanner.nextInt();
            sum += number;
        } while (number != 0);

        System.out.println("The total sum is: " + sum);
    }
}
