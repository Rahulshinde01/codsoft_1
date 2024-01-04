
import java.util.Random;
import java.util.Scanner;

public class MyTask1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int lowerBound = 1;
        int upperBound = 100;
        int numberOfAttempts = 10;
        int score = 0;
        int totalCount =0;

        System.out.println("Welcome to the Game!");

        do {
            int targetNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
            int userGuess;
            int attempts = 0;

            System.out.println("\nI've selected a number between " + lowerBound + " and " + upperBound);
            System.out.println("Can you guess it?" + "\n let's see...");

            while (true) {
                System.out.print("Enter your guess: ");
                userGuess = scanner.nextInt();
                attempts++;

                if (userGuess == targetNumber) {
                    System.out.println("Congratulations! You guessed correct number in " + attempts + " attempts");
                    score += numberOfAttempts - attempts + 1;
                    break;
                } else if (userGuess < targetNumber) {
                    System.out.println("Too low. Try again.");
                } else {
                    System.out.println("Too high. Try again.");
                }

                if (attempts == numberOfAttempts) {
                    System.out.println("Sorry, you've reached the maximum number of attempts.\nThe correct number was " + targetNumber + ".");
                    break;
                }
            }

            totalCount++;
            System.out.print("Do you want to play again? (yes/no): ");

        } while (scanner.next().equalsIgnoreCase("yes"));

        System.out.println("Your final score is: " + score +"/"+(totalCount*10));
        System.out.println("Thanks for playing");
        scanner.close();
    }
}

