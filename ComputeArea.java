public class ComputeArea{
    public static void main(String[] args){
        int radius = 14;
        final double Pi = 3.142;
        double Area = Pi*radius*radius;
        double Circumference = radius*2*Pi;
        System.out.println("The area of the circle becomes:"+Area);
        System.out.print("The circumference of the circle becomes:"+Circumference);

    }
}