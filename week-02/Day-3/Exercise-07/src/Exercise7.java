import java.util.*;

public class Exercise7 {
    public static void main(String[] args) {
        ArrayList<String> girls = new ArrayList<>(Arrays.asList("Eve","Ashley","Bözsi","Kat","Jane"));
        ArrayList<String> boys = new ArrayList<>(Arrays.asList("Joe","Fred","Béla","Todd","Neef","Jeff"));
        ArrayList<String> order = new ArrayList<>();

        // Join the two lists by matching one girl with one boy in the order list
        // Exepected output: "Eve", "Joe", "Ashley", "Fred"...
        System.out.println("original:\n" + order);

        order.addAll(girls);
        //order.addAll(boys);
        int girlsize = girls.size();
        int boysize = boys.size();
        int till = girlsize + boysize;
        int diff = boysize - girlsize;
        System.out.println("girlsize: " + girlsize);
        System.out.println("boysize: " + boysize);
        int list = 0;
        for (int i = 0; i <till ; i++) {
            if (i % 2 !=0) {
                order.add(i,boys.get(list));
                list++;
            }
        }
        for (int j = 0; j < diff; j++) {
            order.add(boys.get(girlsize + j));
        }
        System.out.println("revised:\n" + order);
    }
}
