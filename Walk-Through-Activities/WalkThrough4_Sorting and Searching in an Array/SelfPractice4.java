package activities;
import java.util.Scanner;

public class SelfPractice4 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the number of integers: ");
	        int n = scanner.nextInt();
	        int[] arr = new int[n];

	        System.out.println("Enter the integers:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = scanner.nextInt();
	        }

	        // Bubble Sort Algorithm
	        for (int i = 0; i < arr.length - 1; i++) {
	            for (int j = 0; j < arr.length - 1 - i; j++) {
	                if (arr[j] > arr[j + 1]) {
	                    int temp = arr[j];
	                    arr[j] = arr[j + 1];
	                    arr[j + 1] = temp;
	                }
	            }
	        }

	        // Printing Sorted Array
	        System.out.print("Sorted Array: ");
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }

	        // Insertion Sort for Strings
	        System.out.print("\nEnter the number of strings: ");
	        int m = scanner.nextInt();
	        scanner.nextLine(); // Consume newline

	        String[] strArr = new String[m];
	        System.out.println("Enter the strings:");
	        for (int i = 0; i < m; i++) {
	            strArr[i] = scanner.nextLine();
	        }

	        for (int i = 1; i < strArr.length; i++) {
	            String key = strArr[i];
	            int j = i - 1;
	            while (j >= 0 && strArr[j].compareTo(key) > 0) {
	                strArr[j + 1] = strArr[j];
	                j--;
	            }
	            strArr[j + 1] = key;
	        }

	        // Printing Sorted Strings
	        System.out.print("Sorted Strings: ");
	        for (String str : strArr) {
	            System.out.print(str + " ");
	        }

	        scanner.close();
	    }
}
