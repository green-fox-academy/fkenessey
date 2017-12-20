import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UniquesCharacter {
  public static void main(String[] args) {

    String inputString = "anagram";

    List<String> result = uniqueCharacters(inputString);

    System.out.println(result);

  }

  public static List<String> uniqueCharacters(String inputString) {

    List<String> outputCharacters = new ArrayList<>();

    for (int i = 0; i < inputString.length(); i++) {
      outputCharacters.add(String.valueOf(inputString.charAt(i)));
    }

    Collections.sort(outputCharacters);

    for (int i = 0; i < outputCharacters.size()-1; i++) {
      if (outputCharacters.get(i).equalsIgnoreCase(outputCharacters.get(i + 1))) {
        outputCharacters.removeIf(outputCharacters.get(i)::equals);
      }
    }

    return outputCharacters;

  }
}
