package day_43;

public class Code5 {
    static class Solution {
        public int findPeakElement(int[] nums) {
            int left = 0;
            int right = nums.length - 1;

            while (left < right) {
                int mid = left + (right - left) / 2;

                if (nums[mid] < nums[mid + 1]) {
                    left = mid + 1;
                } else {
                    right = mid;
                }
            }

            return left;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums1 = {1, 2, 3, 1};
        int peakIndex1 = solution.findPeakElement(nums1);
        System.out.println("Peak element index 1: " + peakIndex1);
        int[] nums2 = {1, 2, 1, 3, 5, 6, 4};
        int peakIndex2 = solution.findPeakElement(nums2);
        System.out.println("Peak element index 2: " + peakIndex2);
    }
}
