package day_53;

public class Code1 {
	

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

	        int[][] result = multiplyMatrices(matrix1, matrix2);

	        // Display the result
	        System.out.println("Resultant Matrix:");
	        displayMatrix(result);
	    }

	    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
	        int rows1 = matrix1.length;
	        int cols1 = matrix1[0].length;
	        int cols2 = matrix2[0].length;

	        int[][] result = new int[rows1][cols2];

	        for (int i = 0; i < rows1; i++) {
	            for (int j = 0; j < cols2; j++) {
	                for (int k = 0; k < cols1; k++) {
	                    result[i][j] += matrix1[i][k] * matrix2[k][j];
	                }
	            }
	        }

	        return result;
	    }

	    public static void displayMatrix(int[][] matrix) {
	        for (int[] row : matrix) {
	            for (int value : row) {
	                System.out.print(value + " ");
	            }
	            System.out.println();
	        }
	    }
	}

