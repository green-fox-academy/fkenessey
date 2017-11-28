import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        //  Create the usual class wrapper
        //  and main method on your own.

        // - Create a function called `factorio`
        //   that returns it's input's factorial
        Scanner scanner = new Scanner(System.in);
        System.out.println("Factorial of: ? - Please give a positive int number");
        int top = scanner.nextInt();
        System.out.println("The sum is: " + fact(top));
    }
    public static int fact(int input){
        int a = input;
        while (a > 1) {
            a--;
            input *= a;
        }
        return input;
    }
}
