package activities;
import java.util.Scanner;

public class Mitrix {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Define a 3x3 matrix
	        int[][] matrix = {
	            {1, 2, 3},
	            {4, 5, 6},
	            {7, 8, 9}
	        };

	        int sum = 0;
	        System.out.println("Matrix:");
	        for (int i = 0; i < matrix.length; i++) {
	            for (int j = 0; j < matrix[i].length; j++) {
	                System.out.print(matrix[i][j] + " ");
	                sum += matrix[i][j];
	            }
	            System.out.println();
	        }
	        System.out.println("Sum of all elements: " + sum);

	      
	        System.out.println("\nEnter elements for another 3x3 matrix:");
	        int[][] matrix2 = new int[3][3];
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                matrix2[i][j] = scanner.nextInt();
	            }
	        }
	        int[][] sumMatrix = addMatrices(matrix, matrix2);
	        System.out.println("Matrix Addition Result:");
	        printMatrix(sumMatrix);

	   
	        int[][] productMatrix = multiplyMatrices(matrix, matrix2);
	        System.out.println("Matrix Multiplication Result:");
	        printMatrix(productMatrix);

	      
	        boolean isSymmetric = checkSymmetric(matrix);
	        System.out.println("Is the matrix symmetric? " + isSymmetric);

	       
	        int[][] transposedMatrix = transposeMatrix(matrix);
	        System.out.println("Transpose of the Matrix:");
	        printMatrix(transposedMatrix);

	        scanner.close();
	    }

	  
	    public static int[][] addMatrices(int[][] mat1, int[][] mat2) {
	        int rows = mat1.length;
	        int cols = mat1[0].length;
	        int[][] result = new int[rows][cols];

	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                result[i][j] = mat1[i][j] + mat2[i][j];
	            }
	        }
	        return result;
	    }

	    
	    public static int[][] multiplyMatrices(int[][] mat1, int[][] mat2) {
	        int rows = mat1.length;
	        int cols = mat2[0].length;
	        int[][] result = new int[rows][cols];

	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                result[i][j] = 0;
	                for (int k = 0; k < mat1[0].length; k++) {
	                    result[i][j] += mat1[i][k] * mat2[k][j];
	                }
	            }
	        }
	        return result;
	    }

	    
	    public static boolean checkSymmetric(int[][] matrix) {
	        int rows = matrix.length;
	        int cols = matrix[0].length;

	        if (rows != cols) return false; // A symmetric matrix must be square

	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
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
	            for (int num : row) {
	                System.out.print(num + " ");
	            }
	            System.out.println();
	        }
	    }
}
