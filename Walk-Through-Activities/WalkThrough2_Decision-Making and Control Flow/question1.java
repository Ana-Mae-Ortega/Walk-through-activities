package activities;
import java.util.Scanner;

public class question1 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter a number to check if it's even or odd: ");
	        int number = scanner.nextInt();
	        
	        if (number % 2 == 0) {
	            System.out.println("The number " + number + " is even.");
	        } else {
	            System.out.println("The number " + number + " is odd.");
	        }
	        
	        scanner.close();
	    }
}
