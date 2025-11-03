/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package W02;

/**
 *
 * @author Badrul
 */
public class W02L01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Lab Exercise 01: Convert temperature from Fahrenheit to Celsius
        // Problem: Convert a temperature value from Fahrenheit to Celsius
        // Formula: Celsius = (Fahrenheit - 32) / 1.8
        // Display: The result in two decimal places
        
        // Declare and initialize a temperature in Fahrenheit
        // Example temperatures to test:
        // 32°F = 0°C (freezing point of water)
        // 212°F = 100°C (boiling point of water)
        // 68°F = 20°C (room temperature)
        double fahrenheit = 98.6;  // Normal human body temperature
        
        // Calculate Celsius using the conversion formula
        // Celsius = (Fahrenheit - 32) / 1.8
        // Step 1: Subtract 32 from Fahrenheit
        // Step 2: Divide the result by 1.8
        double celsius = (fahrenheit - 32) / 1.8;
        
        // Display the results
        System.out.println("===== Temperature Conversion =====");
        System.out.println("From Fahrenheit to Celsius");
        System.out.println();
        
        // Display the input temperature in Fahrenheit
        System.out.println("Temperature in Fahrenheit: " + fahrenheit + "°F");
        
        // Display the converted temperature in Celsius with 2 decimal places
        // Using printf() with format specifier %.2f for 2 decimal places
        System.out.printf("Temperature in Celsius: %.2f°C%n", celsius);
        System.out.println();
        
        // ===== ADDITIONAL EXAMPLES =====
        System.out.println("===== Conversion Examples =====");
        
        // Example 1: Freezing point of water
        double f1 = 32;
        double c1 = (f1 - 32) / 1.8;
        System.out.printf("%.1f°F = %.2f°C (Freezing point of water)%n", f1, c1);
        
        // Example 2: Room temperature
        double f2 = 68;
        double c2 = (f2 - 32) / 1.8;
        System.out.printf("%.1f°F = %.2f°C (Room temperature)%n", f2, c2);
        
        // Example 3: Boiling point of water
        double f3 = 212;
        double c3 = (f3 - 32) / 1.8;
        System.out.printf("%.1f°F = %.2f°C (Boiling point of water)%n", f3, c3);
        
        // Example 4: Absolute zero
        double f4 = -459.67;
        double c4 = (f4 - 32) / 1.8;
        System.out.printf("%.2f°F = %.2f°C (Absolute zero)%n", f4, c4);
        
        // Example 5: Negative temperature
        double f5 = -40;
        double c5 = (f5 - 32) / 1.8;
        System.out.printf("%.1f°F = %.2f°C (Interesting: -40°F = -40°C)%n", f5, c5);
    }
    
}

