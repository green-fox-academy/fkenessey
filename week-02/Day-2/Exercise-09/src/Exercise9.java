import java.util.Arrays;

public class Exercise9 {
    public static void main(String[] args) {
        // - Create an array variable named `r`
        //   with the following content: `[54, 23, 66, 12]`
        // - Print the sum of the second and the third element
        int[] r = {54, 23, 66, 12};
        System.out.println("The content is: " + Arrays.toString(r));
        System.out.println("The sum of the 2nd & 3rd elements are: " + (r[1] + r[2]));
    }
}
