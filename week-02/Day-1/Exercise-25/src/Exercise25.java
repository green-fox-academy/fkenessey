import java.util.Scanner;

public class Exercise25 {
    public static void main(String[] args) {
        // Create a program that asks for a number and prints the multiplication table with that number
        //
        // Example:
        // The number 15 should print:
        //
        // 1 * 15 = 15
        // 2 * 15 = 30
        // 3 * 15 = 45
        // 4 * 15 = 60
        // 5 * 15 = 75
        // 6 * 15 = 90
        // 7 * 15 = 105
        // 8 * 15 = 120
        // 9 * 15 = 135
        // 10 * 15 = 150
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer number: ");
        int userInput = scanner.nextInt();
        int a = 1;
        while (a < 11) {
            System.out.println(a + " * " + userInput + " = ");
            int total1 = a * userInput;
            System.out.println(total1);
            a++;
        }
        System.out.println("Or ...");
        for (int b = 1; b < 11; b++) {
            System.out.println(b + " * " + userInput + " = ");
            int total2 = b * userInput;
            System.out.println(total2);
        }
    }
}
