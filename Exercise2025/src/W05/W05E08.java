/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package W05;

/**
 *
 * @author User
 */
import java.util.*;

public class W05E08 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("How many scores?: ");
        int turn = sc.nextInt();
        
        int max_num = -1;
        int min_num = 100001;

        
        for(int i =1; i <=turn;i++){
            System.out.printf("Score %d: ",i);
            int scores = sc.nextInt();
            
            if ((scores >= 0) && (scores <=100000)){
                
                if (scores >max_num){
                    max_num = scores;
                }
            
                if (scores < min_num){
                    min_num = scores;
                }
            
        
             }
         }
        
        System.out.printf("Highest Valid Score: %d\n",max_num);
        System.out.printf("Lowest Valid Score: %d\n",min_num);        
        
        
    }
          
    
}

        

}

