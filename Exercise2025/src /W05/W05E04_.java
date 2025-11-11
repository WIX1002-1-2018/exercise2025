import java.util.Scanner;
public class W05E04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number:");
        int a;
        int b=0;
        do{
            a=sc.nextInt();
            if(a<=0){
                System.out.print("Please enter a positive number:");
            }
            b++;
        }while(a<=0);
        System.out.printf("You entered:%d\n",a);
        System.out.printf("You have entered %d times\n",b);
    }

}
