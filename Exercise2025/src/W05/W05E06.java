package W05;
import java.util.Scanner;
public class W05E06 {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter length N:");
        int n=sc.nextInt();
        for (int i=0;i<n;i++) {
            for (int j=0;j<n;j++){
                System.out.print("P");
            }
            System.out.println();
            
        }
    }
}
