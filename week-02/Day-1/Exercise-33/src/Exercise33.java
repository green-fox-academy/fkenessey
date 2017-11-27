import java.util.Scanner;

public class Exercise33 {
    public static void main(String[] args) {
        // Write a program that stores a number, and the user has to figure it out.
        // The user can input guesses, after each guess the program would tell one
        // of the following:
        //
        // The stored number is higher
        // The stried number is lower
        // You found the number: 8
        Scanner scanner = new Scanner(System.in);
        int number = 8;
        System.out.println("Please guess an integer number: ");
        int guess = scanner.nextInt();
        while (number != guess) {
            if (guess < number) {
                System.out.println("The stored number is higher");
            } else {
                System.out.println("The stored number is lower");
            }
            System.out.println("Please guess an integer number: ");
            guess = scanner.nextInt();
        }

    }
}
