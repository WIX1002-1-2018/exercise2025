package W09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

/**
 * W09E08 - Combined Demo of W09E01 (write) and W09E02 (read & max)
 * Purpose: In a single class, provide static methods to (1) generate random
 *          integers into a text file and (2) read them back while finding the
 *          maximum value. Mirrors the behaviors of W09E01 and W09E02 but keeps
 *          them together for easier reuse/testing.
 * Key Methods:
 *  - generateIntegersToFile(String path, int count): writes `count` random
 *    integers (0–1000) to the given file, one per line.
 *  - readAndFindMax(String path): prints all integers in the file and reports
 *    the maximum found.
 * Usage: Run main to generate 10 numbers into `integer.txt` then read and show
 *        the list + max.
 *
 * Author: pensyarah
 */
public class W09E08 {

    public static void main(String[] args) {
        String path = "integer.txt";
        generateIntegersToFile(path, 10);
        readAndFindMax(path);
    }

    // Writes `count` random integers (0-1000) to the specified file
    public static void generateIntegersToFile(String path, int count) {
        try (PrintWriter writer = new PrintWriter(new FileOutputStream(path))) {
            Random rand = new Random();
            for (int i = 0; i < count; i++) {
                writer.println(rand.nextInt(1001));
            }
            System.out.println("Generated " + count + " integers to " + path);
        } catch (FileNotFoundException e) {
            System.out.println("Problem creating/writing file: " + e.getMessage());
        }
    }

    // Reads integers from the given file, prints them, and shows the maximum
    public static void readAndFindMax(String path) {
        try (Scanner scan = new Scanner(new FileInputStream(path))) {
            System.out.print("The list : ");
            int max = Integer.MIN_VALUE;
            boolean any = false;
            while (scan.hasNextInt()) {
                int number = scan.nextInt();
                any = true;
                if (number > max) {
                    max = number;
                }
                System.out.print(number + " ");
            }
            if (any) {
                System.out.println("\nLargest number: " + max);
            } else {
                System.out.println("\nNo integers found in file.");
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + path);
        }
    }
}