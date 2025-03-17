package activities;

public class qtn2 {
	 public static void main(String[] args) {
	        int[] numbers = {10, 20, 30, 40, 50};

	        System.out.println("Array Elements:");
	        for (int i = 0; i < numbers.length; i++) {
	            System.out.println(numbers[i]);
	        }

	        numbers[2] = 99;
	        System.out.println("Updated Third Element: " + numbers[2]);

	        int max = numbers[0];
	        int min = numbers[0];

	        for (int num : numbers) {
	            if (num > max) {
	                max = num;
	            }
	            if (num < min) {
	                min = num;
	            }
	        }

	        System.out.println("Maximum Value: " + max);
	        System.out.println("Minimum Value: " + min);
	    }

}
