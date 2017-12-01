import java.lang.reflect.Array;
import java.util.*;

public class PalindromSearcher {
    public static void main(String[] args) {
        //Create a function named search palindrome following your current language's style guide. It should take a
        // string, search for palindromes that at least 3 characters long and return a list with the found palindromes.


        System.out.println("The list of palindroms is: " + palindromSearcher(readUserIn()));

    }

    private static ArrayList<String> palindromSearcher(String userInput) {
        ArrayList<String> output = new ArrayList<>();
        for (int j = 1; j <userInput.length()/2 + 1; j++) {
            int length = j;
            for (int i = 0; i <userInput.length() - length - length; i++) {
                String a = userInput.substring(i, i + length + 1);
                String b = userInput.substring(i + length, i + length + length + 1);
                b = reverse(b);
                if (a.equals(b)) {
                    b = reverse(b);
                    b = b.substring(1, b.length());
                    output.add(a + b);
                }
            }
            for (int h = 0; h <userInput.length() - length - length - 1; h++) {
                String c = userInput.substring(h, h + length + 1);
                String d = userInput.substring(h + length + 1, h + length + length + 2);
                d = reverse(d);
                if (c.equals(d)) {
                    d = reverse(d);
                    output.add(c + d);
                }

            }
        }
        return output;
        }

    private static String reverse( String inputString) {
        String output = "";
        for (int i = 0; i <inputString.length(); i++) {
            output = output + inputString.charAt(inputString.length()-i-1);
        }
        return output;
    }


    private static String readUserIn() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a string:");
        String output = scanner.nextLine();
        return output;
    }
}
