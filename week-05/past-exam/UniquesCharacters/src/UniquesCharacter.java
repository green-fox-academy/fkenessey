import java.util.ArrayList;
import java.util.List;

public class UniquesCharacter {
  public static void main(String[] args) {

    String inputString = "anagram";

    List<String> result = uniqueCharacters(inputString);

    System.out.println(result);
  }

  public static List<String> uniqueCharacters(String inputString) {

    List<String> outputCharacters = new ArrayList<>();
    ArrayList<Character> characterRegister = new ArrayList<>();

    for (int i = 0; i < inputString.length(); i++) {
      if ((inputString.lastIndexOf(inputString.charAt(i)) != i) || (characterRegister.contains(inputString.charAt(i)))) {
        characterRegister.add(inputString.charAt(i));
        continue;
      } else {
         outputCharacters.add(String.valueOf(inputString.charAt(i)));
      }
    }
    return outputCharacters;
  }
}
