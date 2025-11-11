import java.util.Scanner;
//import java.util.InputMismatchException;

//author: Luo YanHao

public class W05E03A {

    public static void main(String[] args) {
        Scanner inPut=new Scanner(System.in);
        String str;
        do{
            System.out.print("Do you want to continue?(yes/no):");
        }while(!(str=inPut.next()).equalsIgnoreCase("No"));
    }

}
