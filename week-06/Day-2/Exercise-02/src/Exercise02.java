import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise02 {
  public static void main(String[] args) {

    //Write a Stream Expression to get the average value of the odd numbers from the following array:
   ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));

    System.out.println(numbers.stream()
            .filter(n -> Math.abs(n) % 2 == 1)
            .collect(Collectors.averagingInt(n -> n)));

    System.out.println(numbers.stream()
            .filter(n -> Math.abs(n) % 2 == 1)
            .mapToDouble(n -> n)
            .average());


  }
}
