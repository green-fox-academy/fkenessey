import java.util.*;

public class SortThatList {
    public static void main(String[] args) {
        //Create a function that takes a list of numbers as parameter
        //Returns a list where the elements are sorted in ascending numerical order
        //Make a second boolean parameter, if it's true sort that list descending

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
        System.out.println("Would you like the order ascending[a] or descending[d]?");
        String order = scanner.next();
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
        if (order.equals("d")) {
            for (int i = 0; i <(listout.size())/2; i++) {
                Collections.swap(listout, i, (listout.size())-i-1);
            }
        }
        System.out.println("The revised list is: " + listout);
    }
}
