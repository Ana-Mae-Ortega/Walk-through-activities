package activities;
import java.util.Scanner;

public class question3 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = 10;
        while (num >= 1) {
            System.out.println("Countdown: " + num);
            num--; 
        }

        scanner.close(); 
    }
}
