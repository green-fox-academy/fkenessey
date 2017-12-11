public class Animal {
  int hunger;
  int thirst;

  public Animal() {
    this(50,50);
  }

  public Animal(int hunger, int thirst) {
    this.hunger = hunger;
    this.thirst = thirst;
  }

  public void addHunger(int hunger) {
    this.hunger = hunger;
  }

  public void addThirst(int thirst) {
    this.thirst = thirst;
  }

  public void eat() {
    this.hunger--;
  }

  public void drink() {
    this.thirst--;
  }

  public void play() {
    this.hunger++;
    this.thirst++;
  }

  @Override
  public String toString() {
    return "hunger value: " + hunger + "\n" + "thirst value: " + thirst;
  }

  /*public static void main(String[] args) {
    Animal cow = new Animal();
    System.out.println(cow);
    cow.play();
    System.out.println("After playing:\n" + cow);
    cow.eat();
    System.out.println("After eating:\n" + cow);
    cow.drink();
    System.out.println("After drinking:\n" + cow);


  }*/
}
