package W03;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Badrul
 */
public class W08E07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Modern 'switch' as an expression
        int number = 1;
        
        switch (number) {
            case 1 -> System.out.println("Satu");
            case 2 -> System.out.println("Dua");
            case 3 -> System.out.println("Tiga");
            default -> System.out.println("This program accepts the number from 1 to 3 only");
        }
        
        number = 2;
        
        String output = switch (number) {
            case 1 -> "Satu";
            case 2 -> "Dua";
            case 3 -> "Tiga";
            default -> "This program accepts the number from 1 to 3 only";
        }; // Note the semicolon here, as it's an assignment statement

        System.out.println(output);
        
    }
    
}
