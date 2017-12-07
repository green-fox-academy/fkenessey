public class StringsAgainAndAgain {
  public static void main(String[] args) {
    // Given a string, compute recursively a new string where all the
    // adjacent chars are now separated by a "*".
    String input = "you you!";
    System.out.println(recAdjReplc(input));
  }

  private static String recAdjReplc(String input) {
    if (input.length() == 1) {
      return input;
    }  else {
      return input.substring(0,1) + "*" + recAdjReplc(input.substring(1));
    }
  }
}
