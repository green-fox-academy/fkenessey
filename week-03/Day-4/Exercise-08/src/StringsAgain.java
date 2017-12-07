public class StringsAgain {
  public static void main(String[] args) {
    // Given a string, compute recursively a new string where all the 'x' chars have been removed.
    String input = "xou xou!";
    String remove = "x";
    System.out.println(revRem(input, remove));

  }

  private static String revRem(String input, String remove) {
    if (!input.contains(remove)) {
      return input;
    } else {
      return revRem(input.replace(remove,""), remove);
    }
  }
}
