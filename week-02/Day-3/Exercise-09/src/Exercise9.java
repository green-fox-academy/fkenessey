import java.util.*;

public class Exercise9 {
    public static void main(String[] args) {
        ArrayList<Object> arrayList = new ArrayList<Object>();
        arrayList.add("Cupcake");
        arrayList.add(2);
        arrayList.add("Brownie");
        arrayList.add(false);

        // Accidentally we added "2" and "false" to the list.
        // Your task is to change from "2" to "Croissant" and change from "false" to "Ice cream"
        // No, don't just remove the lines
        System.out.println("original:" + arrayList);

        int index = 0;

        if (arrayList.contains(2)) {
            index = arrayList.indexOf(2);
            arrayList.set(index, "Croissant");
        }

        if (arrayList.contains(false)) {
            index = arrayList.indexOf(false);
            arrayList.set(index, "Ice cream");
        }

        System.out.println("revised:" + arrayList);
    }
}
