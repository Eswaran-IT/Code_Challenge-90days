package day_43;

import java.util.Arrays;

public class Code3 {
    public static class Solution {
        public static int findMin(int[] nums) {
            Arrays.sort(nums);
            return nums[0];
        }
    }

    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int min = Solution.findMin(nums);
        System.out.println("Minimum element: " + min);
    }
}
