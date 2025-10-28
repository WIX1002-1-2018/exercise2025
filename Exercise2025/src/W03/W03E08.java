/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package W03;

/**
 *
 * @author Badrul
 */
public class W03E08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int  number = 2;
        
        String output = switch (number) {
            case 1 -> "Satu";
            case 2 -> "Dua";
            case 3 -> "Tiga";
            default -> "This program accepts the number from 1 to 3 only";
        }; // Note the semicolon here, as it's an assignment statement

        System.out.println(output);
        
        int month = 12;
        int daysInMonth = switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> 28; // We'll ignore leap years for this example
            default -> 0; // Represents an invalid month
        };

        System.out.println("Days: " + daysInMonth);
    }
    
}
