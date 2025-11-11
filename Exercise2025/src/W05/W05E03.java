package W05;

import java.util.Scanner;

public class W05E03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = "yes";
        while (true) {
            System.out.print("Do you want to continue? (yes/no): ");
            input = sc.nextLine();
            if (input.equals("no")) {
                break;
            } else if (input.equals("yes")) {
                // continue the loop
            } else {
                System.out.println("Invalid input. Please enter 'yes' or 'no'.");
            }
        }
        System.out.println("Program ended.");
    }
}