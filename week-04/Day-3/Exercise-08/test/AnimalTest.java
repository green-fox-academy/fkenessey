import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalTest {

  Animal test1 = new Animal();

  @Test
  public void hunger1() throws Exception {
    assertEquals(50, test1.hunger);
  }

  @Test
  public void thirst1() throws Exception {
    assertEquals(50, test1.thirst);
  }

  @Test
  public void hunger2() throws Exception {
    test1.hunger = 55;
    assertEquals(55, test1.hunger);
  }

  @Test
  public void thirst() throws Exception {
    test1.thirst = 55;
    assertEquals(55, test1.thirst);
  }

  @Test
  public void eat() throws Exception {
    test1.eat();
    assertEquals(49, test1.hunger);
  }

  @Test
  public void drink() throws Exception {
    test1.drink();
    assertEquals(49, test1.thirst);
  }

  @Test
  public void play() throws Exception {
    test1.play();
    assertEquals(51, test1.hunger);
    assertEquals(51, test1.thirst);
  }

}