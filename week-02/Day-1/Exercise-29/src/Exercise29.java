import java.util.Scanner;

public class Exercise29 {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // pyramid like this:
        //
        //
        //    *
        //   ***
        //  *****
        // *******
        //
        // The pyramid should have as many lines as the number was
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer number: ");
        int number = scanner.nextInt();
        int a = 0;
        while (a < number) {
            for (int i = a; i < number; i++) {
                System.out.print(" ");
            }
            for (int ii = 0; ii < (a * 2); ii++) {
                System.out.print("*");
            }
            System.out.println("*");
            a++;
        }
    }
}
