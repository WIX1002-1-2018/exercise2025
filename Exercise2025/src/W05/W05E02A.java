/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package W05;

import java.util.Scanner;

/**
 *
 * @author jites
 */
public class W05E02A {
    public static void main(String[] args) {
        // Setup object import
        Scanner input = new Scanner(System.in);
        
        int sum = 0;
        int i = 0;
        do {
            System.out.print("Please input a number: (0 to stop): ");
            i = input.nextInt();
            
            sum += i;
        } while (i != 0);
        
        System.out.printf("The total sum is %d%n", sum);
    }
    
}
