import java.util.Scanner;

public class W05E03{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String ans;

        do{
            System.out.print("Do you want to continue?(yes / no): ");
            ans = input.next();
        }
        while(!ans.equalsIgnoreCase("No") || ans.equalsIgnoreCase("Yes") );
        input.close();
    }
}