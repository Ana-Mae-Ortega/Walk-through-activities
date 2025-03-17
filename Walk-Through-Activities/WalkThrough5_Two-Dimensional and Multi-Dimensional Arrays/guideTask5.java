package activities;

public class guideTask5 {
	 public static void main(String[] args) {
	        int[][] matrix1 = {
	            {1, 2, 3},
	            {4, 5, 6},
	            {7, 8, 9}
	        };

	        int[][] matrix2 = {
	            {9, 8, 7},
	            {6, 5, 4},
	            {3, 2, 1}
	        };

	       
	        System.out.println("Matrix:");
	        printMatrix(matrix1);

	        // Sum of all elements in the matrix
	        int sum = 0;
	        for (int i = 0; i < matrix1.length; i++) {
	            for (int j = 0; j < matrix1[i].length; j++) {
	                sum += matrix1[i][j];
	            }
	        }
	        System.out.println("Sum of all elements: " + sum);

	        // Adding two matrices
	        int[][] sumMatrix = new int[3][3];
	        for (int i = 0; i < matrix1.length; i++) {
	            for (int j = 0; j < matrix1[i].length; j++) {
	                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
	            }
	        }
	        System.out.println("Matrix Addition:");
	        printMatrix(sumMatrix);

	        // Matrix Multiplication
	        int[][] productMatrix = new int[3][3];
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                for (int k = 0; k < 3; k++) {
	                    productMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
	                }
	            }
	        }
	        System.out.println("Matrix Multiplication:");
	        printMatrix(productMatrix);
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
