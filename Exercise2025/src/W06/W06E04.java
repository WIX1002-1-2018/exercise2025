/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package W06;

/**
 *
 * @author Legion
 */
public class W06E04 {
     public static void main(String[] args) {
         char[] characters = { '$', '%', '+', '-' };
         
         characters[2] = '*';
         
         for(int i = 0; i < characters.length; i++) {
             System.out.println(characters[i]);
         }
     }
}
