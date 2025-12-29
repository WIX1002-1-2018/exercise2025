package W09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * W09E05 - Binary Encoding of Text Using File I/O
 * Purpose: Convert a String to its binary representation (8-bit per char),
 *          write to `dataBinary.txt`, then read it back and reconstruct the
 *          original text.
 * Key Concepts: byte-to-binary conversion via bit masking/shift, text file I/O
 *               with `PrintWriter` and `Scanner`, parsing binary strings back
 *               to characters using `Integer.parseInt(..., 2)`.
 * Input/Output: Writes binary bits to `dataBinary.txt` and prints recovered text.
 *
 * Original author: Badrul
 */
public class W09E05 {

    public static void main(String[] args) {
        String str = "Hello World";
        byte[] bytes = str.getBytes();

        // Encode to binary text file
        try (PrintWriter outputStream = new PrintWriter(new FileOutputStream("dataBinary.txt"))) {
            for (byte b : bytes) {
                int val = b;
                for (int i = 0; i < 8; i++) {
                    if ((val & 128) == 0)
                        outputStream.print("0");
                    else
                        outputStream.print("1");
                    val <<= 1;
                }
            }
        } catch (IOException e) {
            System.out.println("Problem with file output");
        }

        System.out.print("The sentence is :");

        // Decode from binary text file
        try (Scanner inputStream = new Scanner(new FileInputStream("dataBinary.txt"))) {
            String temp, str1 = "";
            if (inputStream.hasNext()) {
                temp = inputStream.next();
                for (int i = 0; i < temp.length() / 8; i++) {
                    int a = Integer.parseInt(temp.substring(8 * i, (i + 1) * 8), 2);
                    str1 += (char) (a);
                }
                System.out.println(str1);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File was not found");
        }
    }
}

