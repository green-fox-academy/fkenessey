import java.util.ArrayList;
import java.util.HashMap;

public class CountLetters {
  private String input;

  public CountLetters() {
  }

  public CountLetters(String input) {
    this.input = input;
  }

  public HashMap<String, Integer> countLetters(String letters) {
    HashMap<String, Integer> dictionary = new HashMap<>();
    for (int i = 0; i < letters.length(); i++) {
      if (dictionary.containsKey(String.valueOf(letters.charAt(i)))) {
        dictionary.put(String.valueOf(letters.charAt(i)), dictionary.get(String.valueOf(letters.charAt(i))) + 1);
      } else {
        dictionary.put(String.valueOf(letters.charAt(i)), 1);
      }
    }
    return dictionary;
  }
}
