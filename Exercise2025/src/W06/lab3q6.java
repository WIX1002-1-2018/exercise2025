/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pingshuya
 */
import java.util.Scanner;

public class lab3q6 {

    public static void main(String[] args) {

        System.out.println("Enter the radius of the circle: ");

        Scanner sc = new Scanner(System.in);

        float radius = sc.nextFloat();

        System.out.println(radius);

        System.out.print("Enter the x-coordinate of the point: ");
        int x = sc.nextInt();
        System.out.print("Enter the y-coordinate of the point: ");
        int y = sc.nextInt();

        double distance = (x * x + y * y);
        if (distance <= radius){
            System.out.print("The point ({x}, {y}) is inside the circle.");
        }else
            System.out.print("The point ({x}, {y}) is outside the circle.");

    }
}
