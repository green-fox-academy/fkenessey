import java.lang.reflect.Array;
import  java.util.*;

public class Anagram {
    public static void main(String[] args) {
        //Create a function named is anagram following your current language's style guide. It should take two strings
        // and return a boolean value depending on whether its an anagram or not.

        String a = inputString();
        String b = inputString();
        System.out.println("Thinking that this is an Anagram is " + anaCompute(a,b));
    }


    private static boolean anaCompute(String a1, String b1) {
        boolean response;
        ArrayList<String> a1list = new ArrayList<>();
        ArrayList<String> b1list = new ArrayList<>();
        for (int i = 0; i <a1.length() ; i++) {
            a1list.add(i, (Character.toString(a1.charAt(i))));
        }
        for (int j = 0; j <b1.length() ; j++) {
            b1list.add(j, (Character.toString(b1.charAt(j))));
        }
        if (a1list.size() == b1list.size()) {
            for (int i = 0; i <a1list.size() ; i++) {
                b1list.remove(a1list.get(i));
            }
            if (b1list.size()>0) {
                return response = false;
            } else {
                return response = true;
            }
        } else {
            return response = false;
        }
    }

    private static String inputString() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input a string: ");
        return scanner.nextLine();
    }
}
