package day_33;

public class Code2 {
	    public static int[][] matrixAddition(int[][] A, int[][] B) {
	        int rows = A.length;
	        //0-row length,number of data in that index
	        int cols = A[0].length;
	        int[][] result = new int[rows][cols];

	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                result[i][j] = A[i][j] + B[i][j];
	            }
	        }

	        return result;
	    }

	    public static void main(String[] args) {
	        int[][] matrixA = {{1, 2}, {3, 4}};
	        int[][] matrixB = {{5, 6}, {7, 8}};

	        int[][] resultMatrix = matrixAddition(matrixA, matrixB);

	        System.out.println("Matrix A:");
	        printMatrix(matrixA);

	        System.out.println("\nMatrix B:");
	        printMatrix(matrixB);

	        System.out.println("\nMatrix Addition Result:");
	        printMatrix(resultMatrix);
	    }

	    private static void printMatrix(int[][] matrix) {
	        for (int[] row : matrix) {
	            for (int num : row) {
	                System.out.print(num + " ");
	            }
	            System.out.println();
	        }
	        System.out.println();
	    }
	

}
