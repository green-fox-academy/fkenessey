import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercise09 {
  public static void main(String[] args) {

    //Write a Stream Expression to convert a char array to a string!

    char[] test = {'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd', '!'};
    //String[] test2 = {"H", "e", "l", "l", "o"};

    String result = Stream.of(test)
            .map(c -> String.valueOf(c))
            .collect(Collectors.joining());

    System.out.println(result);
  }

}
