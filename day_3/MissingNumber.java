package day_3;

public class MissingNumber {
	 public static int findMissingNumber(int[] nums) {
	        int n = nums.length + 1; 
	        int expectedSum = n * (n + 1) / 2; 
	        int actualSum = 0;
	        for (int num : nums) {
	            actualSum += num;
	        }
	        
	        return expectedSum - actualSum;
	    }

	    public static void main(String[] args) {
	        int[] inputArray = {1, 3,4, 5, 6};
	        int missingNumber = findMissingNumber(inputArray);
	        System.out.println("The missing number is: " + missingNumber);
	    }

}
