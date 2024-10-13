public class StudentRegMain {
  public static void main(String[] args) {
      System.out.println("\n=========using new Course==========");
      StudentCourse dan = new StudentCourse("G127/001/2023", "Daniel Nzioki", new Course("SCI220", "Programming in Python"));
      StudentCourse kip = new StudentCourse("G127/2234/2023", "Kipkirui Jang", new Course("SCI303", "Web Programming"));
      System.out.print("\n___________________________\n");
      System.out.println(dan.printD());
      System.out.println("_____________________________");
      System.out.println(kip.printD());
      System.out.println("\n================================");
      System.out.println("=====FIRST CREATED OBJECT========");
      Course a = new Course("SCI220", "Programming in Python");
      Course b = new Course("SCI303", "Web Programming");
      StudentCourse dann = new StudentCourse("G127/001/2023", "Daniel Nzioki", a);
      System.out.println(dann.printD());
      System.out.println("_____________________________");
      StudentCourse kipp = new StudentCourse("G127/2234/2023", "Kipkirui Jang", b);
      System.out.println(kipp.printD());
      System.out.println("================================");
  }
}