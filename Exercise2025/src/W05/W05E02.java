/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package W05;

import java.util.Scanner;

/**
 *
 * @author pensyarah
 */
public class W05E02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           Scanner scanner = new Scanner(System.in);

        int sum = 0;
        while (true) {
            System.out.print("Enter a number (0 to stop): ");
            int input = scanner.nextInt();
            if (input == 0) {
                break;
            }

            sum += input;

        }

        System.out.println("The total sum is: " + sum);
    }
    
}
