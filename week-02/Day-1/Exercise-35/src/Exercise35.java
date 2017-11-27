import java.util.Scanner;

public class Exercise35 {
    public static void main(String[] args) {
        // Crate a program that draws a chess table like this
        //
        // % % % %
        //  % % % %
        // % % % %
        //  % % % %
        // % % % %
        //  % % % %
        // % % % %
        //  % % % %
        //
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the width in integer: ");
        int width = scanner.nextInt();
        System.out.println("Please enter the height in integer: ");
        int height = scanner.nextInt();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (i % 2 == 0) {
                    if (j % 2 == 0) {
                        System.out.print("%");
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    if (j % 2 == 0) {
                        System.out.print(" ");
                    } else {
                        System.out.print("%");
                    }
                }
            }
            System.out.print("\n");
        }
    }
}
