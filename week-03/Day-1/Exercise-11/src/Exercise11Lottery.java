import java.awt.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.List;

public class Exercise11Lottery {
  public static void main(String[] args) {
    // Create a method that find the 5 most common lottery numbers otos.csv

    Path readPath = Paths.get("file2.txt");
    List<String> content = new ArrayList<>();
    try {
      content = Files.readAllLines(readPath);
    } catch (Exception e) {
      System.out.println("Reading error");
    }

    String[] contentLineStrParts;
    ArrayList<Integer> lotteryNumbers = new ArrayList<>();
    for (int i = 0; i <content.size(); i++) {
      contentLineStrParts = (content.get(i)).split(",");
      for (int j = 11; j <16; j++) {
        lotteryNumbers.add(Integer.valueOf(contentLineStrParts[j]));
      }
    }


    ArrayList<Integer> amountOfEachNumberAL = new ArrayList<>();
    int[] amountOfEachNumber = new int[91];
    for (int h = 0; h < 90; h++) {
      amountOfEachNumber[h] = 0;
    }
    for (int g = 0; g <lotteryNumbers.size() ; g++) {
      for (int f = 0; f <90; f++) {
        if (lotteryNumbers.get(g) == f + 1) {
          amountOfEachNumber[f] = amountOfEachNumber[f] + 1;
        }
      }
    }
    for (int i = 0; i < 90; i++) {
      amountOfEachNumberAL.add(amountOfEachNumber[i]);
    }

    //Collections.frequency(lotteryNumbers, h);


    for (int d = 0; d < amountOfEachNumber.length; d++) {
      for (int s = 1; s < amountOfEachNumber.length - d; s++) {
        if (amountOfEachNumber[s - 1] > amountOfEachNumber[s]) {
          int temp = amountOfEachNumber[s];
          amountOfEachNumber[s] = amountOfEachNumber [s - 1];
          amountOfEachNumber [s - 1] = temp;
        }
      }
    }

    System.out.println("The 5 most common lottery numbers are:");
    ArrayList<String> topList = new ArrayList<>();
    String temp = "";
    for (int d = amountOfEachNumber.length-6; d < amountOfEachNumber.length; d++) {
      for (int i = 0; i <amountOfEachNumberAL.size(); i++) {
        if (amountOfEachNumber[d] == amountOfEachNumberAL.get(i)) {
          temp = temp + "," + String.valueOf(i);
        } else {
          continue;
        }
        topList.add(temp);
      }
      System.out.println(topList);
    }


    //Path writePath = Paths.get("file3.txt");
    //try {
    //  Files.write(writePath, splitContentLines);
    //} catch (Exception e) {
    //  System.out.println("Writing error");
    //}
  }
}
