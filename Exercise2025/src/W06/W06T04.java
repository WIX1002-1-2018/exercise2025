/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package W06;
/**
 *
 * @author pensyarah
 */
public class W06T04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      String[] str = {"123", "254", "the"};
      
      //String[] word = new String[3];
      int count = 0;
      for(int i = 0; i < 3; i++){
        if (str[i].equals("the")){
            count = count + 1;
        }
      }
      System.out.println(count);
    }
}
