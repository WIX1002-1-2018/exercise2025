/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package W06;

/**
 *
 * @author hafz's.
 */
public class W06E06 {
    
    public static void main(String[] args) {
        String str = "Ang,Tan,Fong,Ahmad,Ali";
        String[] splitRes = str.split(",");
        for (String split : splitRes)
            System.out.println(split);
    }
    
}
