public class Mentor extends Person {
  private String level;

  public Mentor() {
    setName("Jane Doe");
    setAge(30);
    setGender("female");
    this.level = "intermediate";
  }

  public Mentor(String name, int age, String gender, String level) {
    setName(name);
    setAge(age);
    setGender(gender);
    this.level = level;
  }

  public void getGoal() {
    System.out.println("Educate brilliant junior software developers.");
  }

  public void introduce() {
    System.out.println("Hi, I'm " + getName() + ", a " + getAge()+ " year old " + getGender() + level + " mentor.");
  }
}
