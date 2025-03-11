package activities;
import java.util.Arrays;
import java.util.Scanner;

public class Sorting {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	       
	        System.out.print("Enter the number of elements: ");
	        int n = scanner.nextInt();
	        int[] arr = new int[n];

	        System.out.println("Enter " + n + " numbers:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = scanner.nextInt();
	        }

	        
	        selectionSort(arr);
	        System.out.println("Sorted Array (Selection Sort): " + Arrays.toString(arr));

	        // 2. Linear Search Implementation
	        System.out.print("Enter a number to search (Linear Search): ");
	        int key = scanner.nextInt();
	        int linearIndex = linearSearch(arr, key);
	        if (linearIndex != -1) {
	            System.out.println("Element found at index " + linearIndex);
	        } else {
	            System.out.println("Element not found.");
	        }

	       
	        System.out.print("Enter a number to search (Binary Search): ");
	        int binaryKey = scanner.nextInt();
	        int binaryIndex = binarySearch(arr, binaryKey);
	        if (binaryIndex != -1) {
	            System.out.println("Element found at index " + binaryIndex);
	        } else {
	            System.out.println("Element not found.");
	        }

	        
	        System.out.print("Enter the number of strings: ");
	        int strSize = scanner.nextInt();
	        scanner.nextLine(); // Consume newline

	        String[] strArr = new String[strSize];
	        System.out.println("Enter " + strSize + " strings:");
	        for (int i = 0; i < strSize; i++) {
	            strArr[i] = scanner.nextLine();
	        }

	        insertionSortStrings(strArr);
	        System.out.println("Sorted Strings (Insertion Sort): " + Arrays.toString(strArr));

	        scanner.close();
	    }

	    
	    public static void selectionSort(int[] arr) {
	        int n = arr.length;
	        for (int i = 0; i < n - 1; i++) {
	            int minIndex = i;
	            for (int j = i + 1; j < n; j++) {
	                if (arr[j] < arr[minIndex]) {
	                    minIndex = j;
	                }
	            }
	            int temp = arr[minIndex];
	            arr[minIndex] = arr[i];
	            arr[i] = temp;
	        }
	    }

	  
	    public static int linearSearch(int[] arr, int key) {
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] == key) {
	                return i; 
	            }
	        }
	        return -1;
	    }

	    public static int binarySearch(int[] arr, int key) {
	        int left = 0, right = arr.length - 1;
	        while (left <= right) {
	            int mid = left + (right - left) / 2;
	            if (arr[mid] == key) {
	                return mid; // Found the element
	            } else if (arr[mid] < key) {
	                left = mid + 1;
	            } else {
	                right = mid - 1;
	            }
	        }
	        return -1; // Element not found
	    }

	    public static void insertionSortStrings(String[] arr) {
	        int n = arr.length;
	        for (int i = 1; i < n; i++) {
	            String key = arr[i];
	            int j = i - 1;
	            while (j >= 0 && arr[j].compareTo(key) > 0) {
	                arr[j + 1] = arr[j];
	                j--;
	            }
	            arr[j + 1] = key;
	        }
	    }
}
