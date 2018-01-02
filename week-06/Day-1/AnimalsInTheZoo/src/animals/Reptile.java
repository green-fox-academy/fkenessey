package animals;

public class Reptile extends Animal{

  public Reptile(String name) {
    super(name, 0);
  }

  public String getName(){
    return name;
  }

  public String breed(){
    return "laying eggs.";
  }
}
