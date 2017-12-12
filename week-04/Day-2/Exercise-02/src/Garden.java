import java.util.ArrayList;
import java.util.List;

public class Garden {
  public static void main(String[] args) {
    List<Plant> myGarden;

    Flower yellow = new Flower("yellow");
    Flower blue = new Flower("blue");
    Tree purple = new Tree("purple");
    Tree orange = new Tree("orange");
    myGarden = new ArrayList<>();

    myGarden.add(yellow);
    myGarden.add(blue);
    myGarden.add(purple);
    myGarden.add(orange);

    showStatusOfGarden(myGarden);
    waterGarden(myGarden, 40);
    System.out.println("Watering with 40");
    showStatusOfGarden(myGarden);
    waterGarden(myGarden, 70);
    System.out.println("Watering with 70");
    showStatusOfGarden(myGarden);
  }

  public static void showStatusOfGarden(List<Plant> myGarden) {
    for (int i = 0; i < myGarden.size(); i++) {
      if (myGarden.get(i).isNeedsWater()) {
        System.out.println("The " + (myGarden.get(i).getName()) + " Flower needs water");
      } else {
        System.out.println("The " + (myGarden.get(i).getName()) + " Flower doesnt needs water");
      }
    }
    System.out.println("\n");
  }

  public static void waterGarden(List<Plant> myGarden, int amount) {
    int toBeWatered = 0;
    for (int i = 0; i < myGarden.size(); i++) {
      if (myGarden.get(i).isNeedsWater()) {
        toBeWatered++;
      } else {
        continue;
      }
    }

    for (int i = 0; i < myGarden.size(); i++) {
      if (myGarden.get(i).isNeedsWater()) {
        myGarden.get(i).setWater(amount / toBeWatered);
      } else {
        continue;
      }
    }
  }

}

