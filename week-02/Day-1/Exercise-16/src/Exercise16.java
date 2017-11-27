import java.util.Scanner;

public class Exercise16 {
    public static void main(String[] args) {
        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has
        // The seconf represents the number of pigs the farmer has
        // It should print how many legs all the animals have
        // Creates a scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many chicken does the farmer have?");
        int userInput1 = scanner.nextInt();
        System.out.println("How many pigs does the farmer have?");
        int userInput2 = scanner.nextInt();
        int legs = (userInput1 * 2) + (userInput2 * 4);
        System.out.println("So all the animals have " + legs + " legs in total.");
    }
}
