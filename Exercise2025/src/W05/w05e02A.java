import java.util.Scanner;
//import java.util.InputMismatchException;

public class w05e02A {

    public static void main(String[] args) {
        int sum=0;
        int n=0;
        Scanner inPut=new Scanner(System.in);
        do{
            System.out.print("Enter an integer (0 to quit): ");
            sum+=n;
        }while((n=inPut.nextInt())!=0);
        System.out.printf("The sum is %d.\n", sum);
    }

}
