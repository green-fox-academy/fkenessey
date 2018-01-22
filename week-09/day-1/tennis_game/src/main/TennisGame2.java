package main;

public class TennisGame2 implements TennisGame
{
  public int player1Score = 0;
  public int player2Score = 0;

  public String player1ResultString = "";
  public String P2res = "";
  private String player1Name;
  private String player2Name;

  public TennisGame2(String player1Name, String player2Name) {
    this.player1Name = player1Name;
    this.player2Name = player2Name;
  }

  public String getScore(){
    String scoreToReturnString = "";
    if (player1Score == player2Score && player1Score < 4)
    {
      if (player1Score == 0)
        scoreToReturnString = "Love";
      if (player1Score == 1)
        scoreToReturnString = "Fifteen";
      if (player1Score == 2)
        scoreToReturnString = "Thirty";
      if (player1Score == 3)
        scoreToReturnString = "Forty";
      scoreToReturnString += "-All";
    }
    if (player1Score == player2Score && player1Score >3)
      scoreToReturnString = "Deuce";

    if (player1Score > 0 && player2Score == 0)
    {
      if (player1Score ==1)
        player1ResultString = "Fifteen";
      if (player1Score ==2)
        player1ResultString = "Thirty";
      if (player1Score ==3)
        player1ResultString = "Forty";

      P2res = "Love";
      scoreToReturnString = player1ResultString + "-" + P2res;
    }
    if (player2Score > 0 && player1Score ==0)
    {
      if (player2Score ==1)
        P2res = "Fifteen";
      if (player2Score ==2)
        P2res = "Thirty";
      if (player2Score ==3)
        P2res = "Forty";

      player1ResultString = "Love";
      scoreToReturnString = player1ResultString + "-" + P2res;
    }

    if (player1Score > player2Score && player1Score < 4)
    {
      if (player1Score ==2)
        player1ResultString ="Thirty";
      if (player1Score ==3)
        player1ResultString ="Forty";
      if (player2Score ==1)
        P2res="Fifteen";
      if (player2Score ==2)
        P2res="Thirty";
      scoreToReturnString = player1ResultString + "-" + P2res;
    }
    if (player2Score > player1Score && player2Score < 4)
    {
      if (player2Score ==2)
        P2res="Thirty";
      if (player2Score ==3)
        P2res="Forty";
      if (player1Score ==1)
        player1ResultString ="Fifteen";
      if (player1Score ==2)
        player1ResultString ="Thirty";
      scoreToReturnString = player1ResultString + "-" + P2res;
    }

    if (player1Score > player2Score && player2Score >= 3)
    {
      scoreToReturnString = "Advantage player1";
    }

    if (player2Score > player1Score && player1Score >= 3)
    {
      scoreToReturnString = "Advantage player2";
    }

    if (player1Score >=4 && player2Score >=0 && (player1Score - player2Score)>=2)
    {
      scoreToReturnString = "Win for player1";
    }
    if (player2Score >=4 && player1Score >=0 && (player2Score - player1Score)>=2)
    {
      scoreToReturnString = "Win for player2";
    }
    return scoreToReturnString;
  }

  public void SetP1Score(int number){

    for (int i = 0; i < number; i++)
    {
      P1Score();
    }

  }

  public void SetP2Score(int number){

    for (int i = 0; i < number; i++)
    {
      P2Score();
    }

  }

  public void P1Score(){
    player1Score++;
  }

  public void P2Score(){
    player2Score++;
  }

  public void wonPoint(String player) {
    if (player == "player1")
      P1Score();
    else
      P2Score();
  }

  public void ScoringRule1()
  if (player1Score ==1)
  player1ResultString = "Fifteen";
      if (player1Score ==2)
  player1ResultString = "Thirty";
      if (player1Score ==3)
  player1ResultString = "Forty";

  P2res = "Love";
}
