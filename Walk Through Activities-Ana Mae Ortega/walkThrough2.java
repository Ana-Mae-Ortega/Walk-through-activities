package activities;
import java.util.Random;
import java.util.Scanner;
import java.time.LocalDateTime;

public class DecisionMaking {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a number to check if it's even or odd: ");
	        int number = scanner.nextInt();
	        if (number % 2 == 0) {
	            System.out.println(number + " is even.");
	        } else {
	            System.out.println(number + " is odd.");
	        }

	        // this will Displaying the day based on number input
	        System.out.print("Enter a number (1-7) for a day of the week: ");
	        int dayNumber = scanner.nextInt();
	        String day;
	        switch (dayNumber) {
	            case 1: day = "Monday"; break;
	            case 2: day = "Tuesday"; break;
	            case 3: day = "Wednesday"; break;
	            case 4: day = "Thursday"; break;
	            case 5: day = "Friday"; break;
	            case 6: day = "Saturday"; break;
	            case 7: day = "Sunday"; break;
	            default: day = "Invalid input! Please enter a number between 1 and 7.";
	        }
	        System.out.println("Day: " + day);

	        // numbers from 10 to 1
	        int count = 10;
	        System.out.println("Countdown from 10 to 1:");
	        while (count >= 1) {
	            System.out.println(count);
	            count--;
	        }

	        // User has to guess a random number
	        Random random = new Random();
	        int randomNumber = random.nextInt(10) + 1; // Random number between 1 and 10
	        int guess;
	        System.out.println("Guess a number between 1 and 10!");
	        do {
	            System.out.print("Enter your guess: ");
	            guess = scanner.nextInt();
	            if (guess < randomNumber) {
	                System.out.println("Too low! Try again.");
	            } else if (guess > randomNumber) {
	                System.out.println("Too high! Try again.");
	            }
	        } while (guess != randomNumber);
	        System.out.println("Congratulations! You guessed the correct number.");

	   
	        scanner.nextLine(); 
	        String input;
	        do {
	            System.out.print("type 'exit' to stop): ");
	            input = scanner.nextLine();
	            System.out.println("You entered: " + input);
	        } while (!input.equalsIgnoreCase("exit"));
	        
	        System.out.println("Program terminated. Goodbye!");

	        scanner.close();
	    }

}
