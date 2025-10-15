/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package W02;

/**
 *
 * @author Badrul
 */
public class W02E02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // A constant for the number of days in a week.
        final int DAYS_IN_WEEK = 7;

        int weeksInSemester = 14;
        int totalDays = weeksInSemester * DAYS_IN_WEEK;

        System.out.println("There are " + DAYS_IN_WEEK + " days in a week.");
        System.out.println("A semester of " + weeksInSemester + " weeks has " + totalDays + " days.");

        // The line below would cause a compiler error because constants cannot be changed.
        // DAYS_IN_WEEK = 8; // This is not allowed!
    }
    
}
