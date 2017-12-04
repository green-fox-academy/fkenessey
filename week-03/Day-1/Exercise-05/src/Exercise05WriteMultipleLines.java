import java.nio.file.Paths;
import java.nio.file.Path;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise05WriteMultipleLines {
  public static void main(String[] args) {
    // Create a function that takes 3 parameters: a path, a word and a number,
    // than it should write to a file.
    // The path parameter should be a string, that describes the location of the file.
    // The word parameter should be a string, that will be written to the file as lines
    // The number paramter should describe how many lines the file should have.
    // So if the word is "apple" and the number is 5, than it should write 5 lines
    // to the file and each line should be "apple"
    // The function should not raise any error if it could not write the file.
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter the location of the file: (e.g. ~/Documents/my-file.txt)");
    String filePath = scanner.nextLine();
    System.out.println("Please enter a word which will be written into the file: ");
    String wordToBeWrittenToFile = scanner.nextLine();
    System.out.println("Please enter the location of the file: (e.g. ~/Documents/my-file.txt)");
    int numberOfLinesToBeWrittenToFile = scanner.nextInt();
    try {
      List<String> contentToBeWrittenToFile = new ArrayList();
      for (int i = 0; i <numberOfLinesToBeWrittenToFile; i++) {
        contentToBeWrittenToFile.add(i, wordToBeWrittenToFile);
      }
      Path filePathToBeUsed = Paths.get(filePath);
      Files.write(filePathToBeUsed, contentToBeWrittenToFile);
    } catch (Exception someThingWentWrong) {

    }

  }
}
