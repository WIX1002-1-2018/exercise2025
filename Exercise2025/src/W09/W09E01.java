package W09;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Random;

/**
 * W09E01 - Write Random Integers to Text File
 * Purpose: Generate 10 random integers (0-1000) and write each on a new line
 *          into `integer.txt` for later exercises to consume.
 * Key Concepts: try-with-resources for file output, `Random.nextInt`,
 *               simple loop-based file writing, newline-separated records.
 * Output: Creates/overwrites `integer.txt` in the working directory.
 * 
 * @author pensyarah
 */
public class W09E01 {

    public static void main(String[] args) {
        try (PrintWriter writer = new PrintWriter(new FileOutputStream("integer.txt"))) {
            Random rand = new Random();
            for (int i = 0; i < 10; i++) {
                int num = rand.nextInt(1001); // 0..1000 inclusive
                writer.println(num);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Problem with the file");
        }
    }
}
