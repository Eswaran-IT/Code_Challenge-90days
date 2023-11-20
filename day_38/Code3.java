package day_38;

public class Code3 {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example 1
        int[] nums1 = {3, 3, 4};
        int result1 = solution.majorityElement(nums1);
        System.out.println("Example 1 - Result: " + result1);

        // Example 2
        int[] nums2 = {2, 2, 1, 1, 1, 2, 2};
        int result2 = solution.majorityElement(nums2);
        System.out.println("Example 2 - Result: " + result2);
    }

    static class Solution {
        public int majorityElement(int[] nums) {
            int candidate = nums[0];
            int count = 1;

            for (int i = 1; i < nums.length; i++) {
                if (count == 0) {
                    candidate = nums[i];
                    count = 1;
                } else if (nums[i] == candidate) {
                    count++;
                } else {
                    count--;
                }
            }

            return candidate;
        }
    }
}
