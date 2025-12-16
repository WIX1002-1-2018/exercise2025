package W09;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * W09E04 - Read Integers from Binary File and Compute Average
 * Purpose: Consume the binary integers written by `W09E03` from `integer.dat`,
 *          display them, and compute their average.
 * Key Concepts: `ObjectInputStream.readInt`, EOF-driven loop using
 *               `EOFException`, running sum and count, formatted output.
 * Dependencies: Requires `integer.dat` generated beforehand.
 *
 * @author pensyarah
 */
public class W09E04 {

    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("integer.dat"))) {
            System.out.print("List of integers: ");
            try {
                while (true) {
                    int num = in.readInt();
                    System.out.print(num + " ");
                    count++;
                    sum += num;
                }
            } catch (EOFException e) {
                System.out.println(); // newline after list
            }

            if (count > 0) {
                System.out.printf("The average is %.2f%n", (double) sum / count);
            } else {
                System.out.println("No data to average.");
            }
        } catch (IOException e) {
            System.out.println("File not found");
        }
    }
}
