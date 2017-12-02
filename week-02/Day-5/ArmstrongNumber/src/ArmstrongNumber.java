import java.util.*;

public class ArmstrongNumber {
  public static void main(String[] args) {
    //Write a simple program to check if a given number is an armstrong number. The program should ask for a number.
    // E.g. if we type 371, the program should print out: The 371 is an Armstrong number.

    armstrongNumberChecker(userInput());
  }

  private static void armstrongNumberChecker(String numberInput) {
    ArrayList<Integer> numberInputInt = new ArrayList<>();
    for (int i = 0; i <numberInput.length() ; i++) {
      numberInputInt.add(Integer.valueOf(String.valueOf(numberInput.charAt(i))));
    }
    int n = numberInputInt.size();
    int sum = 0;
    for (int h = 0; h <numberInputInt.size(); h++) {
      sum = sum + powerOf(numberInputInt.get(h),n);
    }
    if (sum == Integer.valueOf(numberInput)) {
      System.out.println("The " + numberInput + " is an Armstrong number");
    } else {
      System.out.println("The " + numberInput + " is not an Armstrong number");
    }
  }

  private static int powerOf(int a, int x) {
    int c = a;
    for (int j = 0; j < (x - 1) ; j++) {
      c = multiply(c,a);
    }
    return c;
  }

  private static int multiply(int a, int b) {
    int c = a * b;
    return c;
  }

  private static String userInput() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter an integer number: ");
    String input = scanner.nextLine();
    return input;
  }
}
