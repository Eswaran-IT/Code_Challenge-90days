package day_49;

public class Code4 {
	    public static int maxSumSubarray(int[] nums, int k) {
	        int maxSum = 0;
	        int currentSum = 0;
	        for (int i = 0; i < k; i++) {
	            currentSum += nums[i];
	        }

	        maxSum = currentSum;
	        for (int i = k; i < nums.length; i++) {
	            currentSum = currentSum - nums[i - k] + nums[i];
	            maxSum = Math.max(maxSum, currentSum);
	        }

	        return maxSum;
	    }

	    public static void main(String[] args) {
	        int[] nums = {1, 4, 2, 10, 2, 3, 1, 0, 20};
	        int k = 3;
	        int result = maxSumSubarray(nums, k);
	        System.out.println("Maximum sum of a subarray of size " + k + ": " + result);
	   
	

}
}
