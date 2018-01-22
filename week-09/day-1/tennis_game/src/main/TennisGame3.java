package main;

public class TennisGame3 implements TennisGame {

  private int player1ScoreInt;
  private int player2ScoreInt;
  private String player1NameString;
  private String player2NameString;

  public TennisGame3(String player1NameString, String player2NameString) {
    this.player1NameString = player1NameString;
    this.player2NameString = player2NameString;
  }

  public String getScore() {
    String scoreToReturnString;
    if (player1ScoreInt < 4 && player2ScoreInt < 4) {
      String[] scoreOptionsArray = {"Love", "Fifteen", "Thirty", "Forty"};
      scoreToReturnString = scoreOptionsArray[player1ScoreInt];
      return (player1ScoreInt == player2ScoreInt) ? scoreToReturnString + "-All" : scoreToReturnString + "-"
              + scoreOptionsArray[player2ScoreInt];
    } else {
      if (player1ScoreInt == player2ScoreInt) {
        return "Deuce";
      }
      scoreToReturnString = player1ScoreInt > player2ScoreInt ? player1NameString : player2NameString;
      return ((player1ScoreInt - player2ScoreInt)*(player1ScoreInt - player2ScoreInt) == 1) ? "Advantage " + scoreToReturnString
              : "Win for " + scoreToReturnString;
    }
  }

  public void wonPoint(String playerName) {
    if (playerName == "player1") {
      this.player1ScoreInt += 1;
    } else {
      this.player2ScoreInt += 1;
    }
  }

}
