package W05;

import java.util.Scanner;

public class W05E08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many scores will you enter?: ");
        int n = scanner.nextInt();

        // Initialize min to the largest possible value and max to the smallest
        int minScore = Integer.MAX_VALUE;
        int maxScore = Integer.MIN_VALUE;

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter score " + i + ": ");
            int score = scanner.nextInt();

            // Flow Control: The IF statement validates the score
            if (score >= 0 && score <= 100000) {
                // Only update min/max if the score is valid
                if (score > maxScore) {
                    maxScore = score;
                }
                if (score < minScore) {
                    minScore = score;
                }
            } else {
                System.out.println("Invalid score. Ignoring.");
            }
        }

        System.out.println("Highest Valid Score: " + maxScore);
        System.out.println("Lowest Valid Score: " + minScore);
        scanner.close();
    }
}
