import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class UniquesCharacterTest {
  @Test
  public void uniqueCharacters() throws Exception {

    List<String> answer = new ArrayList<>(Arrays.asList("n", "g", "r", "m"));
    String input = "anagram";

    assertEquals(answer, UniquesCharacter.uniqueCharacters(input));
  }

  @Test
  public void uniqueCharacters2() throws Exception {

    List<String> answer = new ArrayList<>(Arrays.asList("n", "g", "r", "m"));
    String input = "AnagramA";

    assertEquals(answer, UniquesCharacter.uniqueCharacters(input));
  }

  @Test
  public void uniqueCharacters3() throws Exception {

    List<String> answer = new ArrayList<>(Arrays.asList("n", "g", "r", "m"));
    String input = "AanaagraamA";

    assertEquals(answer, UniquesCharacter.uniqueCharacters(input));
  }
}