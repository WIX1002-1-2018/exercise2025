
package W05;
import java.util.Scanner;
public class W05E03B {

    public static void main(String[] args) {
        Scanner inPut=new Scanner(System.in);
        String str;
        boolean isValidInput=true;
        do{
            if (isValidInput) System.out.print("Do you want to continue?(yes/no):");
            else System.out.print("Please enter \"yes\" or \"no\"):");
            str=inPut.next();
            if (!str.equalsIgnoreCase("Yes")) isValidInput=false;
            else isValidInput=true;
        }while(!str.equalsIgnoreCase("No"));
    }

}
