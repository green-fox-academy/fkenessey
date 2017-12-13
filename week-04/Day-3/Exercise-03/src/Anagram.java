import java.util.ArrayList;
import java.util.Collections;

public class Anagram {
  private String input1;
  private String input2;

  public Anagram() {

  }

  public Anagram(String input1, String input2) {
    this.input1 = input1;
    this.input2 = input2;
  }

  public boolean ifAnagram(String input1, String input2) {
    ArrayList<String> in1 = new ArrayList<>();
    ArrayList<String> in2 = new ArrayList<>();
    if (input1.length() == input2.length()) {
      for (int i = 0; i < input1.length(); i++) {
        in1.add(String.valueOf(input1.charAt(i)));
        in2.add(String.valueOf(input2.charAt(i)));
      }
      Collections.sort(in1);
      Collections.sort(in2);
    } else {
      System.out.println("Incorrect input!");
      return false;
    }
    if (input1.length() == input2.length()) {
      boolean output = true;
      for (int i = 0; i < in1.size(); i++) {
        if (in1.get(i).contains(in2.get(i))) {
          continue;
        } else {
          output = false;
          break;
        }
      }
      return output;
    } else {
      return false;
    }
  }
}
