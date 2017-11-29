import  java.util.*;

public class Exercise6 {
    public static void main(String[] args) {
        ArrayList<String> planetList = new ArrayList<String>(Arrays.asList("Mercury","Venus","Earth","Mars","Jupiter","Uranus","Neptune"));

        // Saturn is missing from the planetList
        // Insert it into the correct position
        System.out.println("original: \n" + planetList);

        planetList.add(5, "Saturn");

        System.out.println(" revised: \n" + planetList);
    }
}
