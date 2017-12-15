import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter a guess of a 4 digit number:");
    String userGuess = scanner.nextLine();

    CowsAndBulls newGame = new CowsAndBulls();
    newGame.guessThisGenerator();
    System.out.println(newGame.comperator(userGuess));
  }
}
