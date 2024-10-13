public class Person {
    String firstname;
    String lastname;
    int age;
    Person (String x, String y, int z){
        firstname = x;
        lastname = y;
        age = z;
    }
public String getfirstname(){
    return firstname;
}
public String getsecondname(){
    return lastname;
}
public int getage(){
    return age;
}
public void setlength(String newfirstname){
    this.firstname = newfirstname;
   }
   public void setwidth(String newlastname){
    this.lastname = newlastname;
   }
   public void setage(int newage){
    this.age = newage;
   }
   public String toString(){
    return "The Firstname= " + firstname +"\n"  + 
    "The lastname=" + lastname  + "\n" + 
    "The Age=" +  age ;
   }
    }


