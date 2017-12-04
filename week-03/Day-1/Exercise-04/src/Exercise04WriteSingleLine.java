import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Exercise04WriteSingleLine {
  public static void main(String[] args) {
    // Open a file called "my-file.txt"
    // Write your name in it as a single line
    // If the program is unable to write the file,
    // then it should print an error message like: "Unable to write file: my-file.txt"
    try {
      Path filePath = Paths.get("my-file.txt");
      List<String> fileContent = Files.readAllLines(filePath);
      fileContent.add("Ferike");
      Files.write(filePath, fileContent);
    } catch (Exception problemsOnTheWay) {
      System.out.println("Unable to write file: my-file.txt");
    }
    try {
      Path theSameAgain = Paths.get("my-file.txt");
      List<String> fileToRead = Files.readAllLines(theSameAgain);
      System.out.println(fileToRead);
    } catch (Exception ifItDoesntWork) {
      System.out.println("Cannot read file");
    }
  }
}
