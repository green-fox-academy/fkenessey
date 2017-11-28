public class Exercise1 {
    public static void main(String[] args) {
        // - Create an integer variable named `ak` and assign the value `123` to it
        // - Create a function called `doubling` that doubles it's input parameter
        // - Print the result of `doubling(ak)`
        int ak = 123;
        System.out.println("Result of doubling(ak): " + doubling(ak));
    }
    public static int doubling (int input) {
        return input * 2;
    }
}

