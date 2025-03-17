package activities;
import java.time.LocalDate;
import java.util.Scanner;

public class qn4 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
     
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        
        System.out.println("Hello, " + name + "! You are " + age + " years old.");
        
        LocalDate currentDate = LocalDate.now();
        System.out.println("Today's Date: " + currentDate);
        
        scanner.close();
    }
}
