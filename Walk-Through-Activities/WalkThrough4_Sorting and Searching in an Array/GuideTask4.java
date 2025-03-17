package activities;
import java.util.Arrays;

public class GuideTask4 {
	 public static void main(String[] args) {
	        int[] arr = {5, 1, 4, 2, 8};

	   
	        for (int i = 0; i < arr.length - 1; i++) {
	            int minIndex = i;
	            for (int j = i + 1; j < arr.length; j++) {
	                if (arr[j] < arr[minIndex]) {
	                    minIndex = j;
	                }
	            }
	            int temp = arr[minIndex];
	            arr[minIndex] = arr[i];
	            arr[i] = temp;
	        }

	  
	        System.out.print("Sorted Array: ");
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
	        System.out.println();

	        // Linear Search
	        int target = 4;
	        int linearIndex = linearSearch(arr, target);
	        System.out.println("Linear Search - Element found at index: " + linearIndex);

	        // Binary Search
	        int binaryIndex = binarySearch(arr, target);
	        System.out.println("Binary Search - Element found at index: " + binaryIndex);
	    }


	    public static int linearSearch(int[] arr, int target) {
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] == target) {
	                return i;
	            }
	        }
	        return -1;
	    }

	    // Binary Search method
	    public static int binarySearch(int[] arr, int target) {
	        int left = 0, right = arr.length - 1;
	        while (left <= right) {
	            int mid = left + (right - left) / 2;

	            if (arr[mid] == target) {
	                return mid;
	            }

	            if (arr[mid] < target) {
	                left = mid + 1;
	            } else {
	                right = mid - 1;
	            }
	        }
	        return -1;
	    }
}
