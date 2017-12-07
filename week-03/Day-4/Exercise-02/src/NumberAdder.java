public class NumberAdder {
  public static void main(String[] args) {
    int input = 4;
    System.out.println(recursiveAdder(input));
  }

  private static int recursiveAdder(int n) {
    if (n == 1) {
      return 1;
    } else {
      return n + recursiveAdder(n - 1);
    }
  }
}
