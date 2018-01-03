import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) {

    //Fill a list with at least 5 foxes, it's up to you how you name/create them!
    List<Fox> foxList = new ArrayList<>();

    Fox foxy1 = new Fox("Red fox", "red", "red" );
    Fox foxy2 = new Fox("Fennec fox", "fennec", "white" );
    Fox foxy3 = new Fox("Gray fox", "gray", "grey" );
    Fox foxy4 = new Fox("Tibetian fox", "tibetian", "sand" );
    Fox foxy5 = new Fox("Green fox", "pallida", "green" );
    Fox foxy6 = new Fox("Green fox", "green", "green" );

    foxList.add(foxy1);
    foxList.add(foxy2);
    foxList.add(foxy3);
    foxList.add(foxy4);
    foxList.add(foxy5);
    foxList.add(foxy6);

    List<Fox> greenFox = foxList.stream()
            .filter(f -> f.getColour().equalsIgnoreCase("green"))
            .filter(f -> f.getType().equalsIgnoreCase("pallida"))
            .collect(Collectors.toList());

    System.out.println(greenFox);
  }
}
