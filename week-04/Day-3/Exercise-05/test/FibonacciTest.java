import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciTest {
  @Test
  public void fibonacciCount() throws Exception {
    Fibonacci test1 = new Fibonacci();
    int[] input = {0, 1, 2, 3, 4, 5, 6, 7, 8};
    int[] output = {0, 1, 1, 2, 3, 5, 8, 13, 21};

    if (input.length != output.length) {
      System.out.println("Incorrect input!");
    }

    for (int i = 0; i < input.length; i++) {
      assertEquals(output[i], test1.fibonacciCount(input[i]));
    }
  }
}