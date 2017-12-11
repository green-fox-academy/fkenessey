public class Dice {
  //    You have a Dice class which has 6 dice
  //    You can roll all of them with roll()
  //    Check the current rolled numbers with getCurrent()
  //    You can reroll with reroll()
  //    Your task is to get where all dice is a 6
  int[] dices = new int[6];

  public int[] roll() {
    for (int i = 0; i < dices.length; i++) {
      dices[i] = (int) (Math.random() * 6) + 1;
    }
    return dices;
  }

  public int[] getCurrent() {
    return dices;
  }

  public int getCurrent(int i) {
    return dices[i];
  }

  public void reroll() {
    for (int i = 0; i < dices.length; i++) {
      dices[i] = (int) (Math.random() * 6) + 1;
    }
  }

  public void reroll(int k) {
    dices[k] = (int) (Math.random() * 6) + 1;
  }

  @Override
  public String toString() {
    return "[" + dices[0] + ", " + dices[1] + ", " + dices[2] + ", " + dices[3] + ", " + dices[4] + ", " + dices[5] + "]";
  }

  public static void main(String[] args) {
    Dice myDice = new Dice();
    myDice.roll();
    myDice.getCurrent();
    System.out.println("The initial roll is: \n" + myDice);
    myDice.reroll();
    System.out.println("The next reroll is : \n" + myDice);
    System.out.println("Now the for-while loop starts.");
    for (int i = 0; i < 5; i++) {
      while (myDice.getCurrent()[i] != myDice.getCurrent()[i + 1]) {
        myDice.reroll(i + 1);
        System.out.println("Current situation: \n" + myDice);
      }
    }
  }
}
