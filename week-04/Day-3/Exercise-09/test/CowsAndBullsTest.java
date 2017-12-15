import org.junit.Test;

import static org.junit.Assert.*;

public class CowsAndBullsTest {

  CowsAndBulls game1 = new CowsAndBulls();

  @Test
  public void inGame() throws Exception {
    assertEquals(true, game1.isInGame());
  }

  @Test
  public void guessCount() throws Exception {
    assertEquals(0, game1.getGuessCount());
  }

  @Test
  public void guessThis() throws Exception {
    assertEquals("", game1.getGuessThis());
  }

  @Test
  public void digitLength() throws Exception {
    assertEquals(4, game1.getDigitLength());
  }

  @Test
  public void guessThisGenerator() throws Exception {
    game1.guessThisGenerator();
    assertEquals(4, game1.getGuessThis().length());
  }

 /* @Test
  public void comperator1() throws Exception {
    game1.setGuessThis("1111");
    assertEquals(" cow  cow  cow  cow ", game1.comperator("1111"));
  }

  @Test
  public void comperator2() throws Exception {
    game1.setGuessThis("2222");
    assertEquals("1111", game1.comperator("1111"));
  }*/

  @Test
  public void comperator3() throws Exception {
    game1.setGuessThis("4321");
    assertEquals(" bull  bull  bull  bull ", game1.comperator("1234"));
  }

}