package W09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * W09E02 - Read Integers and Find Maximum (Text File)
 * Purpose: Read the integers produced by `W09E01` from `integer.txt`, display
 *          them, and report the largest value found.
 * Key Concepts: File reading with `Scanner`, sentinel max initialization
 *               (`Integer.MIN_VALUE`), iterative comparison, resource cleanup.
 * Dependencies: Requires `integer.txt` in the working directory.
 * 
 * @author pensyarah
 */
public class W09E02 {

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(new FileInputStream("integer.txt"))) {
            System.out.print("The list : ");
            int max = Integer.MIN_VALUE;
            while (scan.hasNextInt()) {
                int number = scan.nextInt();
                if (number > max) {
                    max = number;
                }
                System.out.print(number + " ");
            }
            System.out.println("\nLargest number: " + max);
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}
