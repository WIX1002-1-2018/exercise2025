package W09;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Random;

/**
 * W09E03 - Write Random Integers to Binary File
 * Purpose: Generate 10 random integers (0-1000) and store them as binary
 *          values inside `integer.dat` for later consumption.
 * Key Concepts: `ObjectOutputStream.writeInt`, binary vs text storage, looping
 *               writes, basic file exception handling.
 * Output: Creates/overwrites `integer.dat` in the working directory.
 * 
 * @author pensyarah
 */
public class W09E03 {

    public static void main(String[] args) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("integer.dat"))) {
            Random random = new Random();
            for (int i = 0; i < 10; i++) {
                out.writeInt(random.nextInt(1001));
            }
        } catch (IOException e) {
            System.out.println("File not found" + e.getMessage());
        }
    }
}
