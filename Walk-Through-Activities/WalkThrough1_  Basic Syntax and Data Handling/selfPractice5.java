package activities;
import java.util.Scanner;

public class selfPractice5 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input matrix dimensions
	        System.out.print("Enter number of rows: ");
	        int rows = scanner.nextInt();
	        System.out.print("Enter number of columns: ");
	        int cols = scanner.nextInt();

	        int[][] matrix = new int[rows][cols];

	      
	        System.out.println("Enter matrix elements:");
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                matrix[i][j] = scanner.nextInt();
	            }
	        }

	        // Print the original matrix
	        System.out.println("Original Matrix:");
	        printMatrix(matrix);

	        // Check if matrix is symmetric
	        if (isSymmetric(matrix)) {
	            System.out.println("The matrix is symmetric.");
	        } else {
	            System.out.println("The matrix is not symmetric.");
	        }

	        // Transpose the matrix
	        System.out.println("Transposed Matrix:");
	        int[][] transposed = transposeMatrix(matrix);
	        printMatrix(transposed);

	        scanner.close();
	    }

	    public static boolean isSymmetric(int[][] matrix) {
	        if (matrix.length != matrix[0].length) {
	            return false;
	        }

	        for (int i = 0; i < matrix.length; i++) {
	            for (int j = 0; j < matrix[0].length; j++) {
	                if (matrix[i][j] != matrix[j][i]) {
	                    return false;
	                }
	            }
	        }
	        return true;
	    }

	    public static int[][] transposeMatrix(int[][] matrix) {
	        int rows = matrix.length;
	        int cols = matrix[0].length;
	        int[][] transposed = new int[cols][rows];

	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                transposed[j][i] = matrix[i][j];
	            }
	        }
	        return transposed;
	    }

	    public static void printMatrix(int[][] matrix) {
	        for (int[] row : matrix) {
	            for (int element : row) {
	                System.out.print(element + " ");
	            }
	            System.out.println();
	        }
	    }
}
