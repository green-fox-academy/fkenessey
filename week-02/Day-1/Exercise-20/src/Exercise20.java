import java.util.Scanner;

public class Exercise20 {
    public static void main(String[] args) {
        // Write a program that asks for two numbers and prints the bigger one
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give the first number:");
        double userInput1 = scanner.nextDouble();
        System.out.println("Please give the second number:");
        double userInput2 = scanner.nextDouble();
        if (userInput1 > userInput2) {
            System.out.println("The first is bigger: " + userInput1 + " > " + userInput2);
        } else if (userInput1 < userInput2) {
            System.out.println("The second is bigger: " + userInput1 + " < " + userInput2);
        } else {
            System.out.println("They are equal");
        }
    }
}
