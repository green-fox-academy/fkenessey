public class Fibonacci {

  public Fibonacci() {
  }

  public int fibonacciCount(int n) {
    if (n == 0) {
      return n = 0;
    } else if (n == 1) {
      return n = 1;
    } else {
      return fibonacciCount(n - 1) + fibonacciCount(n - 2);
    }
  }
}
