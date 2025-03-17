package activities;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class qn5 {
	 public static void main(String[] args) {
		 LocalDate currentDate = LocalDate.now();
	        System.out.println("Today's Date: " + currentDate);
	        
	        LocalDateTime currentDateTime = LocalDateTime.now();
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
	        System.out.println("Current Date and Time: " + currentDateTime.format(formatter));
	 }
}
