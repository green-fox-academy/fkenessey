package main.java.music;

public class Violin extends StringedInstrument{
  public Violin() {
    super("Violin", 4);
  }

  public Violin(int numberOfStrings) {
    super("Violin", numberOfStrings);
  }

  @Override
  public void sound() {
    System.out.println("Screech");
  }

  @Override
  public void play() {
    System.out.print(nameOfInstrument + ", a " + numberOfStrings + "-stringed instrument that goes ");
    sound();
  }
}
