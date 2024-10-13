
import java.util.Scanner;

public class ScannerNameAge{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter name");
        String  name  = scn.nextLine();
        System.out.print("Enter age");
        int age = scn.nextInt();

        System.out.print("Greetings! "+ name + " You are "+ age +"years old");

    }
}