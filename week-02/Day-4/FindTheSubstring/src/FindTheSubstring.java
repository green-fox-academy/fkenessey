import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FindTheSubstring {
    public static void main(String[] args) {
        //Create a function that takes two strings as a parameter
        //Returns the starting index where the second one is starting in the first one
        //Returns -1 if the second string is not in the first one

        //Declaring variables and calling classes
        Scanner scanner = new Scanner(System.in);
        String firststring;
        String secondstring;
        ArrayList<String> output = new ArrayList<>();
        int index = 0;

        //Entering firststring and secondstring
        System.out.println("Please enter the first string:");
        firststring = scanner.nextLine();
        System.out.println("Please enter the second string:");
        secondstring = scanner.nextLine();
        output.add(firststring);
        output.add(secondstring);

        System.out.println("1st: " + firststring);
        System.out.println("2nd: " + secondstring);
        //System.out.println("output: " + output);

        if (firststring.contains(secondstring)) {
            index = firststring.indexOf(secondstring);
        } else {
            index = firststring.indexOf(secondstring);
            System.out.println("Second string is not in the first");
        }
        System.out.println(index);
    }
}
