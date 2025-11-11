import java.util.Scanner;

public class W05E04 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int num;

        do{
            System.out.print("Enter a postive number: ");
            num = input.nextInt();
            if(num > 0){
                System.out.println("You entered " + num);
            }
            else{
                System.out.print("Please enter a postive number: ");
                num = input.nextInt();
            }
        }
        while(num <= 0);
    }
}
