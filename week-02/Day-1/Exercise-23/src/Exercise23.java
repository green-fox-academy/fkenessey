public class Exercise23 {
    public static void main(String[] args) {
        // Create a program that writes this line 10 times:
        // "I won't cheat on the exam!"
        int a = 0;
        while (a < 10) {
            System.out.println("I won't cheat on the exam!");
            a++;
        }
        System.out.println("Or ...");
        for (int b = 0; b < 10; b++) {
            System.out.println("I won't cheat on the exam!");
        }
    }
}
