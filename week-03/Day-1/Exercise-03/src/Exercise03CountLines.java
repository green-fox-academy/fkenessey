import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Exercise03CountLines {
  public static void main(String[] args) {
    // Write a function that takes a filename as string,
    // then returns the number of lines the file contains.
    // It should return zero if it can't open the file, and
    // should not raise any error.

    try {
      Path pathToMyFile = Paths.get("my-file.txt");
      List<String> nameOfMyFile = Files.readAllLines(pathToMyFile);
      int linesInMyFile = nameOfMyFile.size();
      System.out.println(nameOfMyFile);
      System.out.print(linesInMyFile);
    } catch (Exception ifThingsTurnOutOoops) {
      System.out.println("0");
    }
  }
}
