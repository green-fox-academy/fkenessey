import java.util.*;

public class Unique {
    public static void main(String[] args) {
        //Create a function that takes a list of numbers as a parameter
        //Returns a list of numbers where every number in the list occurs only once

        //Variable declaration
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> listin = new ArrayList<>();
        ArrayList<Integer> listout = new ArrayList<>();

        //Entering inputs
        String cont = "";
        while (!cont.equals("n")) {
            System.out.println("Please enter an integer number");
            int userNumber = scanner.nextInt();
            listin.add(userNumber);
            System.out.println("Continue? [y] / [n]");
            String userString = scanner.next();
            cont = userString;
        }
        //System.out.println("The arrayList so far: " + listin);

        //Converting listin to listout
        for (int i = 0; i <listin.size(); i++) {
            for (int j = i+1; j < (listin.size()); j++) {
                if (listin.get(i) > listin.get(j)) {
                    Collections.swap(listin,i,j);
                } else if (listin.get(i) == listin.get(j)) {
                    listin.remove(j);
                }
            }
            listout.add(listin.get(i));
        }
        System.out.println("The revised list is: " + listout);
    }
}
