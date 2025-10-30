/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package W02;

import java.util.Scanner;

/**
 *
 * @author Badrul
 */
public class W02E05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String firstName = "Badrul";
        String lastName = "Hisham";
        String fullName = firstName + " " + lastName; // Concatenation
        System.out.println("Full Name: " + fullName);

        // --- Console Input Example ---
        // Create a Scanner object to read from the keyboard
        Scanner input = new Scanner(System.in);

        // Prompt the user for their name
        System.out.print("\nPlease enter your name: ");
        String userName = input.nextLine(); // Reads the whole line

        // Prompt the user for their age
        System.out.print("Please enter your age: ");
        int userAge = 0;
        String ageLine = input.nextLine();
        try {
            userAge = Integer.parseInt(ageLine.trim());
        } catch (NumberFormatException e) {
            System.out.println("Invalid age entered. Using 0 as default.");
        }

        // Close scanner when done
        input.close();

        // --- Console Output Example ---
        System.out.println("\nHello, " + userName + "! You are " + userAge + " years old.");
    }
}
