public class Pirate {
  int alcoholLevel;
  int howsItGoing;
  boolean alive;
  boolean passedOut;
  boolean parrot;

  public Pirate() {
    this.alcoholLevel = 10;
    this.howsItGoing = 0;
    this.alive = true;
    this.passedOut = false;
    this.parrot = false;
  }

  public Pirate(int alcoholLevel) {
    this.alcoholLevel = alcoholLevel;
  }

  public void drinkSomeRum() {
    if (alive) {
      this.alcoholLevel += 10;
    } else {
      System.out.println("he's dead");
    }
  }

  public void howsItGoingMate() {
    if (howsItGoing < 5 && alive) {
      System.out.println("Pour me anudder!");
      howsItGoing++;
    } else if (alive){
      System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
    } else {
      System.out.println("he's dead");
    }
  }

  public void die() {
    this.alive = false;
    this.parrot = false;
  }

  public void brawl(Pirate pirate1, Pirate pirate2) {
    int randomNumber = (int)(Math.random()*100);
    if (randomNumber <30 && pirate1.alive && pirate2.alive) {
            pirate1.die();
            pirate2.parrot = true;
    } else if (randomNumber >= 60 && pirate1.alive && pirate2.alive) {
      pirate2.die();
      pirate1.parrot = true;
    } else if (pirate1.alive && pirate2.alive) {
      pirate1.passedOut = true;
      pirate2.passedOut = true;
    } else {
      System.out.println("Cannot fight a dead pirate!");
    }
  }
}
