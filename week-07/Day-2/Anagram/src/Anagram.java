import java.util.ArrayList;
import java.util.Collections;

public class Anagram {

  public static boolean anagramAnalyser(String input1, String input2) {
    ArrayList<Character> firstString = new ArrayList<>();
    ArrayList<Character> secondString = new ArrayList<>();

    for (int i = 0; i < input1.length(); i++) {
      if (input1.toLowerCase().charAt(i) != ' ') {
        firstString.add(input1.toLowerCase().charAt(i));
      }
    }

    for (int i = 0; i < input2.length(); i++) {
      if (input2.toLowerCase().charAt(i) != ' ') {
        secondString.add(input2.toLowerCase().charAt(i));
      }
    }

    Collections.sort(firstString);
    Collections.sort(secondString);

    if (input1.equalsIgnoreCase(input2)){
      return true;
    } else if (firstString.equals(secondString)){
      return true;
    } else if (input1.length() == 0 || input2.length() == 0) {
      return true;
    } else {
      return false;
    }
  }
}
