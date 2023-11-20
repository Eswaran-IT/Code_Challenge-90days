package day_38;

public class Code5 {
	    public static void main(String[] args) {
	        int[] nums1 = {0, 1, 0, 3, 12};
	        moveZeroes(nums1);
	        printArray(nums1);

	        int[] nums2 = {0};
	        moveZeroes(nums2);
	        printArray(nums2);
	    }

	    private static void moveZeroes(int[] nums) {
	        int nonZeroIndex = 0;
	        for (int i = 0; i < nums.length; i++) {
	            if (nums[i] != 0) {
	                nums[nonZeroIndex] = nums[i];
	                nonZeroIndex++;
	            }
	        }
	        for (int i = nonZeroIndex; i < nums.length; i++) {
	            nums[i] = 0;
	        }
	    }

	    private static void printArray(int[] nums) {
	        System.out.print("[");
	        for (int i = 0; i < nums.length; i++) {
	            System.out.print(nums[i]);
	            if (i < nums.length - 1) {
	                System.out.print(", ");
	            }
	        }
	        System.out.println("]");
	    }
	}
