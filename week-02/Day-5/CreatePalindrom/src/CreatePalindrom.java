import java.util.*;

public class CreatePalindrom {
    public static void main(String[] args) {
        //Create a function named create palindrome following your current language's style guide. It should take a
        // string, create a palindrome from it and then return it.

        String palindrom = readString();
        System.out.println(createThePalindrom(palindrom));
    }

    private static String createThePalindrom(String inputString) {

        //Alternative solution
        //StringBuilder gnirtStupni = new StringBuilder(inputString);
        //gnirtStupni.reverse();

        String gnirtStupni = "";
        for (int i = 0; i <inputString.length() ; i++) {
            gnirtStupni = gnirtStupni + inputString.charAt(inputString.length()-1-i);
        }

        return inputString.concat(gnirtStupni);
    }

    private static String readString() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a string");
        return scanner.nextLine();
    }
}
