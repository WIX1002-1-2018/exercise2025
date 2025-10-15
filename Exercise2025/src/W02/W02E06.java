/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package W02;

import java.util.Random;

/**
 *
 * @author Badrul
 */
public class W02E06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
              // Create a Random object
        Random randGenerator = new Random();

        // Generate a random integer between 0 and 99
        int randomNumber = randGenerator.nextInt(100);
        System.out.println("A random number between 0 and 99: " + randomNumber);

        // Generate a random number to simulate a 6-sided die roll (1-6)
        // nextInt(6) gives 0-5, so we add 1
        int diceRoll = randGenerator.nextInt(6) + 1;
        System.out.println("You rolled the die and got: " + diceRoll);
    }
    
}
