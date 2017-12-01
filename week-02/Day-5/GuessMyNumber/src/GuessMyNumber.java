import  java.util.*;

public class GuessMyNumber {
    public static void main(String[] args) {
        //Write a program where the program chooses a number between 1 and 100. The player is then asked to enter a
        // guess. If the player guesses wrong, then the program gives feedback and ask to enter an other guess until the guess is correct.
        //Make the range customizable (ask for it before starting the guessing).
        //You can add lives. (optional)

        guessGame(userInputSet(), userInput());
    }

    private static int userInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please choose a number: ");
        int output = scanner.nextInt();
        return output;
    }

    private static void guessGame(int[]rangeInput, int gameInput) {
        Random randomGuess = new Random();
        Scanner scanner = new Scanner(System.in);
        int randomGuessDouble = randomGuess.nextInt(rangeInput[1]-rangeInput[0]) + rangeInput[0];
        while (gameInput != randomGuessDouble || rangeInput[2] > 0) {
                rangeInput[2] = rangeInput[2]-1;
                System.out.println("Please guess again: ");
                gameInput = scanner.nextInt();
            }
        if (gameInput == randomGuessDouble) {
            System.out.println("Well done! You have guessed it right!");
        } else {
            System.out.println("Game Over!");
        }
    }

    private static int[] userInputSet() {
        Scanner scanner = new Scanner(System.in);
        int[] output = new int[3];
        System.out.println("Please choose the first number of the range: ");
        output[0] = scanner.nextInt();
        System.out.println("Please choose the last number of the range: ");
        output[1] = scanner.nextInt();
        System.out.println("How many tries?");
        output[2] = scanner.nextInt();
        return output;
        }
}
