public class Sumdigit {
  public static void main(String[] args) {
    // Given a non-negative int n, return the sum of its digits recursively (no loops).
    // Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while
    // divide (/) by 10 removes the rightmost digit (126 / 10 is 12).
    int input = 5648;
    System.out.println(recursiveSumDigit(input));

  }

  private static int recursiveSumDigit(int n) {
    if (n % 10 == 0) {
      return 0;
    } else {
      return (n % 10) + recursiveSumDigit(n / 10);
    }
  }
}
