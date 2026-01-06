package W08;

import java.util.Scanner;

/**
 * W08E07 - Movie Theater Seating System
 *
 * SCENARIO: Display theater seating, allow users to book seats, track availability.
 * COMBINES: W06 (2D arrays), W04 (nested loops), W03 (conditionals),
 *           W05 (input validation), W07 (methods), display formatting
 *
 * LEARNING OBJECTIVES:
 * - Use 2D arrays to represent spatial data (theater grid)
 * - Use characters to represent state (booked vs available)
 * - Validate input across 2 dimensions
 * - Display formatted 2D grids
 * - Use helper methods to organize complex logic
 */
public class W08E07 {

    static final int ROWS = 5;
    static final int COLS = 10;
    static final char AVAILABLE = 'O';
    static final char BOOKED = 'X';

    static char[][] seats = new char[ROWS][COLS];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Initialize all seats as available
        initializeSeats();

        System.out.println("=== Movie Theater Seating System ===\n");

        boolean running = true;
        int totalBooked = 0;

        while (running) {
            displaySeating();
            System.out.print("\nBook seat (row col), View stats, or Quit? (B/V/Q): ");
            String choice = sc.nextLine().trim().toUpperCase();

            switch (choice) {
                case "B":
                    if (bookSeat(sc)) {
                        totalBooked++;
                    }
                    break;
                case "V":
                    displayStats();
                    break;
                case "Q":
                    running = false;
                    System.out.println("Thank you for using Theater Seating System!");
                    break;
                default:
                    System.out.println("Invalid choice.\n");
            }
        }

        sc.close();
    }

    static void initializeSeats() {
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                seats[i][j] = AVAILABLE;
            }
        }
    }

    static void displaySeating() {
        System.out.println("\n=== Theater Layout (O = Available, X = Booked) ===");
        System.out.print("     ");
        for (int j = 0; j < COLS; j++) {
            System.out.print(j + " ");
        }
        System.out.println();
        System.out.println("   " + "-".repeat(COLS * 2));

        for (int i = 0; i < ROWS; i++) {
            System.out.print("Row " + i + "| ");
            for (int j = 0; j < COLS; j++) {
                System.out.print(seats[i][j] + " ");
            }
            System.out.println();
        }
    }

    static boolean bookSeat(Scanner sc) {
        System.out.print("Enter row (0-" + (ROWS - 1) + "): ");
        if (!sc.hasNextInt()) {
            System.out.println("Invalid row.\n");
            sc.nextLine();
            return false;
        }
        int row = sc.nextInt();

        System.out.print("Enter column (0-" + (COLS - 1) + "): ");
        if (!sc.hasNextInt()) {
            System.out.println("Invalid column.\n");
            sc.nextLine();
            return false;
        }
        int col = sc.nextInt();
        sc.nextLine(); // consume newline

        // Validate coordinates
        if (row < 0 || row >= ROWS || col < 0 || col >= COLS) {
            System.out.println("Seat out of range.\n");
            return false;
        }

        // Check availability
        if (seats[row][col] == BOOKED) {
            System.out.println("Seat already booked!\n");
            return false;
        }

        // Book the seat
        seats[row][col] = BOOKED;
        System.out.println("Seat Row " + row + " Col " + col + " booked successfully!\n");
        return true;
    }

    static void displayStats() {
        int available = 0;
        int booked = 0;

        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                if (seats[i][j] == AVAILABLE) {
                    available++;
                } else {
                    booked++;
                }
            }
        }

        int total = ROWS * COLS;
        double occupancyPercent = ((double) booked / total) * 100;

        System.out.println("\n=== Occupancy Stats ===");
        System.out.println("Total seats: " + total);
        System.out.println("Booked: " + booked);
        System.out.println("Available: " + available);
        System.out.println("Occupancy: " + String.format("%.1f", occupancyPercent) + "%\n");
    }
}
