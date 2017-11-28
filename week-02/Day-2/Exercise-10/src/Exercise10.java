import java.util.Arrays;

public class Exercise10 {
    public static void main(String[] args) {
        // - Create an array variable named `s`
        //   with the following content: `[1, 2, 3, 8, 5, 6]`
        // - Change the 8 to 4
        // - Print the fourth element
        int[] s = {1, 2, 3, 8, 5, 6};
        System.out.println("The original content: " + Arrays.toString(s));
        s[3] = 4;
        System.out.println("The original content: " + Arrays.toString(s));
    }
}
