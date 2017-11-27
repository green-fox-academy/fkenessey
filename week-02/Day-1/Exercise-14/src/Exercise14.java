import java.util.Scanner;

public class Exercise14 {
        public static void main(String[] args) {
            // Modify this program to greet user instead of the World!
            // The program should ask for the name of the user

            // Creates a scanner
            Scanner scanner = new Scanner(System.in);
            // The program asks for user's name
            System.out.println("Hello, what is your name?");
            String userInput1 = scanner.nextLine();
            System.out.println("Hello " + userInput1 + "!");
        }
}
