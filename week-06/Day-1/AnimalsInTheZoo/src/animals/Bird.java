package animals;

public class Bird extends Animal {

  public Bird(String name) {
    super(name, 0);
  }

  public String getName(){
    return name;
  }

  public String breed(){
    return "laying eggs.";
  }
}
