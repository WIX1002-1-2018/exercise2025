/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package W10;

/**
 *
 * @author pensyarah
 */
public class Connection {
    static int count;

    public Connection() {
        count++;
    }
    
    void disconnection() {
        if(count > 0){
            count--;
        }else{
            System.out.println("NO CONNECTIONS");
        }
    }
    
    void displayInfo(){
        System.out.println("This is " + count + " number");
    }
    
    
}
