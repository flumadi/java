public class RectangleAreaPerimeter{
    public static void main(String[] args){
        double length, width, area, perimeter;
        length = 10.0;
        width = 5.0;
        area = length*width;
        perimeter = 2*(length + width) ;
        System.out.println("The area of the rectangle is "+area);
        System.out.print("The perimeter of the rectangle is "+perimeter);
    }
}