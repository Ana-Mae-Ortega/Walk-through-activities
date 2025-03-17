package activities;
import java.util.Random;
import java.util.Scanner;

public class question4 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int randomNumber = random.nextInt(10) + 1; 
        int guess = 0;
        
        System.out.println("\nGuess the number between 1 and 10:");
        while (guess != randomNumber) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            
            if (guess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > randomNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number.");
            }
        }
        
        scanner.close();
    }
}
