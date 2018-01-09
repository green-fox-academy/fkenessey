public class NumberConverter {

  public static String numberConverter(int inputNumber) {
    String[] zeroToNineWords = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
            "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    String[] twentyToNinety = {"twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

    if (inputNumber <  20){
    return zeroToNineWords[inputNumber];
    } else if (String.valueOf(inputNumber).length() == 2){
      if (Integer.valueOf(String.valueOf(inputNumber).substring(1,2)) == 0) {
        return twentyToNinety[Integer.valueOf(String.valueOf(inputNumber).substring(0, 1)) - 2];
      } else {
        return twentyToNinety[Integer.valueOf(String.valueOf(inputNumber).substring(0, 1)) - 2] + " "
                + zeroToNineWords[Integer.valueOf(String.valueOf(inputNumber).substring(1, 2))];
      }
    } else if (String.valueOf(inputNumber).length() == 3) {
      if (Integer.valueOf(String.valueOf(inputNumber).substring(2,3)) == 0) {
        return zeroToNineWords[Integer.valueOf(String.valueOf(inputNumber).substring(0, 1))] + " hundred and " +
                twentyToNinety[Integer.valueOf(String.valueOf(inputNumber).substring(1,2)) - 2];
      } else {
        return zeroToNineWords[Integer.valueOf(String.valueOf(inputNumber).substring(0, 1))] + " hundred and "
                + twentyToNinety[Integer.valueOf(String.valueOf(inputNumber).substring(1, 2)) - 2] + " "
                + zeroToNineWords[Integer.valueOf(String.valueOf(inputNumber).substring(2, 3))];
      }
    } else if (String.valueOf(inputNumber).length() == 4) {
      if (Integer.valueOf(String.valueOf(inputNumber).substring(3,4)) == 0) {
        return zeroToNineWords[Integer.valueOf(String.valueOf(inputNumber).substring(0, 1))] + " thousand " +
                zeroToNineWords[Integer.valueOf(String.valueOf(inputNumber).substring(1, 2))] + " hundred and " +
                twentyToNinety[Integer.valueOf(String.valueOf(inputNumber).substring(2,3)) - 2];
      } else {
        return zeroToNineWords[Integer.valueOf(String.valueOf(inputNumber).substring(0, 1))] + " thousand " +
                zeroToNineWords[Integer.valueOf(String.valueOf(inputNumber).substring(1, 2))] + " hundred and "
                + twentyToNinety[Integer.valueOf(String.valueOf(inputNumber).substring(2, 3)) - 2] + " "
                + zeroToNineWords[Integer.valueOf(String.valueOf(inputNumber).substring(3, 4))];
      }
    } else {
        return "can't you count mate?!";

    }
  }
}
