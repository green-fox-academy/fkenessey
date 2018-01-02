package ToDo;

import java.util.ArrayList;
import java.util.Collections;

public class Fleet implements Printable{

  private ArrayList<Thing> things;

  public Fleet() {
    things = new ArrayList<>();
  }

  public void add(Thing thing) {
    things.add(thing);
  }

  public void sort() {
    Collections.sort(things);
  }

  @Override
  public void printAllFields() {
    for(Thing t : things) {
      t.printAllFields();
    }
  }

  @Override
  public String toString() {
    String result = "";
    for(int i = 0; i < things.size(); i++) {
      result += (i+1) + ". " + things.get(i) + "\n";
    }
    return result;
  }
}
