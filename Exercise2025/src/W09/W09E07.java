package W09;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * W09E07 - Traditional try/finally vs try-with-resources
 * Purpose: Demonstrate the difference between manual resource management using
 *          try/catch/finally and the modern try-with-resources (TWR) pattern
 *          when working with I/O streams.
 * Key Concepts:
 *  - Traditional try/finally: explicit null checks, close inside finally,
 *    and nested try/catch to handle close failures.
 *  - Try-with-resources: automatic closing for AutoCloseable objects and
 *    cleaner code.
 *  - Both approaches read the same sample file content for comparison.
 * Notes: The example writes a small sample file (`try_demo.txt`) in the working
 *        directory, then reads it twice—once with each approach.
 *
 * Author: pensyarah
 */
public class W09E07 {

    public static void main(String[] args) {
        File sample = new File("try_demo.txt");
        writeSampleFile(sample);

        System.out.println("--- Traditional try/finally ---");
        readWithTraditional(sample);

        System.out.println("\n--- Try-with-resources ---");
        readWithTwr(sample);
    }

    // Write a small file for the demo
    private static void writeSampleFile(File target) {
        try (FileWriter writer = new FileWriter(target)) {
            writer.write("Line 1: Hello from try demo\n");
            writer.write("Line 2: Resources must be closed\n");
        } catch (IOException e) {
            System.out.println("Failed to write sample file: " + e.getMessage());
        }
    }

    // Traditional style: manual close in finally
    private static void readWithTraditional(File source) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(source));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading (traditional): " + e.getMessage());
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException closeEx) {
                    System.out.println("Failed to close reader (traditional): " + closeEx.getMessage());
                }
            }
        }
    }

    // Modern style: try-with-resources automatically closes reader
    private static void readWithTwr(File source) {
        try (BufferedReader reader = new BufferedReader(new FileReader(source))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading (TWR): " + e.getMessage());
        }
    }
}