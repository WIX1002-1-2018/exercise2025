/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package W05;

import java.util.Scanner;
/**
 *
 * @author chua1
 */
public class W05E11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean invalid = true;
        int key; 
        while (invalid)
        {
            System.out.print("Enter key: ");
            key = input.nextInt();
            if (key > 50)
            {
                boolean prime = true;
                for (int i = 2; i < key; i++)
                {
                    if (key % i == 0)
                    {
                        prime = false;
                        System.out.println("Invalid Key: Not Prime");
                        break;
                    }
                }
                if (prime)
                {
                    System.out.print("Valid Key");
                    invalid = false;
                }            
            }
            else
            {
                System.out.println("Invalid Key: Too Small");
            }
            System.out.println(" ");
        }
    }
}
