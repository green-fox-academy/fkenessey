public class Counter {
  public static void main(String[] args) {
    int input = 5;
    System.out.println(recursionWithAdd(input));
  }

  private static int recursionWithAdd(int n) {
    if (n == 0) {
      return 0;
    } else {
      return n + recursionWithAdd(n - 1);
    }
  }
}
