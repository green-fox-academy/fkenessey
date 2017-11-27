import java.util.Scanner;

public class Exercise34 {
    public static void main(String[] args) {
        // Write a program that asks for a number.
        // It would ask this many times to enter an integer,
        // if all the integers are entered, it should print the sum and average of these
        // integers like:
        //
        // Sum: 22, Average: 4.4
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Please enter a number: ");
            int userInput = scanner.nextInt();
            sum += userInput;
        }
        double avg = sum / 10;
        System.out.println("The sum is: " + sum);
        System.out.println("The average is: " + avg);
    }
}
