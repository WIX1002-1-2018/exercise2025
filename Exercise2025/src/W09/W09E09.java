package W09;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Random;

/**
 * W09E09 - Combined Demo of W09E03 (binary write) and W09E04 (binary read/average)
 * Purpose: In one class, provide static methods to write random integers to a
 *          binary file and then read them back to compute the average.
 * Methods:
 *  - writeBinaryIntegers(String path, int count): writes `count` random ints
 *    (0–1000) to the specified binary file using ObjectOutputStream.
 *  - readAndAverageBinary(String path): reads all ints, prints them, and
 *    computes their average using EOF to terminate.
 * Usage: Run main to create `integer.dat` with 10 numbers, then display the
 *        list and average.
 *
 * Author: pensyarah
 */
public class W09E09 {

    public static void main(String[] args) {
        String path = "integer.dat";
        writeBinaryIntegers(path, 10);
        readAndAverageBinary(path);
    }

    // Writes random integers (0-1000) to a binary file
    public static void writeBinaryIntegers(String path, int count) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(path))) {
            Random random = new Random();
            for (int i = 0; i < count; i++) {
                out.writeInt(random.nextInt(1001));
            }
            System.out.println("Wrote " + count + " integers to " + path);
        } catch (IOException e) {
            System.out.println("Failed to write binary file: " + e.getMessage());
        }
    }

    // Reads integers from a binary file, prints them, and shows the average
    public static void readAndAverageBinary(String path) {
        int sum = 0;
        int count = 0;
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(path))) {
            System.out.print("List of integers: ");
            while (true) {
                try {
                    int num = in.readInt();
                    System.out.print(num + " ");
                    sum += num;
                    count++;
                } catch (EOFException eof) {
                    break; // end of file reached
                }
            }
            System.out.println();
            if (count > 0) {
                System.out.printf("The average is %.2f%n", (double) sum / count);
            } else {
                System.out.println("No data to average.");
            }
        } catch (IOException e) {
            System.out.println("Failed to read binary file: " + e.getMessage());
        }
    }
}