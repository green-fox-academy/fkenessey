import java.util.Arrays;

public class Exercise14 {
    public static void main(String[] args) {
        // - Create an array variable named `ag`
        //   with the following content: `[3, 4, 5, 6, 7]`
        // - Double all the values in the array
        int[] ag = {3, 4, 5, 6, 7};
        int size = ag.length;
        System.out.println("The old array is: " + Arrays.toString(ag));
        for (int i = 0; i <size; i++) {
            ag[i] *= 2;
        }
        System.out.println("The new array is: " + Arrays.toString(ag));
    }
}
