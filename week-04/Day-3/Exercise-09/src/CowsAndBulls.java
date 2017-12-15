import java.util.Scanner;

public class CowsAndBulls {

  private boolean inGame;
  private int guessCount;
  private String guessThis;
  private int digitLength;

  public CowsAndBulls() {
    this.inGame = true;
    this.guessCount = 0;
    this.guessThis = "";
    this.digitLength = 4;
  }

  public boolean isInGame() {
    return inGame;
  }

  public int getGuessCount() {
    return guessCount;
  }

  public String getGuessThis() {
    return guessThis;
  }

  public int getDigitLength() {
    return digitLength;
  }

  public void setInGame(boolean inGame) {
    this.inGame = inGame;
  }

  public void setGuessCount(int guessCount) {
    this.guessCount = guessCount;
  }

  public void setGuessThis(String guessThis) {
    this.guessThis = guessThis;
  }

  public void setDigitLength(int digitLength) {
    this.digitLength = digitLength;
  }

  public void guessThisGenerator() {
    for (int i = 0; i < digitLength; i++) {
      guessThis = guessThis + String.valueOf((int)Math.random() * 10);
    }
  }

  public String comperator(String input) {
    String output = "";
    if (input.length() != guessThis.length()) {
      return "Error";
    } else {
      for (int i = 0; i < input.length(); i++) {
        for (int j = 0; j < guessThis.length(); j++) {
          if (input.substring(i, i + 1).contains(guessThis.substring(j, j + 1))) {
            output += " cow ";
            break;
          } else if (guessThis.contains(input.substring(i, i + 1))) {
            output += " bull ";
            guessThis.replace(input.substring(i, i + 1), "");
            input.replace(input.substring(i, i + 1), "");
            break;
          } else if (j == guessThis.length() - 1) {
            output = output + input.substring(i, i + 1);
          } else {
            continue;
          }
        }

      }
    }
    return output;
  }
}
