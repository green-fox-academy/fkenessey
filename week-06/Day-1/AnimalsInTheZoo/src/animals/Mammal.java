package animals;

public class Mammal extends Animal{

  public Mammal(String name) {
    super(name, 0);
  }

  public String getName(){
    return name;
  }

  public String breed(){
    return "pushing miniature versions out.";
  }
}
