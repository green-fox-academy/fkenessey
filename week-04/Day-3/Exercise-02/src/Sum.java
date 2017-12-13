import java.util.ArrayList;

public class Sum {

  private ArrayList<Integer> input = new ArrayList<>();

  public Sum() {
  }

  public Sum(ArrayList<Integer> input) {
    this.input = input;
  }

  public int sum(ArrayList input) {
    int output = 0;
    for (int i = 0; i < input.size(); i++) {
      output += (int)(input.get(i));
    }
    return output;
  }
}
