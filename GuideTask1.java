package activities;
import java.time.LocalDate;
import java.util.Scanner;

public class GuideTask1 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter your name: ");
	        String name = scanner.nextLine();

	        System.out.println("Hello, " + name + "! lets calculate the area of rectangle");

	        System.out.print("Enter the length of the rectangle: ");
	        double length = scanner.nextDouble();

	        System.out.print("Enter the width of the rectangle: ");
	        double width = scanner.nextDouble();

	        double area = length * width;
	        System.out.println("The area of the rectangle is: " + area);

	        LocalDate currentDate = LocalDate.now();
	        System.out.println("Today's Date: " + currentDate);

	        scanner.close();
	    }
}
