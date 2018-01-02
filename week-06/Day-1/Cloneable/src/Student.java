import java.lang.Cloneable;

public class Student implements Cloneable {

  String name;
  int age;
  String gender;
  String institution;

  public Student(String name, int age, String gender, String institution) {
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.institution = institution;
  }

  @Override
  protected Object clone() throws CloneNotSupportedException {
//    Student cloneStudent = new Student(name, age, gender, institution);
//    this.name = cloneStudent.name;
//    this.age = cloneStudent.age;
//    this.gender = cloneStudent.gender;
//    this.institution = cloneStudent.institution;
//    return cloneStudent;
    return super.clone();
  }
}
