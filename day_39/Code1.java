package day_39;

import java.util.Arrays;

public class Code1 {
	    public static int[] plusOne(int[] digits) {
	        int n = digits.length;

	        // Iterate from right to left
	        for (int i = n - 1; i >= 0; i--) {
	            // Increment the last digit
	            digits[i]++;

	            // If the digit becomes 10, set it to 0 and continue to the next digit
	            if (digits[i] == 10) {
	                digits[i] = 0;
	            } else {
	                // If no carry, we are done
	                return digits;
	            }
	        }

	        // If we reach here, all digits were 9, and we need to add a new leading digit
	        int[] result = new int[n + 1];
	        result[0] = 1;

	        return result;
	    }

	    public static void main(String[] args) {
	        // Example 1
	        int[] digits1 = {1, 2, 3};
	        int[] result1 = plusOne(digits1);
	        System.out.println("Result 1: " + Arrays.toString(result1));

	        // Example 2
	        int[] digits2 = {9, 9, 9};
	        int[] result2 = plusOne(digits2);
	        System.out.println("Result 2: " + Arrays.toString(result2));
	    
	}

}
