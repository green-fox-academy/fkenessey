import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {

  @Test
  void should_returnFalse_when_wordsAreNotTheSame() {
    String string1Input = "rail";
    String string2Input = "riil";

    boolean expectedResult = false;

    assertEquals(expectedResult, Anagram.anagramAnalyser(string1Input, string2Input));
  }

  @Test
  void should_returnTrue_when_wordsAreTheSame() {
    String string1Input = "rail";
    String string2Input = "rail";

    boolean expectedResult = true;

    assertEquals(expectedResult, Anagram.anagramAnalyser(string1Input, string2Input));
  }

  @Test
  void should_returnTrue_when_wordsAreTheSameCaseInsensitive() {
    String string1Input = "rail";
    String string2Input = "Rail";

    boolean expectedResult = true;

    assertEquals(expectedResult, Anagram.anagramAnalyser(string1Input, string2Input));
  }

  @Test
  void should_returnTrue_when_wordsAreAnagrams() {
    String string1Input = "rail";
    String string2Input = "liar";

    boolean expectedResult = true;

    assertEquals(expectedResult, Anagram.anagramAnalyser(string1Input, string2Input));
  }

  @Test
  void should_returnTrue_when_wordsAreAnagramsInsensitiveCase() {
    String string1Input = "Rail";
    String string2Input = "Liar";

    boolean expectedResult = true;

    assertEquals(expectedResult, Anagram.anagramAnalyser(string1Input, string2Input));
  }

  @Test
  void should_returnTrue_when_oneStringIsEmpty() {
    String string1Input = "";
    String string2Input = "Liar";

    boolean expectedResult = true;

    assertEquals(expectedResult, Anagram.anagramAnalyser(string1Input, string2Input));
  }

  @Test
  void should_returnTrue_when_AnagramsWithDifferentStringLengths() {
    String string1Input = "William Shakespeare";
    String string2Input = "I am a weakish speller";

    boolean expectedResult = true;

    assertEquals(expectedResult, Anagram.anagramAnalyser(string1Input, string2Input));
  }
}