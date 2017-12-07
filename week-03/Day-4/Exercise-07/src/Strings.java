public class Strings {
  public static void main(String[] args) {
    // Given a string, compute recursively (no loops) a new string where all the
    // lowercase 'x' chars have been changed to 'y' chars.
    String inputString = "xou xou!";
    String charSeqFrom  = "x";
    String charSeqTo = "y";
    System.out.println(recString(inputString, charSeqFrom, charSeqTo));
  }

  private static String recString(String inputString, String charSeqFrom, String charSeqTo) {
    if (!inputString.contains(charSeqFrom)) {
      return inputString;
    } else {
      return recString(inputString.replaceFirst(charSeqFrom, charSeqTo), charSeqFrom, charSeqTo);
    }
  }
}
