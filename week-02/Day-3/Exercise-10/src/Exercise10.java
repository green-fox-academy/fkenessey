import java.util.*;

public class Exercise10 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
        ArrayList<Integer> list1 = new ArrayList<>();

        // Check if the arrayList contains "7" if it contains print "Hoorray" otherwise print "Noooooo"
        // Do this again with a different solution using different list functions!
        Scanner scanner = new Scanner(System.in);
        int answer = 0;
        while (answer != 1) {
          System.out.println("Please enter a number");
          int userInput = scanner.nextInt();
          list1.add(userInput);
          System.out.println("Continue? [yes - 0] [no - 1]");
          int userInput2 = scanner.nextInt();
          answer = userInput2;
        }

        //System.out.println(arrayList);
        System.out.println(list1);
        if (list1.contains(7)) {
            System.out.println("Hoorray");
        } else {
            System.out.println("Noooooo");
        }

        System.out.println("other method:");
        int found = 0;
        for (int i = 0; i <list1.size() ; i++) {
            if (list1.get(i) == 7) {
                found++;
            }
        }
        if (found > 0) {
            System.out.println("Hoorray");
        } else {
            System.out.println("Noooooo");
        }
    }
}
