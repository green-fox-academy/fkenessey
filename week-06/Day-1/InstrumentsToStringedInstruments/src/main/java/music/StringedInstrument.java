package main.java.music;

abstract public class StringedInstrument extends Instrument{

  int numberOfStrings;

  public StringedInstrument(String nameOfInstrument, int numberOfStrings) {
    super(nameOfInstrument);
    this.numberOfStrings = numberOfStrings;
  }

  abstract void sound();
}
