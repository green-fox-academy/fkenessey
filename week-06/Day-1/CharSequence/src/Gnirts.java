import java.util.stream.IntStream;

public class Gnirts implements CharSequence {

  private String field;

  public Gnirts(String field) {
    this.field = field;
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
    return field.charAt(field.length() - index - 1);
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    return null;
  }
}
