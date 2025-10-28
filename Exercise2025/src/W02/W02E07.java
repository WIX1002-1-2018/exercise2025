/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package W02;

import java.util.random.RandomGenerator;

/**
 *
 * @author Badrul
 */
public class W02E07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Modern approach using RandomGenerator interface (Java 17+)
        // This is the new recommended way to generate random numbers
        
        // Create a RandomGenerator using the default algorithm
        RandomGenerator random = RandomGenerator.getDefault();
        
        // Generate a random integer between 0 and 99
        int randomNumber = random.nextInt(100);
        System.out.println("A random number between 0 and 99: " + randomNumber);
        
        // Generate a random number to simulate a 6-sided die roll (1-6)
        int diceRoll = random.nextInt(1, 7); // nextInt(origin, bound) - bound is exclusive
        System.out.println("You rolled the die and got: " + diceRoll);
        
        // Generate a random double between 0.0 and 1.0
        double randomDouble = random.nextDouble();
        System.out.println("A random double between 0.0 and 1.0: " + randomDouble);
        
        // Generate a random double between 10.0 and 20.0
        double randomDoubleRange = random.nextDouble(10.0, 20.0);
        System.out.println("A random double between 10.0 and 20.0: " + randomDoubleRange);
        
        // Generate a random boolean
        boolean randomBoolean = random.nextBoolean();
        System.out.println("A random boolean: " + randomBoolean);
        
        // Generate a random long
        long randomLong = random.nextLong();
        System.out.println("A random long: " + randomLong);
        
        // Simulate rolling two dice
        int dice1 = random.nextInt(1, 7);
        int dice2 = random.nextInt(1, 7);
        System.out.println("Rolling two dice: " + dice1 + " and " + dice2 + " = " + (dice1 + dice2));
    }
    
}

