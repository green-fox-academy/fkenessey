import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise07 {
  public static void main(String[] args) {

    //Write a Stream Expression to find the strings which starts with A and ends with I in the following array:
    ArrayList<String> numbers = new ArrayList<>(Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH",
            "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS"));

    List<String> stringsToFind = numbers.stream()
            .filter(s -> s.charAt(0) == 'A')
            .filter(s -> s.charAt(s.length() - 1) == 'I')
            .collect(Collectors.toList());

    System.out.println(stringsToFind);
  }
}
