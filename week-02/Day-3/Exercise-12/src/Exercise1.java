import java.util.*;

public class Exercise1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("What", "I", "do", "create,", "I", "cannot", "not", "understand."));

        // Accidentally I messed up this quote from Richard Feynman.
        // Two words are out of place
        // Your task is to fix it by swapping the right words with code

        // Also, print the sentence to the output with spaces in between.
        //What I cannot create, I do not understand
        System.out.println("original: " + list);
        ArrayList<String> checklist = new ArrayList<>(Arrays.asList("What", "I", "cannot", "create,", "I", "do", "not", "understand."));
        for (int i = 0; i <checklist.size(); i++) {
            if (list.get(i) != checklist.get(i)) {
                list.set(i, checklist.get(i));
            }
        }

        //Print out arrayList
        System.out.println("revised: " + list);
        for (String i : list) {
            System.out.print(i + " ");
        }
        System.out.print("\n");

        //Other method with swap
        Collections.swap(list,2, 7);
        for (String i : list) {
            System.out.print(i + " ");
        }
    }
}
