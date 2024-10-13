
import java.util.Scanner;
public class RectPeriArea{
    public static void main(String[] args){
        double length, width, perimeter, area;
        Scanner input = new Scanner(System.in);
        System.out.println("The length=");
        length = input.nextDouble();
        System.out.println("The width=");
        width = input.nextDouble();
        area = length * width;
        perimeter = 2*(length + width);
        System.out.println("The area becomes " + area);
        System.out.print("The perimeter becomes " + perimeter);
    }
}
    

