import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class SumTest {

  ArrayList<Integer> testInputInt = new ArrayList<>(Arrays.asList(1,2,3));
  int expectedOutput = 6;

  @Test
  public void Sum() {
    Sum sum1 = new Sum();
    assertEquals(expectedOutput, sum1.sum(testInputInt));
  }

}