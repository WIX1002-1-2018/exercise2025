package W08;

import java.util.Scanner;
import java.util.Locale;

/**
 * W08E05 - Number Guessing Game
 *
 * SCENARIO: Computer picks a random number, player guesses with feedback.
 * COMBINES: W02 (variables, Random), W03 (conditionals), W04 (loops),
 *           W05 (input validation), escape sequences, String formatting
 *
 * LEARNING OBJECTIVES:
 * - Use Random class to generate unpredictable values
 * - Implement sentinel-based game loop
 * - Provide conditional feedback based on guesses
 * - Track game state and statistics
 * - Validate and convert user input
 */
public class W08E05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.println("=== Number Guessing Game ===\n");

        boolean playAgain = true;
        int totalGames = 0;
        int totalGuesses = 0;

        while (playAgain) {
            int secret = (int) (Math.random() * 100) + 1; // 1-100
            int guess = -1;
            int guessCount = 0;

            System.out.println("I'm thinking of a number between 1 and 100.");
            System.out.println("Type 'quit' to exit at any time.\n");

            while (guess != secret) {
                System.out.print("Enter your guess: ");

                if (!sc.hasNextInt()) {
                    String input = sc.nextLine();
                    if (input.equalsIgnoreCase("quit")) {
                        System.out.println("The number was " + secret + ".");
                        break;
                    }
                    System.out.println("Please enter a valid number (1-100) or 'quit'.\n");
                    continue;
                }

                guess = sc.nextInt();
                sc.nextLine(); // consume newline
                guessCount++;

                if (guess < 1 || guess > 100) {
                    System.out.println("Number must be between 1 and 100.\n");
                    continue;
                }

                if (guess < secret) {
                    System.out.println("Too low. Try again.\n");
                } else if (guess > secret) {
                    System.out.println("Too high. Try again.\n");
                } else {
                    System.out.println("\n*** YOU WON! ***");
                    System.out.println("The number was " + secret + ".");
                    System.out.println("You guessed it in " + guessCount + " attempts.\n");
                    totalGuesses += guessCount;
                    break;
                }
            }

            totalGames++;

            System.out.print("Play again? (yes/no): ");
            String response = sc.nextLine().toLowerCase();
            playAgain = response.startsWith("y");
            System.out.println();
        }

        // Final statistics
        if (totalGames > 0) {
            System.out.println("=== Game Statistics ===");
            System.out.println("Games played: " + totalGames);
            System.out.println("Total guesses: " + totalGuesses);
            double avgGuesses = (double) totalGuesses / totalGames;
            System.out.println("Average guesses per game: " + 
                    String.format(Locale.US, "%.1f", avgGuesses));
        }

        System.out.println("Thanks for playing!");
        sc.close();
    }
}
