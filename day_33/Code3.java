package day_33;

public class Code3 {
	    public static int diagonalSum(int[][] matrix) {
	        int sum = 0;
	        int n = matrix.length;

	        for (int i = 0; i < n; i++) {
	            sum += matrix[i][i];
	        }

	        return sum;
	    }

	    public static void main(String[] args) {
	        int[][] squareMatrix = {
	            {1, 2, 3},
	            {4, 5, 6},
	            {7, 8, 9}};

	        int sum = diagonalSum(squareMatrix);

	        System.out.println("Diagonal Sum is-> " + sum);
	    
	}

}
