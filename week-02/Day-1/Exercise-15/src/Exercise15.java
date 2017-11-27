// Loads the scanner to the file
import java.util.Scanner;

public class Exercise15 {
    public static void main(String[] args) {
        // Creates a scanner
        Scanner scanner = new Scanner(System.in);

        // Write a program that asks for an integer that is a distance in kilometers,
        // then it converts that value to miles and prints it
        // The program stops and waits for user input and to press enter
        System.out.println("Hello, what is the distance in kilometres?");
        int userInput1 = scanner.nextInt();
        double userMiles = userInput1 / 1.6;
        System.out.println("This is " + userMiles + "miles.");
    }
}
