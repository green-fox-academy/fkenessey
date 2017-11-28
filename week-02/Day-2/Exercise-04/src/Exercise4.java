import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        //  Create the usual class wrapper
        //  and main method on your own.

        // - Write a function called `sum` that sum all the numbers
        //   until the given parameter
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many numbers? ");
        int limit = scanner.nextInt();
        int[] numbers = new int[limit];
        for (int i = 0; i < limit; i++) {
            System.out.println("Please enter the number: ");
            int userInput = scanner.nextInt();
            numbers[i] = userInput;
        }
        System.out.println("The sum is: " + sum(numbers));
        }
    public static int sum(int[] input){
        int total = 0;
        for (int i = 0; i < input.length; i++) {
            total += input[i];
        }
        return total;
    }
}
