package main;

public class TennisGame3 implements TennisGame {

  private int player1Score;
  private int player2Score;
  private String player1Name;
  private String player2Name;

  public TennisGame3(String player1Name, String player2Name) {
    this.player1Name = player1Name;
    this.player2Name = player2Name;
  }

  public String getScore() {
    String scoreToReturn;
    if (player1Score < 4 && player2Score < 4) {
      String[] scoreOptionsArray = {"Love", "Fifteen", "Thirty", "Forty"};
      scoreToReturn = scoreOptionsArray[player1Score];
      return (player1Score == player2Score) ? scoreToReturn + "-All" : scoreToReturn + "-"
              + scoreOptionsArray[player2Score];
    } else {
      if (player1Score == player2Score) {
        return "Deuce";
      }
      scoreToReturn = player1Score > player2Score ? player1Name : player2Name;
      return ((player1Score - player2Score)*(player1Score - player2Score) == 1) ? "Advantage " + scoreToReturn
              : "Win for " + scoreToReturn;
    }
  }

  public void wonPoint(String playerName) {
    if (playerName == "player1") {
      this.player1Score += 1;
    } else {
      this.player2Score += 1;
    }
  }

}
