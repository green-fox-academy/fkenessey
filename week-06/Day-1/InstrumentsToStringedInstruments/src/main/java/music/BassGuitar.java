package main.java.music;

public class BassGuitar extends StringedInstrument{

  public BassGuitar() {
    super("Bass Guitar", 4);
  }

  public BassGuitar(int numberOfStrings) {
    super("Bass Guitar", numberOfStrings);
  }

  @Override
  public void sound() {
    System.out.println("Duum-duum-duum");
  }

  @Override
  public void play() {
    System.out.print(nameOfInstrument + ", a " + numberOfStrings + "-stringed instrument that goes ");
    sound();
  }
}
