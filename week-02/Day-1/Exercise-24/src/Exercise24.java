public class Exercise24 {
    public static void main(String[] args) {
        // Create a program that prints all the even numbers between 0 and 20
        int a = 0;
        while (a < 20) {
            if (a % 2 == 0) {
                System.out.println(a);
                a++;
            } else {
                a++;
            }
        }
        System.out.println("Or ...");
        for (int b = 0; b < 20; b++) {
            if (b % 2 == 0) {
                System.out.println(b);
            }
            }
        }
    }

