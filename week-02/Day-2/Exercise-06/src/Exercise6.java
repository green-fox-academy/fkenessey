import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        //  Create the usual class wrapper
        //  and main method on your own.

        // - Create a function called `printer`
        //   which prints the input String parameters
        // - It can have any number of parameters

        // Examples
        // printer("first")
        // printer("first", "second")
        // printer("first", "second", "third", "fourh")
        // ...
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many entries? ");
        int limit = scanner.nextInt();
        String[] words = new String[limit];
        for (int i = 0; i < limit; i++) {
            System.out.println("Please enter the word: ");
            String userInput = scanner.next();
            words[i] = userInput;
        }
        System.out.println("The sum is: " + printer(words));
    }
    public static String printer(String[] input){
        String total = "";
        for (int i = 0; i < input.length; i++) {
            total = total + "\" " + input[i] + " \" ";
        }
        return total;
    }
}
