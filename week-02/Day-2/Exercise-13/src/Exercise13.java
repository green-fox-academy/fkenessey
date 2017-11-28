import java.util.Scanner;

public class Exercise13 {
    public static void main(String[] args) {
        // - Create (dynamically) a two dimensional array
        //   with the following matrix. Use a loop!
        //
        //   1 0 0 0
        //   0 1 0 0
        //   0 0 1 0
        //   0 0 0 1
        //
        // - Print this two dimensional array to the output
        Scanner scanner = new Scanner(System.in);
        System.out.println("How big is the matrix? ");
        int size = scanner.nextInt();
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j) {
                    matrix[i][j] = 1;
                } else {
                    matrix[i][j] = 0;
                }
            }
        }
        System.out.println("Your matrix has been created. Would you like to have it printed? [yes] / [no]");
        String userResponse = scanner.next();
        if (userResponse.equals("yes")) {
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size-1; j++) {
                    System.out.print(matrix[i][j]);
                }
                System.out.println(matrix[i][size-1]);
            }
        } else {
            System.out.println("Have a nice day!");
        }
    }
}
