public class Exercise13 {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        // Write a program that prints the remaining seconds (as an integer) from a
        // day if the current time is represented bt the variables
        int daySec = 24 * 60 * 60;
        int currentTime = (currentHours * 60 * 60) + (currentMinutes * 60) + currentSeconds;
        int remainingTime = daySec - currentTime;
        System.out.println("prints the remaining seconds (as an integer)");
        System.out.println(remainingTime);
    }
}
