package W05;
import java.util.Scanner;

// Class name updated to match the file name: W05E04C
public class W05E04C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a positive number
        System.out.print("Enter a positive number:");
        int a;      // Variable to store user input
        int b = 0;  // Counter for number of inputs

        // Loop until the user enters a positive number
        do {
            a = sc.nextInt(); // Read user input
            if (a <= 0) {
                // If input is not positive, prompt again
                System.out.print("Please enter a positive number:");
            }
            b++; // Increment the counter for each input attempt
        } while (a <= 0);

        // Print the valid positive number entered
        System.out.printf("You entered: %d\n", a);
        // Print how many times the user entered a number
        System.out.printf("You have entered %d times\n", b);
    }
}