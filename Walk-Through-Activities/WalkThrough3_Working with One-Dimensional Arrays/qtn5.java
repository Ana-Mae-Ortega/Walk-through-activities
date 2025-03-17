package activities;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class qtn5 {
	 public static void main(String[] args) {
	        int[] numbers = {10, 20, 30, 40, 50, 20, 30, 10};


	        System.out.println("Original Array Elements:");
	        for (int num : numbers) {
	            System.out.println(num);
	        }

	        LinkedHashSet<Integer> set = new LinkedHashSet<>();
	        for (int num : numbers) {
	            set.add(num);
	        }


	        int[] uniqueNumbers = new int[set.size()];
	        int index = 0;
	        for (int num : set) {
	            uniqueNumbers[index++] = num;
	        }

	        // Printing unique elements
	        System.out.println("Array After Removing Duplicates:");
	        for (int num : uniqueNumbers) {
	            System.out.println(num);
	        }
	    }
}
