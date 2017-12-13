import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class CountLettersTest {
  @Test
  public void countLetters() {
    String input = "letters";
    /*HashMap<String, Integer> dictionary = new HashMap<>();
    dictionary.put("l", 1);
    dictionary.put("e", 2);
    dictionary.put("t", 2);
    dictionary.put("r", 1);
    dictionary.put("s", 1);*/
    CountLetters test1 = new CountLetters();
    test1.countLetters(input);
    assertEquals(1, test1.countLetters(input).get("s").intValue());

  }

}