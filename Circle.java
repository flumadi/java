public class Circle{
    double radius;
    String color;
    public Circle(){
        radius = 1.0;
        color = "red";
    }
    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }
public double getRadius(){
    return radius;
}
public String getColor(){
    return color;
}
public void setRadius(double newradius){
    this.radius = newradius;
}
public void setColor(String newcolor){
    this.color = newcolor;
}
public double findArea(){
    return Math.PI*radius*radius;
}
public String toString(){
    return "The Radius= " + radius + "\n" +
    "The Color= " + color + "\n" + 
    "The Area of the circle radius 14 is " + findArea();
 }
}