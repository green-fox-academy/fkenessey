public class Bunnies {
  public static void main(String[] args) {
    // We have a number of bunnies and each bunny has two big floppy ears.
    // We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).
    int nBunnies = 10;
    System.out.println(recBunnyEars(nBunnies));
  }

  private static int recBunnyEars(int nBunnies) {
    if (nBunnies == 1) {
      return 2;
    } else {
      return 2 + recBunnyEars(nBunnies - 1);
    }
  }
}
