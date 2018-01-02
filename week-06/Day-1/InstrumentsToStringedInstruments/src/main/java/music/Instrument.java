package main.java.music;

abstract public class Instrument {
  protected String nameOfInstrument;

  public Instrument(String nameOfInstrument) {
    this.nameOfInstrument = nameOfInstrument;
  }

  abstract void play();
}
