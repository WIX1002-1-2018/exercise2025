/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;
public class test {
    public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
        System.out.print("How many numbers will you enter?: ");
        int number=s.nextInt();
        int even=0, odd=0, input;
        for(int i=1;i<=number;i++){
            System.out.print("Enter number "+i+": ");
            input=s.nextInt();
            if(input%2==0){
                even++;
            }else{
                odd++;
            }
        }
        System.out.println("Total even numbers: "+even);
        System.out.println("Total odd numbers: "+odd);
    }
}
