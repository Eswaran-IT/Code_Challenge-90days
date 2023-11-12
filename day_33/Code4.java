package day_33;

public class Code4 {
	    public static int countOccurrences(int[][] matrix, int target) {
	        int count = 0;

	        for (int[] row : matrix) {
	            for (int num : row) {
	                if (num == target) {
	                    count++;
	                }
	            }
	        }

	        return count;
	    }

	    public static void main(String[] args) {
	        int[][] matrix = {
	            {1, 2, 3},
	            {4, 2, 2},
	            {2, 5, 6}
	        };

	        int targetNumber = 5;

	        int occurrences = countOccurrences(matrix, targetNumber);

	        System.out.println("Occurrences of " + targetNumber + ": " + occurrences);
	    
	}

}
