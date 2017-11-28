import java.util.Arrays;

public class Exercise11 {
    public static void main(String[] args) {
        // Create an array variable named `t`
        //with the following content: `[1, 2, 3, 4, 5]`
        // Increment the third element
        // Print the third element
        int[] t = {1, 2, 3, 4, 5};
        System.out.println("The original content: " + Arrays.toString(t));
        t[2]++;
        System.out.println("The new content: " + Arrays.toString(t));
        System.out.println("The incremented content: " + --t[2] + " -> "+ ++t[2]);
    }
}
