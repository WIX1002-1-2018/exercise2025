package W05;
import java.util.Scanner;

public class W05E03B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sum = 0;
        String answer="";
        do{
            System.out.print("Do you want to continue? : ");
            answer = input.next();
            if(!answer.equalsIgnoreCase("no")&&!answer.equalsIgnoreCase("yes")){
                System.out.println("Enter YES or NO only");
            }
        }while (!answer.equalsIgnoreCase("no"));
        System.out.println("Program stop");
    }
}
