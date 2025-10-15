/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package W02;

/**
 *
 * @author Badrul
 */
public class W02E04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int totalScore = 85;
        int numberOfSubjects = 4;

        // Incorrect average due to integer division
        double incorrectAverage = totalScore / numberOfSubjects;
        System.out.println("Incorrect Average (without casting): " + incorrectAverage);

        // Correct average using type casting
        double correctAverage = (double) totalScore / numberOfSubjects;
        System.out.println("Correct Average (with casting): " + correctAverage);
    }
    
}
