public class Power {
  public static void main(String[] args) {
    // Given base and n that are both 1 or more, compute recursively (no loops)
    // the value of base to the n power, so powerN(3, 2) is 9 (3 squared).
    int base = 3;
    int power = 3;
    System.out.println(recursivePowerCount(base, power));

  }

  private static int recursivePowerCount(int base, int power) {
    if ( power == 0){
      return 1;
    } else {
      return base * recursivePowerCount(base, power - 1);
    }
  }
}
