package day_33;

public class Code5 {
	    public static int findMaxElement(int[][] matrix) {
	        int maxElement = Integer.MIN_VALUE;

	        for (int[] row : matrix) {
	            for (int num : row) {
	                maxElement = Math.max(maxElement, num);
	            }
	        }

	        return maxElement;
	    }

	    public static void main(String[] args) {
	        int[][] matrix = {
	            {5, 2, 9},
	            {8, 4, 7},
	            {3, 1, 6}
	        };

	        int maxElement = findMaxElement(matrix);

	        System.out.println("Max Element: " + maxElement);
	    }
	

}
