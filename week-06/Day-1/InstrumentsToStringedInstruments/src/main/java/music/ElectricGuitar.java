package main.java.music;

public class ElectricGuitar extends StringedInstrument {

  public ElectricGuitar() {
    super("Electric Guitar", 6);
  }

  public ElectricGuitar(int numberOfStrings) {
    super("Electric Guitar", numberOfStrings);
  }

  @Override
  public void sound() {
    System.out.println("Twang");
  }

  @Override
  public void play() {
    System.out.print(nameOfInstrument + ", a " + numberOfStrings + "-stringed instrument that goes ");
    sound();
  }
}
