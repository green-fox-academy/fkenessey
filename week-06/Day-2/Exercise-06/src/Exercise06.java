import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Exercise06 {
  public static void main(String[] args) {

    //Write a Stream Expression to find the frequency of characters in a given string!

    String test = "Hello World!";

    Map<String, Long> freqChars = Arrays.stream(test.toLowerCase().split(""))
            .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

    System.out.println(freqChars);

  }
}
