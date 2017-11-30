import java.util.*;

public class FindPartOfAnInteger {
    public static void main(String[] args) {
        //Create a function that takes a number and a list of numbers as a parameter
        //Returns the indeces of the numbers in the list where the first number is part of
        //Returns an empty list if the number is not part any of the numbers in the list

        //Initialising variables and classes
        ArrayList<Integer> theListIn = new ArrayList<>();
        int theNumber;

        //ArrayList<Integer> listIn = new ArrayList<>(Arrays.asList(1,11,34,52,61));
        //int number = 1;

        //Entering inputs
        theListIn = intiarey();
        theNumber = intidenumi();

        //Comparison
        System.out.println(compare(theListIn, theNumber));

    }

    private static int intidenumi() {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("Please enter the single number:");
        number = scanner.nextInt();
        return number;
    }

    private static ArrayList<Integer> intiarey() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> listIn = new ArrayList<>();
        System.out.println("Please enter a number to the list:");
        String cont = "y";
        while (scanner.hasNextInt()) {
            listIn.add(scanner.nextInt());
        }
        return listIn;
    }

    private static ArrayList<Integer> compare(ArrayList<Integer> inputlist, int inputnumber) {
        ArrayList<Integer> outputlist = new ArrayList<>();
        for (int i = 0; i < inputlist.size(); i++) {
            if ((inputlist.get(i)).toString().contains((Integer.toString(inputnumber)))) {
                outputlist.add(i);
            }
        }
        return outputlist;
    }
}
