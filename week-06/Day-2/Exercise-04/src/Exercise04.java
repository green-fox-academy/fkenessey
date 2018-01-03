import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Exercise04 {
  public static void main(String[] args) {

    //Write a Stream Expression to find which number squared value is more then 20 from the following array:
    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(3, 9, 2, 8, 6, 5));

    System.out.println(numbers.stream()
            .filter(n -> n * n > 20)
            .collect(Collectors.toList()));
  }
}
