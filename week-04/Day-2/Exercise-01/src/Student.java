public class Student extends Person {
  private String previousOrganization;
  private int skippedDays;

  public Student() {
    this.setName("Jane Doe");
    this.setAge(30);
    this.setGender("female");
    this.previousOrganization = "The School of Life";
    this.skippedDays = 0;
  }

  public Student (String name, int age, String gender, String previousOrganization) {
    this.setName(name);
    this.setAge(age);
    this.setGender(gender);
    this.previousOrganization = previousOrganization;
  }

  public void getGoal() {
    System.out.println("Be a junior software developer.");
  }

  public void introduce() {
    System.out.println("Hi, I'm " + getName() + " a " + getAge() + " year old " + getGender() + " from " + previousOrganization + " who skipped " + skippedDays + " days from the course already.");
  }

  public void skipDays(int numberOfDays) {
    this.skippedDays+=numberOfDays;
  }
}
