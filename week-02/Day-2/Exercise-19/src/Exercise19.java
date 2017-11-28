import java.util.Arrays;

public class Exercise19 {
    public static void main(String[] args) {
        // - Create an array variable named `aj`
        //   with the following content: `[3, 4, 5, 6, 7]`
        // - Reverse the order of the elements in `aj`
        // - Print the elements of the reversed `aj`
        int[] aj = {3, 4, 5, 6, 7, 8, 9, 10, 5, 8};
        int memory = 0;
        int end = aj.length - 1;
        System.out.println("The original array: " + Arrays.toString(aj));
        for (int i = 0; i <aj.length/2; i++) {
            memory = aj[i];
            aj[i] = aj[end];
            aj[end] = memory;
            end--;
        }
        System.out.println("The new array: " + Arrays.toString(aj));
    }
}
