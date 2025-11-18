/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package W06;

/**
 *
 * @author pensyarah
 */
public class W06E01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int [] number = new int[10];
        
        number[1]=1;
        number[9]=10;
        
        System.out.println(number[9]);
        
        int [] numberWithValue = {11,12,13,14,15};
        
        System.out.println(numberWithValue[0]);
        System.out.println(numberWithValue[1]);
        
        numberWithValue[0]=54;
        
        System.out.println(numberWithValue[0]);
        System.out.println(numberWithValue[1]);
        
        String [] stringWithValue = {"Zero","One","Two","Three","Four"};
        System.out.println(stringWithValue[2]);
        stringWithValue[2]="Hello";
        System.out.println(stringWithValue[2]);
        
    }
    
}
