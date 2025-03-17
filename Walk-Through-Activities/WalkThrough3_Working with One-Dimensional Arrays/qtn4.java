package activities;
import java.util.Arrays;

public class qtn4 {
	 public static void main(String[] args) {
	        int[] numbers1 = {10, 20, 30, 40, 50};
	        int[] numbers2 = {60, 70, 80, 90, 100};


	        int[] mergedArray = new int[numbers1.length + numbers2.length];

	        // Copy elements from the first array
	        System.arraycopy(numbers1, 0, mergedArray, 0, numbers1.length);

	        // Copy elements from the second array
	        System.arraycopy(numbers2, 0, mergedArray, numbers1.length, numbers2.length);

	        // Printing merged array
	        System.out.println("Merged Array: " + Arrays.toString(mergedArray));
	    }
}
