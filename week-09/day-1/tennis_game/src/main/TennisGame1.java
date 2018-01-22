package main;

import java.util.Objects;

public class TennisGame1 implements TennisGame {

  private int inGameScore1 = 0;
  private int inGameScore2 = 0;
  private String player1Name;
  private String player2Name;

  public TennisGame1(String player1Name, String player2Name) {
    this.player1Name = player1Name;
    this.player2Name = player2Name;
  }

  public void wonPoint(String playerName) {
    if (Objects.equals(playerName, "player1"))
      inGameScore1 += 1;
    else
      inGameScore2 += 1;
  }

  public String getScore() {
    String scoreToReturn = "";
    int tempScore;
    int differenceInScores = inGameScore1 - inGameScore2;
    if (differenceInScores == 0) {
      switch (inGameScore1) {
        case 0:
          scoreToReturn = "Love-All";
          break;
        case 1:
          scoreToReturn = "Fifteen-All";
          break;
        case 2:
          scoreToReturn = "Thirty-All";
          break;
        case 3:
          scoreToReturn = "Forty-All";
          break;
        default:
          scoreToReturn = "Deuce";
          break;
      }
    } else if (inGameScore1 >= 4 || inGameScore2 >= 4) {
      if (differenceInScores == 1) {
        scoreToReturn ="Advantage player1";
      } else if (differenceInScores == -1) {
        scoreToReturn ="Advantage player2";
      } else if (differenceInScores >= 2) {
        scoreToReturn = "Win for player1";
      } else scoreToReturn ="Win for player2";
    } else {
      for (int i=1; i < 3; i++) {
        if (i==1) {
          tempScore = inGameScore1;
        } else {
          scoreToReturn += "-"; tempScore = inGameScore2;
        } switch(tempScore) {
          case 0:
            scoreToReturn += "Love";
            break;
          case 1:
            scoreToReturn += "Fifteen";
            break;
          case 2:
            scoreToReturn += "Thirty";
            break;
          case 3:
            scoreToReturn += "Forty";
            break;
        }
      }
    }
    return scoreToReturn;
  }
}
