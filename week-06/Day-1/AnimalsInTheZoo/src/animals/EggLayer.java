package animals;

abstract public class EggLayer extends Animal {

  public EggLayer(String name, int age) {
    super(name, age);
  }

  public String breed(){
    return "laying eggs.";
  }
}
