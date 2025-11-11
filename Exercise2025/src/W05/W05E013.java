package exercise2025.Exercise2025.src.W05;
import java.util.Scanner;
public class W05E013 {
    public static void main (String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter tree height (N): ");
        int n=sc.nextInt();
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++){
                System.out.print("*");
            }
            for (int a=1;a<i;a++){
                System.out.print("*");
            }
            for (int l=1;l<=n-i;l++){
                System.out.print(" ");
            }
            System.out.println();
        }
        for (int b=1;b<=3;b++){
            for (int c=1;c<=n-2;c++){
                System.out.print(" ");
            }
            System.out.println("***");
        }
    }
}
