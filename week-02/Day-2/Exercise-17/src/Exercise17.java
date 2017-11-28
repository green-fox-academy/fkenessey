import java.util.Arrays;

public class Exercise17 {
    public static void main(String[] args) {
        // - Create an array variable named `abc`
        //   with the following content: `["first", "second", "third"]`
        // - Swap the first and the third element of `abc`
        String[] abd = {"first", "second", "third"};
        System.out.println("The old 'abd' file's content: " + Arrays.toString(abd));
        String memory = "";
        for (int i = 0; i <abd.length; i++) {
            if (i == 0) {
                memory = abd[i];
            } else if (i == 2) {
                abd[0] = abd[i];
            }
        }
        abd[abd.length-1] = memory;
        System.out.println("The new 'abd' file's content: " + Arrays.toString(abd));
    }
}
