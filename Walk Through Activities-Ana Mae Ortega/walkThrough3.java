package activities;
import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;

public class OneDimentional {
	 public static void main(String[] args) {
	        int[] grades = {85, 90, 78, 88, 92};
	        int sum = 0;
	        int maxGrade = grades[0];
	        int minGrade = grades[0];

	        for (int grade : grades) {
	            sum += grade;
	            if (grade > maxGrade) maxGrade = grade;
	            if (grade < minGrade) minGrade = grade;
	        }

	        double average = (double) sum / grades.length;
	        System.out.println("Student Grades: " + Arrays.toString(grades));
	        System.out.println("Average Grade: " + average);
	        System.out.println("Maximum Grade: " + maxGrade);
	        System.out.println("Minimum Grade: " + minGrade);

	        int[] reversed = new int[grades.length];
	        for (int i = 0; i < grades.length; i++) {
	            reversed[i] = grades[grades.length - 1 - i];
	        }
	        System.out.println("Reversed Grades: " + Arrays.toString(reversed));

	        int[] array1 = {1, 3, 5};
	        int[] array2 = {2, 4, 6};
	        int mergedLength = array1.length + array2.length;
	        int[] mergedArray = new int[mergedLength];

	        System.arraycopy(array1, 0, mergedArray, 0, array1.length);
	        System.arraycopy(array2, 0, mergedArray, array1.length, array2.length);

	        System.out.println("Merged Array: " + Arrays.toString(mergedArray));

	        int[] duplicateArray = {1, 2, 2, 3, 4, 4, 5, 6, 6};
	        int[] uniqueArray = removeDuplicates(duplicateArray);

	        System.out.println("Array with Duplicates Removed: " + Arrays.toString(uniqueArray));
	    }

	    public static int[] removeDuplicates(int[] array) {
	        Set<Integer> uniqueElements = new HashSet<>();
	        for (int num : array) {
	            uniqueElements.add(num);
	        }
	        int[] result = new int[uniqueElements.size()];
	        int index = 0;
	        for (int num : uniqueElements) {
	            result[index++] = num;
	        }
	        return result;
	    }
}
