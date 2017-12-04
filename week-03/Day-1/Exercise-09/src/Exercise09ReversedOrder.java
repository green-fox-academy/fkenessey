import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise09ReversedOrder {
  public static void main(String[] args) {
    // Create a method that decrypts reversed-order.txt
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter the location of the file:");
    Path filePath = Paths.get(scanner.nextLine());
    List<String> content = new ArrayList<>();
    try {
      content = Files.readAllLines(filePath);
    } catch (Exception e) {
      System.out.println("Error with loading file. Please check location!");
    }
    ArrayList<String> contentNew = new ArrayList<>();
    for (int i = 0; i <content.size(); i++) {
      contentNew.add(content.get(content.size()-i-1));
    }
    System.out.println(contentNew);
    System.out.println("Please enter location for new file:");
    Path savePath = Paths.get(scanner.nextLine());
    try {
      Files.write(savePath, contentNew);
    } catch (Exception e) {
      System.out.println("Error during saving file");
    }
  }
}
