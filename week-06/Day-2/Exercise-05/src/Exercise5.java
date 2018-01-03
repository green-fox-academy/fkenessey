public class Exercise5 {
  public static void main(String[] args) {

    //Write a Stream Expression to find the uppercase characters in a string!
    String test = "Hello World!";

    test.chars()
            .filter(Character::isUpperCase)
            .forEach(c -> System.out.println((char)c + " "));
  }
}
