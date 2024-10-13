import java.util.Scanner;

public class SimpleInterests{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the principal amount:");
         double principal = input.nextDouble();
         System.out.println("Enter the rate amount:");
         double rate = input.nextDouble();
         System.out.println("Enter the period of time:");
         double time = input.nextDouble();
          double Simpleinterests = principal*rate/100*time;
          System.out.print("The simple interest for "+ time +" yrs is " + Simpleinterests + " kenya shillings");

    }
 }
