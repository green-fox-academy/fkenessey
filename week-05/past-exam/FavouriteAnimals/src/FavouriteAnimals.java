import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FavouriteAnimals {
  public static void main(String[] args) {

    String filePath = "favourites.txt";
    List<String> content;

    try {
      if (args[0].length() > 0) {

        content = readFile(filePath);

        content.add(args[0]);
        writeFile(content, filePath);
      }
    } catch (Exception e) {
      System.out.println("```java FavouriteAnimals " + readFile(filePath) + "```");
    }
  }

  public static List readFile(String fileLocation) {
    Path filePath = Paths.get(fileLocation);
    List<String> contentLines = new ArrayList<>();

    try {
      contentLines = Files.readAllLines(filePath);
    } catch (IOException e) {
      System.out.println("File reading error");
    }
    return contentLines;
  }

  public static void writeFile(List content, String fileLocation) {
    Path filePath = Paths.get(fileLocation);

    try {
      Files.write(filePath, content);
    } catch (IOException e) {
      System.out.println("File writing error");
    }
  }
}
