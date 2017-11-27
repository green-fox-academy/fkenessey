import java.util.Scanner;

public class Exercise18 {
    public static void main(String[] args) {
        // Write a program that reads a number form the standard input,
        // Than prints "Odd" if the number is odd, or "Even" it it is even.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give an integer number:");
        int userInput1 = scanner.nextInt();
        int remainder = userInput1 % 2;
        if (remainder == 0) {
            System.out.println("This is an even number.");
        } else {
            System.out.println("This is an odd number.");
        }
    }
}
