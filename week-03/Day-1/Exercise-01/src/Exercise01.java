import java.util.Scanner;

public class Exercise01 {
  public static void main(String[] args) {
    // create a function that takes a number
    // divides ten with it,
    // and prints the result.
    // it should print "fail" if the parameter is 0
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter a number: ");
    int divisor = scanner.nextInt();

    try {
      int result = 10 / divisor; // If the input value for divisor was 0 the program breaks
      System.out.println(result); // The program doesn't reach this line if the input was 0
    } catch (ArithmeticException e){
      System.out.println("Fail"); // This line only runs if the input was 0
    }
  }
}
