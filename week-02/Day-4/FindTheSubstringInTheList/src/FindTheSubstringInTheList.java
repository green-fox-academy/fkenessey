import java.util.*;

public class FindTheSubstringInTheList {
    public static void main(String[] args) {
        //Create a function that takes a string and a list of string as a parameter
        //Returns the index of the string in the list where the first string is part of
        //Returns -1 if the string is not part any of the strings in the list

        ArrayList<String> theListIn = new ArrayList<>();
        String theString;

        theListIn = intiarey();
        theString = intidenami();

        System.out.println(compare(theListIn, theString));

    }

    private static String intidenami() {
        Scanner scanner = new Scanner(System.in);
        String wordIn;
        System.out.println("Please enter a single string:");
        wordIn = scanner.nextLine();
        return wordIn;
    }

    private static ArrayList<String> intiarey() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> listIn = new ArrayList<>();
        String cont = "";
        while (!cont.contains("n")) {
            System.out.println("Please enter a string to the list:");
            listIn.add(scanner.nextLine());
            System.out.println("Continue? - [y] / [n]");
            cont = scanner.nextLine();
        }
        return listIn;
    }

    private static ArrayList<Integer> compare(ArrayList<String> inputlist, String inputword) {
        ArrayList<Integer> outputlist = new ArrayList<>();
        for (int i = 0; i < inputlist.size(); i++) {
            if ((inputlist.get(i)).contains(inputword)) {
                outputlist.add(i);
            }
        }
        return outputlist;
    }
}
