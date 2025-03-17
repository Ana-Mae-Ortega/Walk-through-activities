package activities;
import java.time.LocalDate;
import java.util.Scanner;

public class qn3 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        LocalDate currentDate = LocalDate.now();
	        System.out.println("Today's Date: " + currentDate);
	        
	        scanner.close();
	 }
}
