import java.util.Scanner;
public class W05E08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=0,b=0;
        System.out.print("How many scores?: ");
        int c=sc.nextInt();
        for(int i=1;i<=c;i++){
            System.out.printf("Score %d: ",i);
            int d=sc.nextInt();
            if((d<0)||(d>100000)){
            }else if(d>a){
                a=d;
            }
            if((d<0)||(d>100000)){
            }else if(d<b){
                b=d;
            }
        }
        System.out.println("Highest valid score: "+a);
        System.out.println("Lowest valid score: "+b);
    }
}