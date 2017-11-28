import java.util.Arrays;

public class Exercise18 {
    public static void main(String[] args) {
        // - Create an array variable named `ai`
        //   with the following content: `[3, 4, 5, 6, 7]`
        // - Print the sum of the elements in `ai`
        int[] ai = {3, 4, 5, 6, 7};
        System.out.println("The array is: " + Arrays.toString(ai));
        int sum = 0;
        for (int i = 0; i <ai.length; i++) {
            sum += ai[i];
        }
        System.out.println("The sum of the elements: " + sum);
    }
}
