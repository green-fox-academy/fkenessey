import org.junit.Test;

import static org.junit.Assert.*;

public class ApplesTest {
  @Test
  public void getApple() throws Exception {
    Apples apples = new Apples();
    assertEquals("apple", apples.getApple());
  }

}