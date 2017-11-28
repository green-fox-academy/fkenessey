import java.util.Arrays;

public class Exercise16 {
    public static void main(String[] args) {
        // - Create an array variable named `nimals`
        //   with the following content: `["kuty", "macsk", "cic"]`
        // - Add all elements an `"a"` at the end
        String[] nimals = {"kuty", "macsk", "cic"};
        System.out.println("The old 'nimals' file's content: " + Arrays.toString(nimals));
        for (int i = 0; i <nimals.length; i++) {
            nimals[i] = nimals[i] + "a";
        }
        System.out.println("The new 'nimals' file's content: " + Arrays.toString(nimals));
    }
}
