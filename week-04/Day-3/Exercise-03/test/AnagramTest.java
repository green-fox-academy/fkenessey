import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {
  @Test
  public void ifAnagram() {
    Anagram anagramTest = new Anagram();
    String input1 = "rail safety";
    String input2 = "fairy tales";
    assertTrue(anagramTest.ifAnagram(input1,input2));
  }

  @Test(expected = AssertionError.class)
  public void ifAnagramFails() {
    Anagram anagramTest = new Anagram();
    String input1 = "rail safety";
    String input2 = "fairy tale";
    assertTrue(anagramTest.ifAnagram(input1,input2));
  }
}