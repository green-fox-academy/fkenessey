import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;


public class Exercise08ReversedLines {
  public static void main(String[] args) {
    // Create a method that decrypts reversed-lines.txt
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter file path:");
    Path filePath = Paths.get(scanner.nextLine());
    List<String> content = null;
    try {
      content = Files.readAllLines(filePath);
    } catch (Exception e) {
      System.out.println("Could not read file. Please check location again.");
    }
    for (int i = 0; i <content.size() ; i++) {
      String contentLine = content.get(i);
      String temp = "";
      for (int j = 0; j < contentLine.length() ; j++) {
        temp = temp + String.valueOf((contentLine.charAt(contentLine.length()-j-1)));
      }
      content.add(i, temp);
      content.remove(i+1);
    }
    System.out.println(content);
    System.out.println("Please enter a location for the file:");
    Path fileSaveAt = Paths.get(scanner.nextLine());
    try {
      Files.write(fileSaveAt, content);
    } catch (Exception e) {
      System.out.println("Could not write file");
    }
  }
}
