/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package W10;

/**
 *
 * @author pensyarah
 */
public class Student {
    private String contactNum;
    
    public Student() {
        this.contactNum = null;
       }
    
    public Student(String contactNum) {
        this.contactNum = contactNum;
    }

    public String getContactNum() {
        return contactNum;
    }

    public void setContactNum(String contactNum) {
        this.contactNum = contactNum;
    }
    
    private void DisplayContactNum(){
        System.out.println(contactNum);
        
    }
    public void Display(){
        this.DisplayContactNum();
    }

   
    
}
