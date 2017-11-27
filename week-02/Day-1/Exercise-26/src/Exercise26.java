import java.util.Scanner;

public class Exercise26 {
    public static void main(String[] args) {
        // Create a program that asks for two numbers
        // If the second number is not bigger than the first one it should print:
        // "The second number should be bigger"
        //
        // If it is bigger it should count from the first number to the second by one
        //
        // example:
        //
        // first number: 3, second number: 6, should print:
        //
        // 3
        // 4
        // 5
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the first integer number: ");
        int number1 = scanner.nextInt();
        System.out.println("Please enter the second integer number: ");
        int number2 = scanner.nextInt();
        while (number1 >= number2) {
            System.out.println("Please enter the first integer number. Please make sure the second is bigger!");
            number1 = scanner.nextInt();
            System.out.println("Please enter the second integer number. Please make sure the second is bigger!");
            number2 = scanner.nextInt();
        }
        int a = 0;
        int diff = number2 - number1;
        while (a < diff) {
            System.out.println(number1 + a);
            a++;
        }
        System.out.println("Or ...");
        for (int b = 0; b < diff; b++) {
            System.out.println(number1 + b);
        }
        }
    }

