package activities;

public class qtn3 {
	 public static void main(String[] args) {
	        int[] numbers = {10, 20, 30, 40, 50};


	        System.out.println("Array Elements:");
	        for (int i = 0; i < numbers.length; i++) {
	            System.out.println(numbers[i]);
	        }

	        numbers[2] = 99;
	        System.out.println("Updated Third Element: " + numbers[2]);


	        System.out.println("Reversed Array:");
	        for (int i = numbers.length - 1; i >= 0; i--) {
	            System.out.println(numbers[i]);
	        }
	    }
}
