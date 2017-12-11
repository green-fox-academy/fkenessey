public class Counter {
  private int field;
  private int fieldOriginal;

  public Counter() {
    this.field = 0;
  }

  public Counter(int field) {
    this.field = field;
    this.fieldOriginal = field;
  }

  public void add(int number) {
    this.field += number;
  }

  public void add() {
    field++;
  }

  public int get() {
    return field;
  }

  public void reset() {
    this.field = fieldOriginal;
  }
}

