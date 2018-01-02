package Dominoes;

public class Domino implements Comparable, Printable{
  private final int[] values;

  public Domino(int valueA, int valueB) {
    this.values = new int[]{valueA, valueB};
  }

  public int[] getValues() {
    return values;
  }

  @Override
  public String toString() {
    return "[" + values[0] + ", " + values[1] + "]";
  }

  @Override
  public int compareTo(Object o) {
    Domino otherDomino = (Domino) o;
    int[] output = new int[2];
    output[0] = this.values[0] - otherDomino.values[0];
    output[1] = this.values[1] - otherDomino.values[1];
    return output[0];
  }

  @Override
  public void printAllFields() {
    System.out.print("[" + values[0] + ", " + values[1] + "], ");
  }
}
