/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package W06;

/**
 *
 * @author pensyarah
 */
public class W06T05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] sentence = {"my", "name", "is", "QIANFUSHENG"};
        for (int i = sentence.length - 1; i >=0; i--){
            String reversedString = new StringBuilder(sentence[i]).reverse().toString();
            System.out.println(reversedString);
        }
    }
    
}
