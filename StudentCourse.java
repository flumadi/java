public class StudentCourse {
  String regNo;
  String fullNames;
  Course course;

  public StudentCourse(String regNo, String fullNames, Course course) {
      this.regNo = regNo;
      this.fullNames = fullNames;
      this.course = course;
  }

  public void setRegNo(String newReg) {
      this.regNo = newReg;
  }

  public String getRegNo() {
      return this.regNo;
  }

  public void setName(String newName) {
      this.fullNames = newName;
  }

  public String getName() {
      return this.fullNames;
  }

  public void setCourse(Course obj) {
      this.course = obj;
  }

  public Course getCourse() {
      return this.course;
  }

  public String printD() {
      return "Full Name: " + fullNames + "\n" + getCourse().toString();
  }
}