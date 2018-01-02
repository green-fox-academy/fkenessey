package animals;

abstract public class Animal {

  protected String name;
  protected int age;

  public Animal(String name, int age) {
    this.name = name;
    this.age = age;
  }

  abstract public String getName();
  abstract public String breed();
}
