import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(100) + 1; // generate a random number between 1 and 100

        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess the number between 1 and 100:");

        while (true) {
            int guess = scanner.nextInt();

            if (guess < number) {
                System.out.println("Too low, try again.");
            } else if (guess > number) {
                System.out.println("Too high, try again.");
            } else {
                System.out.println("You guessed it!");
                break;
            }
        }

        scanner.close();
    }
}
