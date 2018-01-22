package main;

public class TennisGame2 implements TennisGame
{
  public int player1ScoreInt = 0;
  public int player2ScoreInt = 0;

  public String player1ResultString = "";
  public String player2ResultString = "";
  private String player1NameString;
  private String player2NameString;

  public TennisGame2(String player1NameString, String player2NameString) {
    this.player1NameString = player1NameString;
    this.player2NameString = player2NameString;
  }

  public String getScore(){
    String scoreToReturnString = "";
    if (player1ScoreInt == player2ScoreInt && player1ScoreInt < 4) {
      if (player1ScoreInt == 0) {
        scoreToReturnString = "Love";
      } else if (player1ScoreInt == 1) {
        scoreToReturnString = "Fifteen";
      } else if (player1ScoreInt == 2) {
        scoreToReturnString = "Thirty";
      } else if (player1ScoreInt == 3) {
        scoreToReturnString = "Forty";
        scoreToReturnString += "-All";
      }
    } else if (player1ScoreInt == player2ScoreInt && player1ScoreInt > 3) {
      scoreToReturnString = "Deuce";
    } else if (player1ScoreInt > 0 && player2ScoreInt == 0) {
      if (player1ScoreInt == 1) {
        scoreToReturnString = "Fifteen";
      } else if (player1ScoreInt == 2) {
        scoreToReturnString = "Thirty";
      } else if (player1ScoreInt == 3) {
        scoreToReturnString = "Forty";
      }
      scoreToReturnString = "- Love";
    } else if (player2ScoreInt > 0 && player1ScoreInt ==0) {
      if (player2ScoreInt == 1) {
        scoreToReturnString = "Fifteen";
      } else if (player2ScoreInt == 2) {
        scoreToReturnString = "Thirty";
      } else if (player2ScoreInt == 3) {
        scoreToReturnString = "Forty";
      }
      scoreToReturnString = "Love -" + scoreToReturnString;
    } else if (player1ScoreInt > player2ScoreInt && player1ScoreInt < 4) {
      if (player1ScoreInt == 2) {
        player1ResultString = "Thirty";
      } else if (player1ScoreInt == 3) {
        player1ResultString = "Forty";
      } else if (player2ScoreInt == 1) {
        player2ResultString = "Fifteen";
      } else if (player2ScoreInt == 2) {
        player2ResultString = "Thirty";
      }
      scoreToReturnString = player1ResultString + "-" + player2ResultString;
    } else if (player2ScoreInt > player1ScoreInt && player2ScoreInt < 4) {
      if (player2ScoreInt == 2) {
        player2ResultString = "Thirty";
      } else if (player2ScoreInt == 3) {
        player2ResultString = "Forty";
      } else if (player1ScoreInt == 1) {
        player1ResultString = "Fifteen";
      } else if (player1ScoreInt == 2) {
        player1ResultString = "Thirty";
      }
      scoreToReturnString = player1ResultString + "-" + player2ResultString;
    } else if (player1ScoreInt > player2ScoreInt && player2ScoreInt >= 3) {
      scoreToReturnString = "Advantage player1";
    } else if (player2ScoreInt > player1ScoreInt && player1ScoreInt >= 3) {
      scoreToReturnString = "Advantage player2";
    } else if (player1ScoreInt >=4 && player2ScoreInt >=0 && (player1ScoreInt - player2ScoreInt)>=2) {
      scoreToReturnString = "Win for player1";
    } else if (player2ScoreInt >=4 && player1ScoreInt >=0 && (player2ScoreInt - player1ScoreInt)>=2) {
      scoreToReturnString = "Win for player2";
    }
    return scoreToReturnString;
  }

  public void increasePlayer1ScoreBy(int times){

    for (int i = 0; i < times; i++)
    {
      increasePlayer1ScoreByOne();
    }
  }

  public void increasePlayer2ScoreBy(int times){

    for (int i = 0; i < times; i++)
    {
      increasePlayer2ScoreByOne();
    }
  }

  public void increasePlayer1ScoreByOne(){
    player1ScoreInt++;
  }

  public void increasePlayer2ScoreByOne(){
    player2ScoreInt++;
  }

  public void wonPoint(String player) {
    if (player == "player1")
      increasePlayer1ScoreByOne();
    else
      increasePlayer2ScoreByOne();
  }
}
