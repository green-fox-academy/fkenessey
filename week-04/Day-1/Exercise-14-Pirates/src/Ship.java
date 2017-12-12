import java.util.ArrayList;
import java.util.List;

public class Ship {
  List<Pirate> crew;
  List<Pirate> captain;

  public Ship() {
    this.crew = new ArrayList<>();
    this.captain = new ArrayList<>();
  }

  public void fillShip(boolean captainPost, boolean crewPost, Ship ship, Pirate pirateIn) {
    if (captainPost) {
      ship.captain.add(pirateIn);
    } else if (crewPost) {
      ship.crew.add(pirateIn);
    } else {
      System.out.println("Please specify post");
    }
  }

  @Override
  public String toString() {
    return "";
  }
}
