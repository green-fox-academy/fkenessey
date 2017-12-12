import java.util.ArrayList;
import java.util.List;

public class Farm {
  Animal[] listOfAnimals;

  public Farm() {
    this.listOfAnimals = new Animal[5];
    /*for (int i = 0; i < 5; i++) {
      this.listOfAnimals[i] = new Animal();
      this.listOfAnimals[i].hunger = 0;
      this.listOfAnimals[i].thirst = 0;
    }*/
  }

  public void breed(int i) {
    if (listOfAnimals[i] == null) {
      listOfAnimals[i] = new Animal();
      listOfAnimals[i].hunger = (int)(Math.random() * 100);
      listOfAnimals[i].thirst = (int)(Math.random() * 100);
    } else {
      System.out.println("Slot is not empty");
    }
  }

  public void slaughter() {
    int index = 0;
    int min = 0;
    for (int i = 0; i < listOfAnimals.length; i++) {
      if (listOfAnimals[i] != null) {
        min = listOfAnimals[i].hunger;
        break;
      } else {
        continue;
      }
    }
    for (int i = 0; i < listOfAnimals.length; i++) {
      for (int j = i + 1; j < listOfAnimals.length; j++) {
        if (listOfAnimals[i] == null || listOfAnimals[j] == null){
          continue;
        } else if (listOfAnimals[i].hunger <= listOfAnimals[j].hunger && listOfAnimals[i].hunger <= min) {
          index = i;
          min = listOfAnimals[i].hunger;
          continue;
        } else if (listOfAnimals[i].hunger > listOfAnimals[j].hunger && listOfAnimals[j].hunger <= min) {
          index = j;
          min = listOfAnimals[j].hunger;
        } else {
          continue;
        }
      }
    }
    listOfAnimals[index] = null;
  }

  @Override
  public String toString() {
    String output = "[ ";
    for (int i = 0; i < listOfAnimals.length; i++) {
      output += listOfAnimals[i] + ", ";
    }
    output += " ]";
    return output;
  }
}
