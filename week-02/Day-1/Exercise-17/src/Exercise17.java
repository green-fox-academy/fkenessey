// Loads the scanner to the file
import java.util.Scanner;

public class Exercise17 {
    public static void main(String[] args) {
        // Creates a scanner
        Scanner scanner = new Scanner(System.in);
        // Write a program that asks for 5 integers in a row,
        // then it should print the sum and the average of these numbers like:
        //
        // Sum: 22, Average: 4.4
        System.out.println("Please give an integer:");
        int userInput1 = scanner.nextInt();
        System.out.println("Please give an integer:");
        int userInput2 = scanner.nextInt();
        System.out.println("Please give an integer:");
        int userInput3 = scanner.nextInt();
        System.out.println("Please give an integer:");
        int userInput4 = scanner.nextInt();
        System.out.println("Please give an integer:");
        int userInput5 = scanner.nextInt();
        int sum = userInput1 + userInput2 + userInput3 + userInput4 + userInput5;
        double average = sum / 5;
        System.out.println("The sum is:" + sum);
        System.out.println("The average is:" + average);
    }
}
