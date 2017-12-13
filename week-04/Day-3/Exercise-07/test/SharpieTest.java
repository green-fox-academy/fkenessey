import org.junit.Test;

import static org.junit.Assert.*;

public class SharpieTest {
  @Test
  public void use() throws Exception {
    Sharpie test1 = new Sharpie();
    test1.use();
    assertEquals(90, (int)(test1.inkAmount));
  }

  @Test
  public void SharpieColor() throws Exception {
    Sharpie test2 = new Sharpie();
    test2.color = "yellow";
    assertEquals("yellow", test2.color);
  }

  @Test
  public void SharpieWidth() throws Exception {
    Sharpie test3 = new Sharpie();
    test3.width = 25;
    assertEquals(25, (int)test3.width);
  }

  @Test
  public void SharpieInkAmount() throws Exception {
    Sharpie test4 = new Sharpie();
    test4.inkAmount = 50;
    assertEquals(50, (int)test4.inkAmount);
  }
}