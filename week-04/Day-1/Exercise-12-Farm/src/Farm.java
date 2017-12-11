import java.util.ArrayList;
import java.util.List;

public class Farm {
  Animal[] listOfAnimals;

  public Farm() {
    Animal[] listOfAnimals = new Animal[5];
    for (int i = 0; i < listOfAnimals.length; i++) {
      listOfAnimals[i] = new Animal();
    }
  }

  public void breed(int i) {
    if (listOfAnimals[i] == null) {
      listOfAnimals[i].hunger = (int)(Math.random() * 100);
      listOfAnimals[i].thirst = (int)(Math.random() * 100);
    } else {
      System.out.println("Slot is not empty");
    }
  }

  public void slaughter() {
    for (int i = 0; i < listOfAnimals.length; i++) {
      for (int j = i + 1; j < listOfAnimals.length; j++) {
        if (listOfAnimals[i].hunger <= listOfAnimals[j].hunger) {
          continue;
        } else {
          Animal temp = null;
          temp = listOfAnimals[i];
          listOfAnimals[i] = listOfAnimals[j];
          listOfAnimals[j] = temp;
          continue;
        }
      }
    }
    listOfAnimals[0] = null;
  }

  @Override
  public String toString() {
    return "[ " + listOfAnimals[0] + " " + listOfAnimals[1] + " " + listOfAnimals[2]+ " " + listOfAnimals[3]+ " " +
            listOfAnimals[4]+ " " + listOfAnimals[5]+ " " + listOfAnimals[6]+ " " + listOfAnimals[7]+ " " +
            listOfAnimals[8]+ " " + listOfAnimals[9] + " ]";
  }
}
