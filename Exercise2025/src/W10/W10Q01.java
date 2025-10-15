/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package W10;

/**
 *
 * @author pensyarah
 */
public class W10Q01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
        Student student = new Student();
        student.Display();
        
        student.setContactNum("0112334545");
        System.out.println(student.getContactNum());
    }
    
}


