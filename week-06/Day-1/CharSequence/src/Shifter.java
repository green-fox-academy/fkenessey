import java.util.stream.IntStream;

public class Shifter implements CharSequence {

  private String field;
  private int shift;

  public Shifter(String field, int shift) {
    this.field = field;
    this.shift = shift;
  }

  @Override
  public IntStream chars() {
    return null;
  }

  @Override
  public IntStream codePoints() {
    return null;
  }

  @Override
  public int length() {
    return 0;
  }

  @Override
  public char charAt(int index) {
    return field.charAt(index + shift);
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    return null;
  }
}
