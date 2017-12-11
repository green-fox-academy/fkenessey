import java.util.ArrayList;
import java.util.List;

public class SharpieSet {
  List<Sharpie> sharpies;

  public SharpieSet () {
    this.sharpies = new ArrayList<>();
  }

  /*public void addToSharpieSet() {
    Sharpie newsharpie = new Sharpie();
    this.sharpies.add(newsharpie.addSharpie());
  }*/

  public int countUsable() {
    int countOfUsableInt = 0;
    for (int i = 0; i < sharpies.size(); i++) {
      if (sharpies.get(i).inkAmount > 0) {
        countOfUsableInt++;
        continue;
      } else {
        continue;
      }
    }
    return countOfUsableInt;
  }

  public void removeTrash() {
    for (int j = 0; j < sharpies.size(); j++) {
      if (sharpies.get(j).inkAmount <= 0) {
        sharpies.remove(j);
      }
    }
  }

  @Override
  public String toString() {
    String output = "[";
    for (int i = 0; i < output.length(); i++) {
      output += "\n" + sharpies.get(i);
    }
    return output + "]";
  }
}
