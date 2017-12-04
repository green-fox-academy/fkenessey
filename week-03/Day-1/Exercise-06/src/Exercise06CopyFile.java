import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise06CopyFile {
  public static void main(String[] args) {
    // Write a function that copies a file to an other
    // It should take the filenames as parameters
    // It should return a boolean that shows if the copy was successful
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter the location of the file to be copied:");
    String filePathToBeCopied = scanner.nextLine();
    System.out.println("Please enter the location of the file to be written:");
    String filePathToBeWritten = scanner.nextLine();
    Path pathToBeCopied = Paths.get(filePathToBeCopied);
    Path pathToBeWritten = Paths.get(filePathToBeWritten);
    boolean successfulCopy = true;
    try {
      List<String> contentToBeCopied = new ArrayList<>();
      contentToBeCopied = Files.readAllLines(pathToBeCopied);
      Files.write(pathToBeWritten, contentToBeCopied);
    } catch (Exception somethingWentWrong) {
      successfulCopy = false;
    }
    if (successfulCopy) {
      System.out.println("The copy was successful!");
    } else {
      System.out.println("The copy could not be made!");
    }
  }
}
