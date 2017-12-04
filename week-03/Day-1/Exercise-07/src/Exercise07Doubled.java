import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Exercise07Doubled {
  public static void main(String[] args) {
    // Create a method that decrypts the duplicated-chars.txt
    Path filePath = Paths.get("duplicated-chars.txt");
    List<String> content = new ArrayList<>();
    List<String> contentNew = new ArrayList<>();
    try {
      content = Files.readAllLines(filePath);
    } catch (Exception e1) {
      System.out.println("Could not read file. Please check location again.");
    }
    for (int i = 0; i <content.size() ; i++) {
      String contentLine = content.get(i);
      String contentLineNew = "";
      for (int j = 0; j <contentLine.length()-1 ; j++) {
        if ((contentLine.charAt(j) != contentLine.charAt(j + 1))) {
          contentLineNew = contentLineNew + contentLine.charAt(j);
        }
      }
      contentNew.add(i, contentLineNew);
    }
    try {
      Files.write(filePath, contentNew);
    } catch (Exception e2) {
      System.out.println("Error. Could not write file.");
    }
  }
}
