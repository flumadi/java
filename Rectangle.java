public class Rectangle{
    double length;
    double width;
   public Rectangle(){

    }
   public Rectangle(double length,double width){
        this.length = length;
        this. width = width;
   }
   public double getlength(){
    return length;
   }
   public double getwidth(){
    return width;
   }
   public void setlength(double newlength){
    this.length = newlength;
   }
   public void setwidth(double newwidth){
    this.width = newwidth;
   }
   public double findArea(){
    return length*width;
   }
   public String toString(){
    return "The Length= " + length +"\n"  + 
    "The Width=" + width + "\n" + 
    "The Area=" + findArea() ;
   }
    }
