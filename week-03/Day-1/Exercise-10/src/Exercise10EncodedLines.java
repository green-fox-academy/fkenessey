import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise10EncodedLines {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter the location of the file:");
    Path readPath = Paths.get(scanner.nextLine());
    List<String> contentOriginal = new ArrayList<>();
    List<String> contentNew = new ArrayList<>();
    try {
      contentOriginal = Files.readAllLines(readPath);
    } catch (Exception e) {
      System.out.println("Cannot read file");
    }
    for (int i = 0; i <contentOriginal.size() ; i++) {
      String newContent = "";
      for (int j = 0; j <contentOriginal.get(i).length(); j++) {
        int originalChar = Integer.valueOf(contentOriginal.get(i).charAt(j));
        int newChar = 0;
        if (originalChar == 32) {
          newChar = originalChar;
        } else {
          newChar = originalChar - 1;
        }
        newContent = newContent + String.valueOf(Character.toChars(newChar));
      }
      contentNew.add(i,newContent);
    }
    System.out.println(contentNew);
    System.out.println("Please enter the location to save the file:");
    Path savePath = Paths.get(scanner.nextLine());
    try {
      Files.write(savePath, contentNew);
    } catch (Exception e) {
      System.out.println("Error during writing file");
    }
  }
}
